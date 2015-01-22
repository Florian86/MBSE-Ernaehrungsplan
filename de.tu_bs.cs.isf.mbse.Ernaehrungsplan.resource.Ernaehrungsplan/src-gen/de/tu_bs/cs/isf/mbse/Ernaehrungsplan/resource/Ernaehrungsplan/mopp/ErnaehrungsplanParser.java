// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;
	
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


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ErnaehrungsplanParser extends ErnaehrungsplanANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "TEXT", "WHITESPACE", "';'", "'abstract'", "'att'", "'cont'", "'datatype'", "'entity'", "'model'", "'ref'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int LINEBREAK=4;
    public static final int TEXT=5;
    public static final int WHITESPACE=6;

    // delegates
    public ErnaehrungsplanANTLRParserBase[] getDelegates() {
        return new ErnaehrungsplanANTLRParserBase[] {};
    }

    // delegators


    public ErnaehrungsplanParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ErnaehrungsplanParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(12 + 1);
         

    }

    public String[] getTokenNames() { return ErnaehrungsplanParser.tokenNames; }
    public String getGrammarFileName() { return "Ernaehrungsplan.g"; }


    	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolverFactory tokenResolverFactory = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTokenResolverFactory();
    	
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
    	private List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal> expectedElements = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal>();
    	
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
    	
    	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanLocationMap locationMap;
    	
    	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanSyntaxErrorMessageConverter syntaxErrorMessageConverter = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanSyntaxErrorMessageConverter(tokenNames);
    	
    	@Override
    	public void reportError(RecognitionException re) {
    		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    	}
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanProblem() {
    					public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemSeverity getSeverity() {
    						return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemSeverity.ERROR;
    					}
    					public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemType getType() {
    						return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.ErnaehrungsplanEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	protected void addErrorToResource(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanLocalizedMessage message) {
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
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanExpectedElement terminal = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanFollowSetProvider.TERMINALS[terminalID];
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanContainedFeature[] containmentFeatures = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanFollowSetProvider.LINKS[ids[i]];
    		}
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanContainmentTrace(eClass, containmentFeatures);
    		EObject container = getLastIncompleteElement();
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal expectedElement = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource resource) {
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
    		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource resource) {
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
    	protected void setLocalizationEnd(Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>() {
    			public boolean execute(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource resource) {
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextParser createInstance(InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new ErnaehrungsplanParser(new CommonTokenStream(new ErnaehrungsplanLexer(new ANTLRInputStream(actualInputStream))));
    			} else {
    				return new ErnaehrungsplanParser(new CommonTokenStream(new ErnaehrungsplanLexer(new ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (IOException e) {
    			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public ErnaehrungsplanParser() {
    		super(null);
    	}
    	
    	protected EObject doParse() throws RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((ErnaehrungsplanLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((ErnaehrungsplanLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof EClass) {
    			EClass type = (EClass) typeObject;
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType();
    			}
    			if (type.getInstanceClass() == de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature.class) {
    				return parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature();
    			}
    		}
    		throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanParseResult parse() {
    		// Reset parser state
    		terminateParsing = false;
    		postParseCommands = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource>>();
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanParseResult parseResult = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanParseResult();
    		if (disableLocationMap) {
    			locationMap = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanDevNullLocationMap();
    		} else {
    			locationMap = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanLocationMap();
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
    	
    	public List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal> parseToExpectedElements(EClass type, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
    		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanParseResult result = parse();
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
    			for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanCommand<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		Set<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal> currentFollowSet = new LinkedHashSet<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal>();
    		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal> newFollowSet = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 16;
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
    				for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						Collection<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanExpectedElement, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanContainedFeature[]> newFollowerPair : newFollowers) {
    							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanExpectedElement newFollower = newFollowerPair.getLeft();
    							EObject container = getLastIncompleteElement();
    							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanContainmentTrace containmentTrace = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanContainmentTrace(null, newFollowerPair.getRight());
    							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal newFollowTerminal = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectedTerminal expectedElement, int tokenIndex) {
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
    	



    // $ANTLR start "start"
    // Ernaehrungsplan.g:490:1: start returns [ EObject element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Ernaehrungsplan.g:491:2: ( (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel ) EOF )
            // Ernaehrungsplan.g:492:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Ernaehrungsplan.g:497:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel )
            // Ernaehrungsplan.g:498:3: c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel_in_start82);
            c0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel"
    // Ernaehrungsplan.g:506:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel element = null] : a0= 'model' ( (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type ) )* ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel_StartIndex = input.index();

        Token a0=null;
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Ernaehrungsplan.g:509:2: (a0= 'model' ( (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type ) )* )
            // Ernaehrungsplan.g:510:2: a0= 'model' ( (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type ) )*
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntityModel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_0_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[3]);
            	}

            // Ernaehrungsplan.g:526:2: ( (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==8||(LA1_0 >= 11 && LA1_0 <= 12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ernaehrungsplan.g:527:3: (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type )
            	    {
            	    // Ernaehrungsplan.g:527:3: (a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type )
            	    // Ernaehrungsplan.g:528:4: a1_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel138);
            	    a1_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntityModel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY_MODEL__TYPES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_0_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[6]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity"
    // Ernaehrungsplan.g:558:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity element = null] : ( (a0= 'abstract' )? ) a3= 'entity' (a4= TEXT ) a5= '{' ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature ) )* a7= '}' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity_StartIndex = input.index();

        Token a0=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Ernaehrungsplan.g:561:2: ( ( (a0= 'abstract' )? ) a3= 'entity' (a4= TEXT ) a5= '{' ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature ) )* a7= '}' )
            // Ernaehrungsplan.g:562:2: ( (a0= 'abstract' )? ) a3= 'entity' (a4= TEXT ) a5= '{' ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature ) )* a7= '}'
            {
            // Ernaehrungsplan.g:562:2: ( (a0= 'abstract' )? )
            // Ernaehrungsplan.g:563:3: (a0= 'abstract' )?
            {
            // Ernaehrungsplan.g:563:3: (a0= 'abstract' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Ernaehrungsplan.g:564:4: a0= 'abstract'
                    {
                    a0=(Token)match(input,8,FOLLOW_8_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity188); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
                    					startIncompleteElement(element);
                    					// initialize boolean attribute
                    					{
                    						Object value = false;
                    						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
                    					}
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_0, true, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[7]);
            	}

            a3=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity209); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[8]);
            	}

            // Ernaehrungsplan.g:607:2: (a4= TEXT )
            // Ernaehrungsplan.g:608:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity227); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
            				startIncompleteElement(element);
            				// initialize boolean attribute
            				{
            					Object value = false;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
            				}
            			}
            			if (a4 != null) {
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a4, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[9]);
            	}

            a5=(Token)match(input,15,FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity248); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntity(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[11]);
            	}

            // Ernaehrungsplan.g:668:2: ( (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 9 && LA3_0 <= 10)||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ernaehrungsplan.g:669:3: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature )
            	    {
            	    // Ernaehrungsplan.g:669:3: (a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature )
            	    // Ernaehrungsplan.g:670:4: a6_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity271);
            	    a6_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
            	    					startIncompleteElement(element);
            	    					// initialize boolean attribute
            	    					{
            	    						Object value = false;
            	    						element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
            	    					}
            	    				}
            	    				if (a6_0 != null) {
            	    					if (a6_0 != null) {
            	    						Object value = a6_0;
            	    						addObjectToList(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__FEATURES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_4, a6_0, true);
            	    					copyLocalizationInfos(a6_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntity(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[12]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[13]);
            	}

            a7=(Token)match(input,16,FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity297); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEntity();
            			startIncompleteElement(element);
            			// initialize boolean attribute
            			{
            				Object value = false;
            				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ENTITY__ABSTRACT), value);
            			}
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_1_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[15]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[16]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType"
    // Ernaehrungsplan.g:725:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType element = null] : a0= 'datatype' (a1= TEXT ) a2= ';' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Ernaehrungsplan.g:728:2: (a0= 'datatype' (a1= TEXT ) a2= ';' )
            // Ernaehrungsplan.g:729:2: a0= 'datatype' (a1= TEXT ) a2= ';'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType326); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createDataType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_2_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[17]);
            	}

            // Ernaehrungsplan.g:743:2: (a1= TEXT )
            // Ernaehrungsplan.g:744:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType344); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createDataType();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.DATA_TYPE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.DATA_TYPE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_2_0_0_1, resolved, true);
            				copyLocalizationInfos((CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[18]);
            	}

            a2=(Token)match(input,7,FOLLOW_7_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType365); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createDataType();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_2_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntityModel(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[21]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature"
    // Ernaehrungsplan.g:797:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature element = null] : ( (a0= 'att' |a1= 'ref' |a2= 'cont' ) ) (a5= TEXT ) (a6= TEXT ) a7= ';' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Ernaehrungsplan.g:800:2: ( ( (a0= 'att' |a1= 'ref' |a2= 'cont' ) ) (a5= TEXT ) (a6= TEXT ) a7= ';' )
            // Ernaehrungsplan.g:801:2: ( (a0= 'att' |a1= 'ref' |a2= 'cont' ) ) (a5= TEXT ) (a6= TEXT ) a7= ';'
            {
            // Ernaehrungsplan.g:801:2: ( (a0= 'att' |a1= 'ref' |a2= 'cont' ) )
            // Ernaehrungsplan.g:802:3: (a0= 'att' |a1= 'ref' |a2= 'cont' )
            {
            // Ernaehrungsplan.g:802:3: (a0= 'att' |a1= 'ref' |a2= 'cont' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 10:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Ernaehrungsplan.g:803:4: a0= 'att'
                    {
                    a0=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature403); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getFeatureKind().getEEnumLiteral(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind.ATTRIBUTE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Ernaehrungsplan.g:816:8: a1= 'ref'
                    {
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature418); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getFeatureKind().getEEnumLiteral(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind.REFERENCE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Ernaehrungsplan.g:829:8: a2= 'cont'
                    {
                    a2=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature433); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_0, null, true);
                    				copyLocalizationInfos((CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getFeatureKind().getEEnumLiteral(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.FeatureKind.CONTAINMENT_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__KIND), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[22]);
            	}

            // Ernaehrungsplan.g:849:2: (a5= TEXT )
            // Ernaehrungsplan.g:850:3: a5= TEXT
            {
            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature458); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__TYPE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type proxy = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createDataType();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanContextDependentURIFragmentFactory<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFeatureTypeReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__TYPE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__TYPE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_1, proxy, true);
            				copyLocalizationInfos((CommonToken) a5, element);
            				copyLocalizationInfos((CommonToken) a5, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[23]);
            	}

            // Ernaehrungsplan.g:889:2: (a6= TEXT )
            // Ernaehrungsplan.g:890:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature483); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanTerminateParsingException();
            			}
            			if (element == null) {
            				element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.FEATURE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a6, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[24]);
            	}

            a7=(Token)match(input,7,FOLLOW_7_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature504); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createFeature();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.grammar.ErnaehrungsplanGrammarInformationProvider.ERNAEHRUNGSPLAN_3_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEntity(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[25]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp.ErnaehrungsplanExpectationConstants.EXPECTATIONS[26]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type"
    // Ernaehrungsplan.g:942:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity |c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType );
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity c0 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Ernaehrungsplan.g:943:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity |c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==8||LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Ernaehrungsplan.g:944:2: c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type529);
                    c0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ernaehrungsplan.g:945:4: c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type539);
                    c1=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel115 = new BitSet(new long[]{0x0000000000001902L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel138 = new BitSet(new long[]{0x0000000000001902L});
    public static final BitSet FOLLOW_8_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity188 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity248 = new BitSet(new long[]{0x0000000000014600L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity271 = new BitSet(new long[]{0x0000000000014600L});
    public static final BitSet FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType344 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature483 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type539 = new BitSet(new long[]{0x0000000000000002L});

}