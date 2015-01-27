grammar Ep;

options {
	superClass = EpANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;
}

@lexer::members {
	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
	
	public void reportError(RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
	}
}
@header{
	package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;
	
	import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.runtime3_4_0.ANTLRInputStream;
import org.antlr.runtime3_4_0.BitSet;
import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.CommonTokenStream;
import org.antlr.runtime3_4_0.IntStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
}

@members{
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolverFactory tokenResolverFactory = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> expectedElements = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected List<RecognitionException> lexerExceptions = Collections.synchronizedList(new ArrayList<RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected List<Integer> lexerExceptionPositions = Collections.synchronizedList(new ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	List<EObject> incompleteObjects = new ArrayList<EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap;
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpSyntaxErrorMessageConverter syntaxErrorMessageConverter = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpSyntaxErrorMessageConverter(tokenNames);
	
	@Override
	public void reportError(RecognitionException re) {
		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
	}
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>() {
			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpProblem() {
					public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity getSeverity() {
						return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity.ERROR;
					}
					public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType getType() {
						return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	protected void addErrorToResource(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpLocalizedMessage message) {
		if (message == null) {
			return;
		}
		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
	}
	
	public void addExpectedElement(EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement terminal = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpFollowSetProvider.TERMINALS[terminalID];
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[] containmentFeatures = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpFollowSetProvider.LINKS[ids[i]];
		}
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainmentTrace(eClass, containmentFeatures);
		EObject container = getLastIncompleteElement();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
			this.expectedElementsIndexOfLastCompleteElement = 0;
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(EObject element) {
	}
	
	protected void copyLocalizationInfos(final EObject source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>() {
			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource) {
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final CommonToken source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>() {
			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource) {
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>() {
			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource) {
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextParser createInstance(InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new EpParser(new CommonTokenStream(new EpLexer(new ANTLRInputStream(actualInputStream))));
			} else {
				return new EpParser(new CommonTokenStream(new EpLexer(new ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (IOException e) {
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public EpParser() {
		super(null);
	}
	
	protected EObject doParse() throws RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((EpLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((EpLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass) typeObject;
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan();
			}
			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat.class) {
				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat();
			}
		}
		throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(IntStream arg0, RecognitionException arg1, int arg2, BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpParseResult parse() {
		// Reset parser state
		terminateParsing = false;
		postParseCommands = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource>>();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpParseResult parseResult = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpParseResult();
		if (disableLocationMap) {
			locationMap = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpDevNullLocationMap();
		} else {
			locationMap = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpLocationMap();
		}
		// Run parser
		try {
			EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
				parseResult.setLocationMap(locationMap);
			}
		} catch (RecognitionException re) {
			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
		} catch (IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (RecognitionException re : lexerExceptions) {
			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> parseToExpectedElements(EClass type, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpParseResult result = parse();
		for (EObject incompleteObject : incompleteObjects) {
			Lexer lexer = (Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		Set<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> currentFollowSet = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>();
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal> newFollowSet = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 77;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			CommonToken nextToken = (CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContainedFeature[]> newFollowerPair : newFollowers) {
							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpExpectedElement newFollower = newFollowerPair.getLeft();
							EObject container = getLastIncompleteElement();
							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpContainmentTrace(null, newFollowerPair.getRight());
							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal newFollowTerminal = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			CommonToken tokenAtIndex = (CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof EObject) {
			this.incompleteObjects.add((EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
		}
		if (object instanceof EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement element = null]
@init{
}
:
	a0 = 'Ernaehrungsplan' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[1]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[2]);
	}
	
	(
		(
			a2_0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
					startIncompleteElement(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__PERSON_ELEMENT, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[6]);
	}
	
	(
		(
			a3_0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__ZUTAT_ELEMENT, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[10]);
	}
	
	(
		(
			a4_0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
					startIncompleteElement(element);
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						Object value = a4_0;
						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__GERICHT_ELEMENT, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_4, a4_0, true);
					copyLocalizationInfos(a4_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[12]);
	}
	
	(
		(
			a5_0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
					startIncompleteElement(element);
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						Object value = a5_0;
						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__EPLAN_ELEMENT, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_5, a5_0, true);
					copyLocalizationInfos(a5_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[14]);
	}
	
	a6 = '}' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person element = null]
@init{
}
:
	a0 = 'Person' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[15]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[16]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[17]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[19]);
	}
	
	(
		(
			a4 = INTEGER			
			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
					tokenResolver.setOptions(getOptions());
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
					}
					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_4, resolved, true);
					copyLocalizationInfos((CommonToken) a4, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[20]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[24]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil element = null]
@init{
}
:
	a0 = 'Hauptbestandteil' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[25]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[26]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[27]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[29]);
	}
	
	(
		(
			a4 = INTEGER			
			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
					tokenResolver.setOptions(getOptions());
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
					}
					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_4, resolved, true);
					copyLocalizationInfos((CommonToken) a4, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[30]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[34]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage element = null]
@init{
}
:
	a0 = 'Beilage' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[35]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[36]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[37]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[39]);
	}
	
	(
		(
			a4 = INTEGER			
			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
					tokenResolver.setOptions(getOptions());
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
					}
					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_4, resolved, true);
					copyLocalizationInfos((CommonToken) a4, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[40]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[44]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce element = null]
@init{
}
:
	a0 = 'Sauce' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[45]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[46]);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[47]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[49]);
	}
	
	(
		(
			a4 = INTEGER			
			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
					startIncompleteElement(element);
				}
				if (a4 != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
					tokenResolver.setOptions(getOptions());
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
					}
					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_4, resolved, true);
					copyLocalizationInfos((CommonToken) a4, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[50]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[51]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[53]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[54]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht element = null]
@init{
}
:
	a0 = 'Gericht' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[55]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[56]);
	}
	
	a2 = 'name' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[57]);
	}
	
	(
		a3 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_3, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[58]);
	}
	
	a4 = 'kommentar' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[59]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[60]);
	}
	
	(
		(
			a5 = QUOTED_34_34			
			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
					startIncompleteElement(element);
				}
				if (a5 != null) {
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					tokenResolver.setOptions(getOptions());
					de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_5, resolved, true);
					copyLocalizationInfos((CommonToken) a5, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[61]);
	}
	
	a6 = 'istSalat' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[63]);
	}
	
	(
		(
			(
				a7 = 'ja' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, true, true);
					copyLocalizationInfos((CommonToken)a7, element);
					// set value of boolean attribute
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__IST_SALAT), value);
					completedElement(value, false);
				}
				|				a8 = 'nein' {
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
						startIncompleteElement(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, false, true);
					copyLocalizationInfos((CommonToken)a8, element);
					// set value of boolean attribute
					Object value = false;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__IST_SALAT), value);
					completedElement(value, false);
				}
			)
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[64]);
	}
	
	a10 = 'besteht aus' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_8, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[65]);
	}
	
	a11 = '{' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[66]);
	}
	
	(
		(
			a12_0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat			{
				if (terminateParsing) {
					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
				}
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
					startIncompleteElement(element);
				}
				if (a12_0 != null) {
					if (a12_0 != null) {
						Object value = a12_0;
						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__ZUTATEN, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_10, a12_0, true);
					copyLocalizationInfos(a12_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[67]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[68]);
	}
	
	a13 = '}' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_11, null, true);
		copyLocalizationInfos((CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[69]);
	}
	
	a14 = '}' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_12, null, true);
		copyLocalizationInfos((CommonToken)a14, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[70]);
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[71]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan element = null]
@init{
}
:
	a0 = 'eplan' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[72]);
	}
	
	a1 = '{' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[73]);
	}
	
	a2 = 'person' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[74]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[75]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_4, proxy, true);
				copyLocalizationInfos((CommonToken) a4, element);
				copyLocalizationInfos((CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[76]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[77]);
	}
	
	a6 = 'gerichte' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[78]);
	}
	
	a7 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[79]);
	}
	
	(
		a8 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_8, proxy, true);
				copyLocalizationInfos((CommonToken) a8, element);
				copyLocalizationInfos((CommonToken) a8, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[80]);
	}
	
	a9 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[81]);
	}
	
	(
		a10 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a10 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a10).getLine(), ((CommonToken) a10).getCharPositionInLine(), ((CommonToken) a10).getStartIndex(), ((CommonToken) a10).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_10, proxy, true);
				copyLocalizationInfos((CommonToken) a10, element);
				copyLocalizationInfos((CommonToken) a10, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[82]);
	}
	
	a11 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_11, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[83]);
	}
	
	(
		a12 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a12 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a12).getLine(), ((CommonToken) a12).getCharPositionInLine(), ((CommonToken) a12).getStartIndex(), ((CommonToken) a12).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_12, proxy, true);
				copyLocalizationInfos((CommonToken) a12, element);
				copyLocalizationInfos((CommonToken) a12, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[84]);
	}
	
	a13 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_13, null, true);
		copyLocalizationInfos((CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[85]);
	}
	
	(
		a14 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a14 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a14).getLine(), ((CommonToken) a14).getCharPositionInLine(), ((CommonToken) a14).getStartIndex(), ((CommonToken) a14).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_14, proxy, true);
				copyLocalizationInfos((CommonToken) a14, element);
				copyLocalizationInfos((CommonToken) a14, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[86]);
	}
	
	a15 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_15, null, true);
		copyLocalizationInfos((CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[87]);
	}
	
	(
		a16 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a16 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a16).getLine(), ((CommonToken) a16).getCharPositionInLine(), ((CommonToken) a16).getStartIndex(), ((CommonToken) a16).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_16, proxy, true);
				copyLocalizationInfos((CommonToken) a16, element);
				copyLocalizationInfos((CommonToken) a16, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[88]);
	}
	
	a17 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_17, null, true);
		copyLocalizationInfos((CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[89]);
	}
	
	(
		a18 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
				startIncompleteElement(element);
			}
			if (a18 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a18.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a18).getLine(), ((CommonToken) a18).getCharPositionInLine(), ((CommonToken) a18).getStartIndex(), ((CommonToken) a18).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_18, proxy, true);
				copyLocalizationInfos((CommonToken) a18, element);
				copyLocalizationInfos((CommonToken) a18, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[90]);
	}
	
	(
		(
			a19 = ',' {
				if (element == null) {
					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_19_0_0_0, null, true);
				copyLocalizationInfos((CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[91]);
			}
			
			(
				a20 = TEXT				
				{
					if (terminateParsing) {
						throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
					}
					if (element == null) {
						element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
						startIncompleteElement(element);
					}
					if (a20 != null) {
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a20).getLine(), ((CommonToken) a20).getCharPositionInLine(), ((CommonToken) a20).getStartIndex(), ((CommonToken) a20).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
						collectHiddenTokens(element);
						registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_19_0_0_1, proxy, true);
						copyLocalizationInfos((CommonToken) a20, element);
						copyLocalizationInfos((CommonToken) a20, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[92]);
				addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[93]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[94]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[95]);
	}
	
	a21 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_20, null, true);
		copyLocalizationInfos((CommonToken)a21, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[96]);
	}
	
	a22 = '}' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_21, null, true);
		copyLocalizationInfos((CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[97]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[98]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat element = null]
@init{
}
:
	a0 = 'zutat' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[99]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[100]);
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_2, resolved, true);
				copyLocalizationInfos((CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[101]);
	}
	
	a3 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[102]);
	}
	
	(
		a4 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
				startIncompleteElement(element);
			}
			if (a4 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatZutatReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_4, proxy, true);
				copyLocalizationInfos((CommonToken) a4, element);
				copyLocalizationInfos((CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[103]);
	}
	
	a5 = ',' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[104]);
	}
	
	(
		a6 = TEXT		
		{
			if (terminateParsing) {
				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTerminateParsingException();
			}
			if (element == null) {
				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
				startIncompleteElement(element);
			}
			if (a6 != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
				collectHiddenTokens(element);
				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatGerichtReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_6, proxy, true);
				copyLocalizationInfos((CommonToken) a6, element);
				copyLocalizationInfos((CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[105]);
	}
	
	a7 = ')' {
		if (element == null) {
			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[106]);
		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[107]);
	}
	
;

parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat element = null]
:
	c0 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

TEXT:
	(('A'..'Z'|'a'..'z'|'_'|'-')+)
;
LINEBREAK:
	(('\r\n'|'\r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;
INTEGER:
	(('0'..'9')+)
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

