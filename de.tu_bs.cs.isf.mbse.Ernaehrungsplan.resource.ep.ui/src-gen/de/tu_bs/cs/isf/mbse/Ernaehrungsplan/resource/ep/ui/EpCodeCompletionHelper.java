/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A CodeCompletionHelper can be used to derive completion proposals for partial
 * documents. It runs the parser generated by EMFText in a special mode (i.e., the
 * rememberExpectedElements mode). Based on the elements that are expected by the
 * parser for different regions in the document, valid proposals are computed.
 */
public class EpCodeCompletionHelper {
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpAttributeValueProvider attributeValueProvider = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpAttributeValueProvider();
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpMetaInformation metaInformation = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation();
	
	/**
	 * <p>
	 * Computes a set of proposals for the given document assuming the cursor is at
	 * 'cursorOffset'. The proposals are derived using the meta information, i.e., the
	 * generated language plug-in.
	 * </p>
	 * 
	 * @param originalResource the resource to compute completions for
	 * @param content the documents content
	 * @param cursorOffset the current offset of the cursor
	 * 
	 * @return an array of completion proposals
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal[] computeCompletionProposals(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource originalResource, String content, int cursorOffset) {
		ResourceSet resourceSet = new ResourceSetImpl();
		// the shadow resource needs the same URI because reference resolvers may use the
		// URI to resolve external references
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource) resourceSet.createResource(originalResource.getURI());
		ByteArrayInputStream inputStream = new ByteArrayInputStream(content.getBytes());
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpMetaInformation metaInformation = resource.getMetaInformation();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextParser parser = metaInformation.createParser(inputStream, null);
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[] expectedElements = parseToExpectedElements(parser, resource, cursorOffset);
		if (expectedElements == null) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal[0];
		}
		if (expectedElements.length == 0) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal[0];
		}
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedAfterCursor = Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset));
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedBeforeCursor = Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset - 1));
		setPrefixes(expectedAfterCursor, content, cursorOffset);
		setPrefixes(expectedBeforeCursor, content, cursorOffset);
		
		// First, we derive all possible proposals from the set of elements that are
		// expected at the cursor position.
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> allProposals = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> rightProposals = deriveProposals(expectedAfterCursor, content, resource, cursorOffset);
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> leftProposals = deriveProposals(expectedBeforeCursor, content, resource, cursorOffset - 1);
		removeKeywordsEndingBeforeIndex(leftProposals, cursorOffset);
		
		// Second, the set of left proposals (i.e., the ones before the cursor) is checked
		// for emptiness. If the set is empty, the right proposals (i.e., the ones after
		// the cursor) are also considered. If the set is not empty, the right proposal
		// are discarded, because it does not make sense to propose them until the element
		// before the cursor was completed.
		allProposals.addAll(leftProposals);
		// Count the proposals before the cursor that match the prefix
		int leftMatchingProposals = 0;
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal leftProposal : leftProposals) {
			if (leftProposal.isMatchesPrefix()) {
				leftMatchingProposals++;
			}
		}
		if (leftMatchingProposals == 0) {
			allProposals.addAll(rightProposals);
		}
		
		// Third, the proposals are sorted according to their relevance. Proposals that
		// matched the prefix are preferred over ones that did not. Finally, proposals are
		// sorted alphabetically.
		final List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> sortedProposals = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>(allProposals);
		Collections.sort(sortedProposals);
		EObject root = null;
		if (!resource.getContents().isEmpty()) {
			root = resource.getContents().get(0);
		}
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal proposal : sortedProposals) {
			proposal.setRoot(root);
		}
		
		return sortedProposals.toArray(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal[sortedProposals.size()]);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[] parseToExpectedElements(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextParser parser, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, int cursorOffset) {
		final List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements = parser.parseToExpectedElements(null, resource, cursorOffset);
		if (expectedElements == null) {
			return new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[0];
		}
		removeDuplicateEntries(expectedElements);
		removeInvalidEntriesAtEnd(expectedElements);
		return expectedElements.toArray(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[expectedElements.size()]);
	}
	
	/**
	 * Removes all expected elements that refer to the same terminal and that start at
	 * the same position.
	 */
	protected void removeDuplicateEntries(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements) {
		int size = expectedElements.size();
		// We split the list of expected elements into buckets where each bucket contains
		// the elements that start at the same position.
		Map<Integer, List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>> map = new LinkedHashMap<Integer, List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>>();
		for (int i = 0; i < size; i++) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtIndex = expectedElements.get(i);
			int start1 = elementAtIndex.getStartExcludingHiddenTokens();
			List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> list = map.get(start1);
			if (list == null) {
				list = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>();
				map.put(start1, list);
			}
			list.add(elementAtIndex);
		}
		
		// Then, we remove all duplicate elements from each bucket individually.
		for (int position : map.keySet()) {
			List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> list = map.get(position);
			removeDuplicateEntriesFromBucket(list);
		}
		
		// After removing all duplicates, we merge the buckets.
		expectedElements.clear();
		for (int position : map.keySet()) {
			List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> list = map.get(position);
			expectedElements.addAll(list);
		}
	}
	
	/**
	 * Removes all expected elements that refer to the same terminal. Attention: This
	 * method assumes that the given list of expected terminals contains only elements
	 * that start at the same position.
	 */
	protected void removeDuplicateEntriesFromBucket(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements) {
		int size = expectedElements.size();
		for (int i = 0; i < size - 1; i++) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtIndex = expectedElements.get(i);
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement terminal = elementAtIndex.getTerminal();
			for (int j = i + 1; j < size;) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtNext = expectedElements.get(j);
				if (terminal.equals(elementAtNext.getTerminal())) {
					expectedElements.remove(j);
					size--;
				} else {
					j++;
				}
			}
		}
	}
	
	protected void removeInvalidEntriesAtEnd(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements) {
		for (int i = 0; i < expectedElements.size() - 1;) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtIndex = expectedElements.get(i);
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtNext = expectedElements.get(i + 1);
			
			// If the two expected elements have a different parent in the syntax definition,
			// we must not discard the second element, because it probably stems from a parent
			// rule.
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement symtaxElementOfThis = elementAtIndex.getTerminal().getSymtaxElement();
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpSyntaxElement symtaxElementOfNext = elementAtNext.getTerminal().getSymtaxElement();
			boolean differentParent = symtaxElementOfNext.getParent() != symtaxElementOfThis.getParent();
			
			boolean sameStartExcludingHiddenTokens = elementAtIndex.getStartExcludingHiddenTokens() == elementAtNext.getStartExcludingHiddenTokens();
			boolean differentFollowSet = elementAtIndex.getFollowSetID() != elementAtNext.getFollowSetID();
			if (sameStartExcludingHiddenTokens && differentFollowSet && !differentParent) {
				expectedElements.remove(i + 1);
			} else {
				i++;
			}
		}
	}
	
	/**
	 * Removes all proposals for keywords that end before the given index.
	 */
	protected void removeKeywordsEndingBeforeIndex(Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> proposals, int index) {
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> toRemove = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal proposal : proposals) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal = proposal.getExpectedTerminal();
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement terminal = expectedTerminal.getTerminal();
			if (terminal instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString csString = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString) terminal;
				int startExcludingHiddenTokens = expectedTerminal.getStartExcludingHiddenTokens();
				if (startExcludingHiddenTokens + csString.getValue().length() - 1 < index) {
					toRemove.add(proposal);
				}
			}
		}
		proposals.removeAll(toRemove);
	}
	
	protected String findPrefix(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedAtCursor, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return "";
		}
		
		int end = 0;
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement : expectedElements) {
			if (expectedElement == expectedAtCursor) {
				final int start = expectedElement.getStartExcludingHiddenTokens();
				if (start >= 0  && start < Integer.MAX_VALUE) {
					end = start;
				}
				break;
			}
		}
		end = Math.min(end, cursorOffset);
		final String prefix = content.substring(end, Math.min(content.length(), cursorOffset));
		return prefix;
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> deriveProposals(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements, String content, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, int cursorOffset) {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> resultSet = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement : expectedElements) {
			resultSet.addAll(deriveProposals(expectedElement, content, resource, cursorOffset));
		}
		return resultSet;
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> deriveProposals(final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, String content, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, int cursorOffset) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement expectedElement = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement) expectedTerminal.getTerminal();
		if (expectedElement instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString csString = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString) expectedElement;
			return handleKeyword(expectedTerminal, csString, expectedTerminal.getPrefix(), expectedTerminal.getContainer());
		} else if (expectedElement instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedBooleanTerminal) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedBooleanTerminal expectedBooleanTerminal = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedBooleanTerminal) expectedElement;
			return handleBooleanTerminal(expectedTerminal, expectedBooleanTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedEnumerationTerminal) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedEnumerationTerminal expectedEnumerationTerminal = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedEnumerationTerminal) expectedElement;
			return handleEnumerationTerminal(expectedTerminal, expectedEnumerationTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedStructuralFeature) {
			final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedStructuralFeature expectedFeature = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedStructuralFeature) expectedElement;
			final EStructuralFeature feature = expectedFeature.getFeature();
			final EClassifier featureType = feature.getEType();
			final EObject container = findCorrectContainer(expectedTerminal);
			
			// Here it gets really crazy. We need to modify the model in a way that reflects
			// the state the model would be in, if the expected terminal were present. After
			// computing the corresponding completion proposals, the original state of the
			// model is restored. This procedure is required, because different models can be
			// required for different completion situations. This can be particularly observed
			// when the user has not yet typed a character that starts an element to be
			// completed.
			final Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> proposals = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
			expectedTerminal.materialize(new Runnable() {
				
				public void run() {
					if (feature instanceof EReference) {
						EReference reference = (EReference) feature;
						if (featureType instanceof EClass) {
							if (reference.isContainment()) {
								// the FOLLOW set should contain only non-containment references
								assert false;
							} else {
								proposals.addAll(handleNCReference(expectedTerminal, container, reference, expectedTerminal.getPrefix(), expectedFeature.getTokenName()));
							}
						}
					} else if (feature instanceof EAttribute) {
						EAttribute attribute = (EAttribute) feature;
						if (featureType instanceof EEnum) {
							EEnum enumType = (EEnum) featureType;
							proposals.addAll(handleEnumAttribute(expectedTerminal, expectedFeature, enumType, expectedTerminal.getPrefix(), container));
						} else {
							// handle EAttributes (derive default value depending on the type of the
							// attribute, figure out token resolver, and call deResolve())
							proposals.addAll(handleAttribute(expectedTerminal, expectedFeature, container, attribute, expectedTerminal.getPrefix()));
						}
					} else {
						// there should be no other subclass of EStructuralFeature
						assert false;
					}
				}
			});
			// Return the proposals that were computed in the closure call.
			return proposals;
		} else {
			// there should be no other class implementing IExpectedElement
			assert false;
		}
		return Collections.emptyList();
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleEnumAttribute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedStructuralFeature expectedFeature, EEnum enumType, String prefix, EObject container) {
		Collection<EEnumLiteral> enumLiterals = enumType.getELiterals();
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> result = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
		for (EEnumLiteral literal : enumLiterals) {
			String unResolvedLiteral = literal.getLiteral();
			// use token resolver to get de-resolved value of the literal
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(expectedFeature.getTokenName());
			String resolvedLiteral = tokenResolver.deResolve(unResolvedLiteral, expectedFeature.getFeature(), container);
			boolean matchesPrefix = matches(resolvedLiteral, prefix);
			result.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal(expectedTerminal, resolvedLiteral, prefix, matchesPrefix, expectedFeature.getFeature(), container));
		}
		return result;
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleNCReference(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, EObject container, EReference reference, String prefix, String tokenName) {
		// proposals for non-containment references are derived by calling the reference
		// resolver switch in fuzzy mode.
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolverSwitch resolverSwitch = metaInformation.getReferenceResolverSwitch();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceResolveResult<EObject> result = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpReferenceResolveResult<EObject>(true);
		resolverSwitch.resolveFuzzy(prefix, container, reference, 0, result);
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<EObject>> mappings = result.getMappings();
		if (mappings != null) {
			Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> resultSet = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
			for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpReferenceMapping<EObject> mapping : mappings) {
				Image image = null;
				if (mapping instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpElementMapping<?>) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpElementMapping<?> elementMapping = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpElementMapping<?>) mapping;
					Object target = elementMapping.getTargetElement();
					// de-resolve reference to obtain correct identifier
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
					final String identifier = tokenResolver.deResolve(elementMapping.getIdentifier(), reference, container);
					if (target instanceof EObject) {
						image = getImage((EObject) target);
					}
					boolean matchesPrefix = matches(identifier, prefix);
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal proposal = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal(expectedTerminal, identifier, prefix, matchesPrefix, reference, container, image);
					proposal.setReferenceTarget(target);
					resultSet.add(proposal);
				}
			}
			return resultSet;
		}
		return Collections.emptyList();
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleAttribute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedStructuralFeature expectedFeature, EObject container, EAttribute attribute, String prefix) {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> resultSet = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>();
		Object[] defaultValues = attributeValueProvider.getDefaultValues(attribute);
		if (defaultValues != null) {
			for (Object defaultValue : defaultValues) {
				if (defaultValue != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
					String tokenName = expectedFeature.getTokenName();
					if (tokenName != null) {
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
						if (tokenResolver != null) {
							String defaultValueAsString = tokenResolver.deResolve(defaultValue, attribute, container);
							boolean matchesPrefix = matches(defaultValueAsString, prefix);
							resultSet.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal(expectedTerminal, defaultValueAsString, prefix, matchesPrefix, expectedFeature.getFeature(), container));
						}
					}
				}
			}
		}
		return resultSet;
	}
	
	/**
	 * Creates a set of completion proposals from the given keyword.
	 */
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleKeyword(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedCsString csString, String prefix, EObject container) {
		String proposal = csString.getValue();
		boolean matchesPrefix = matches(proposal, prefix);
		return Collections.singleton(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal(expectedTerminal, proposal, prefix, matchesPrefix, null, container));
	}
	
	/**
	 * Creates a set of (two) completion proposals from the given boolean terminal.
	 */
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleBooleanTerminal(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedBooleanTerminal expectedBooleanTerminal, String prefix) {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> result = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>(2);
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpBooleanTerminal booleanTerminal = expectedBooleanTerminal.getBooleanTerminal();
		result.addAll(handleLiteral(expectedTerminal, booleanTerminal.getAttribute(), prefix, booleanTerminal.getTrueLiteral()));
		result.addAll(handleLiteral(expectedTerminal, booleanTerminal.getAttribute(), prefix, booleanTerminal.getFalseLiteral()));
		return result;
	}
	
	/**
	 * Creates a set of completion proposals from the given enumeration terminal. For
	 * each enumeration literal one proposal is created.
	 */
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleEnumerationTerminal(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedEnumerationTerminal expectedEnumerationTerminal, String prefix) {
		Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> result = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal>(2);
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpEnumerationTerminal enumerationTerminal = expectedEnumerationTerminal.getEnumerationTerminal();
		Map<String, String> literalMapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : literalMapping.keySet()) {
			result.addAll(handleLiteral(expectedTerminal, enumerationTerminal.getAttribute(), prefix, literalMapping.get(literalName)));
		}
		return result;
	}
	
	protected Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal> handleLiteral(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal, EAttribute attribute, String prefix, String literal) {
		if ("".equals(literal)) {
			return Collections.emptySet();
		}
		boolean matchesPrefix = matches(literal, prefix);
		return Collections.singleton(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpCompletionProposal(expectedTerminal, literal, prefix, matchesPrefix, null, null));
	}
	
	/**
	 * Calculates the prefix for each given expected element. The prefix depends on
	 * the current document content, the cursor position, and the position where the
	 * element is expected.
	 */
	protected void setPrefixes(List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return;
		}
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement : expectedElements) {
			String prefix = findPrefix(expectedElements, expectedElement, content, cursorOffset);
			expectedElement.setPrefix(prefix);
		}
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[] getElementsExpectedAt(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[] allExpectedElements, int cursorOffset) {
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedAtCursor = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>();
		for (int i = 0; i < allExpectedElements.length; i++) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement = allExpectedElements[i];
			int startIncludingHidden = expectedElement.getStartIncludingHiddenTokens();
			int end = getEnd(allExpectedElements, i);
			if (cursorOffset >= startIncludingHidden && cursorOffset <= end) {
				expectedAtCursor.add(expectedElement);
			}
		}
		return expectedAtCursor.toArray(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[expectedAtCursor.size()]);
	}
	
	/**
	 * Calculates the end index of the expected element at allExpectedElements[index].
	 * To determine the end, the subsequent expected elements from the array of all
	 * expected elements are used. An element is considered to end one character
	 * before the next elements starts.
	 */
	protected int getEnd(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal[] allExpectedElements, int indexInList) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtIndex = allExpectedElements[indexInList];
		int startIncludingHidden = elementAtIndex.getStartIncludingHiddenTokens();
		int startExcludingHidden = elementAtIndex.getStartExcludingHiddenTokens();
		for (int i = indexInList + 1; i < allExpectedElements.length; i++) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal elementAtI = allExpectedElements[i];
			int startIncludingHiddenForI = elementAtI.getStartIncludingHiddenTokens();
			int startExcludingHiddenForI = elementAtI.getStartExcludingHiddenTokens();
			if (startIncludingHidden != startIncludingHiddenForI || startExcludingHidden != startExcludingHiddenForI) {
				return startIncludingHiddenForI - 1;
			}
		}
		return Integer.MAX_VALUE;
	}
	
	/**
	 * Checks whether the given proposed string matches the prefix. The two strings
	 * are compared ignoring the case. The prefix is also considered to match if is a
	 * camel case representation of the proposal.
	 */
	protected boolean matches(String proposal, String prefix) {
		if (proposal == null || prefix == null) {
			return false;
		}
		return (proposal.toLowerCase().startsWith(prefix.toLowerCase()) || de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.matchCamelCase(prefix, proposal) != null) && !proposal.equals(prefix);
	}
	
	protected Image getImage(EObject element) {
		if (!Platform.isRunning()) {
			return null;
		}
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		return labelProvider.getImage(element);
	}
	
	protected EObject findCorrectContainer(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedTerminal) {
		EObject container = expectedTerminal.getContainer();
		EClass ruleMetaclass = expectedTerminal.getTerminal().getRuleMetaclass();
		if (ruleMetaclass.isInstance(container)) {
			// container is correct for expected terminal
			return container;
		}
		// the container is wrong
		EObject parent = null;
		EObject previousParent = null;
		EObject correctContainer = null;
		EObject hookableParent = null;
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainmentTrace containmentTrace = expectedTerminal.getContainmentTrace();
		EClass startClass = containmentTrace.getStartClass();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature currentLink = null;
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature previousLink = null;
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[] containedFeatures = containmentTrace.getPath();
		for (int i = 0; i < containedFeatures.length; i++) {
			currentLink = containedFeatures[i];
			if (i > 0) {
				previousLink = containedFeatures[i - 1];
			}
			EClass containerClass = currentLink.getContainerClass();
			hookableParent = findHookParent(container, startClass, currentLink, parent);
			if (hookableParent != null) {
				// we found the correct parent
				break;
			} else {
				previousParent = parent;
				parent = containerClass.getEPackage().getEFactoryInstance().create(containerClass);
				if (parent != null) {
					if (previousParent == null) {
						// replace container for expectedTerminal with correctContainer
						correctContainer = parent;
					} else {
						// This assignment is only performed to get rid of a warning about a potential
						// null pointer access. Variable 'previousLink' cannot be null here, because it is
						// initialized for all loop iterations where 'i' is greather than 0 and for the
						// case where 'i' equals zero, this path is never executed, because
						// 'previousParent' is null in this case.
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature link = previousLink;
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpEObjectUtil.setFeature(parent, link.getFeature(), previousParent, false);
					}
				}
			}
		}
		
		if (correctContainer == null) {
			correctContainer = container;
		}
		
		if (currentLink == null) {
			return correctContainer;
		}
		
		hookableParent = findHookParent(container, startClass, currentLink, parent);
		
		final EObject finalHookableParent = hookableParent;
		final EStructuralFeature finalFeature = currentLink.getFeature();
		final EObject finalParent = parent;
		if (parent != null && hookableParent != null) {
			expectedTerminal.setAttachmentCode(new Runnable() {
				
				public void run() {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpEObjectUtil.setFeature(finalHookableParent, finalFeature, finalParent, false);
				}
			});
		}
		return correctContainer;
	}
	
	/**
	 * Walks up the containment hierarchy to find an EObject that is able to hold
	 * (contain) the given object.
	 */
	protected EObject findHookParent(EObject container, EClass startClass, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature currentLink, EObject object) {
		EClass containerClass = currentLink.getContainerClass();
		while (container != null) {
			if (containerClass.isInstance(object)) {
				if (startClass.equals(container.eClass())) {
					return container;
				}
			}
			container = container.eContainer();
		}
		return null;
	}
	
}
