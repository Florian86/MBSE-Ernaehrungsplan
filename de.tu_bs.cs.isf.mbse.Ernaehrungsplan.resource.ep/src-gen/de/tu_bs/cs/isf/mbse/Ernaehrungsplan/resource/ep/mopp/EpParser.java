// $ANTLR 3.4

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


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EpParser extends EpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "','", "'Beilage'", "'Ernaehrungsplan'", "'Gericht'", "'Hauptbestandteil'", "'Person'", "'Sauce'", "'besteht aus'", "'eplan'", "'gerichte'", "'istSalat'", "'ja'", "'kommentar'", "'name'", "'nein'", "'person'", "'zutat'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int INTEGER=4;
    public static final int LINEBREAK=5;
    public static final int QUOTED_34_34=6;
    public static final int TEXT=7;
    public static final int WHITESPACE=8;

    // delegates
    public EpANTLRParserBase[] getDelegates() {
        return new EpANTLRParserBase[] {};
    }

    // delegators


    public EpParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EpParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(25 + 1);
         

    }

    public String[] getTokenNames() { return EpParser.tokenNames; }
    public String getGrammarFileName() { return "Ep.g"; }


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
    		int followSetID = 76;
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
    	



    // $ANTLR start "start"
    // Ep.g:502:1: start returns [ EObject element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Ep.g:503:2: ( (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement ) EOF )
            // Ep.g:504:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Ep.g:509:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement )
            // Ep.g:510:3: c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement
            {
            pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement_in_start82);
            c0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement();

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



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement"
    // Ep.g:518:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement element = null] : a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person ) )+ ( (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat ) )+ ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht ) )+ ( (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan ) )+ a6= '}' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a6=null;
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person a2_0 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat a3_0 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht a4_0 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Ep.g:521:2: (a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person ) )+ ( (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat ) )+ ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht ) )+ ( (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan ) )+ a6= '}' )
            // Ep.g:522:2: a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person ) )+ ( (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat ) )+ ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht ) )+ ( (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan ) )+ a6= '}'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[1]);
            	}

            a1=(Token)match(input,28,FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement129); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[2]);
            	}

            // Ep.g:550:2: ( (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ep.g:551:3: (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person )
            	    {
            	    // Ep.g:551:3: (a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person )
            	    // Ep.g:552:4: a2_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement152);
            	    a2_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[6]);
            	}

            // Ep.g:581:2: ( (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==15||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Ep.g:582:3: (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat )
            	    {
            	    // Ep.g:582:3: (a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat )
            	    // Ep.g:583:4: a3_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement187);
            	    a3_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[10]);
            	}

            // Ep.g:612:2: ( (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ep.g:613:3: (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht )
            	    {
            	    // Ep.g:613:3: (a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht )
            	    // Ep.g:614:4: a4_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement222);
            	    a4_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[12]);
            	}

            // Ep.g:641:2: ( (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ep.g:642:3: (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan )
            	    {
            	    // Ep.g:642:3: (a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan )
            	    // Ep.g:643:4: a5_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement257);
            	    a5_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[14]);
            	}

            a6=(Token)match(input,29,FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement283); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person"
    // Ep.g:685:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person element = null] : a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Ep.g:688:2: (a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' )
            // Ep.g:689:2: a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person312); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[15]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person326); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[16]);
            	}

            // Ep.g:717:2: (a2= TEXT )
            // Ep.g:718:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person344); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[17]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person365); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[19]);
            	}

            // Ep.g:768:2: ( (a4= INTEGER ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INTEGER) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Ep.g:769:3: (a4= INTEGER )
                    {
                    // Ep.g:769:3: (a4= INTEGER )
                    // Ep.g:770:4: a4= INTEGER
                    {
                    a4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person388); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[20]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person418); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[24]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil"
    // Ep.g:825:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil element = null] : a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Ep.g:828:2: (a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' )
            // Ep.g:829:2: a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil447); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[25]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil461); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[26]);
            	}

            // Ep.g:857:2: (a2= TEXT )
            // Ep.g:858:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil479); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[27]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil500); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[29]);
            	}

            // Ep.g:908:2: ( (a4= INTEGER ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==INTEGER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Ep.g:909:3: (a4= INTEGER )
                    {
                    // Ep.g:909:3: (a4= INTEGER )
                    // Ep.g:910:4: a4= INTEGER
                    {
                    a4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil523); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[30]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil553); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[32]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[34]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage"
    // Ep.g:965:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage element = null] : a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Ep.g:968:2: (a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' )
            // Ep.g:969:2: a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage582); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[35]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage596); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[36]);
            	}

            // Ep.g:997:2: (a2= TEXT )
            // Ep.g:998:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage614); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[37]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[39]);
            	}

            // Ep.g:1048:2: ( (a4= INTEGER ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==INTEGER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ep.g:1049:3: (a4= INTEGER )
                    {
                    // Ep.g:1049:3: (a4= INTEGER )
                    // Ep.g:1050:4: a4= INTEGER
                    {
                    a4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage658); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[40]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[44]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce"
    // Ep.g:1105:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce element = null] : a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Ep.g:1108:2: (a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')' )
            // Ep.g:1109:2: a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= INTEGER ) )? a5= ')'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce717); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[45]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce731); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[46]);
            	}

            // Ep.g:1137:2: (a2= TEXT )
            // Ep.g:1138:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce749); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[47]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce770); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[49]);
            	}

            // Ep.g:1188:2: ( (a4= INTEGER ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==INTEGER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Ep.g:1189:3: (a4= INTEGER )
                    {
                    // Ep.g:1189:3: (a4= INTEGER )
                    // Ep.g:1190:4: a4= INTEGER
                    {
                    a4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce793); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[50]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce823); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[51]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[54]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht"
    // Ep.g:1245:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht element = null] : a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat ) )+ a13= '}' a14= '}' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a11=null;
        Token a13=null;
        Token a14=null;
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat a12_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Ep.g:1248:2: (a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat ) )+ a13= '}' a14= '}' )
            // Ep.g:1249:2: a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat ) )+ a13= '}' a14= '}'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht852); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[55]);
            	}

            a1=(Token)match(input,28,FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht866); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[56]);
            	}

            a2=(Token)match(input,24,FOLLOW_24_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht880); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[57]);
            	}

            // Ep.g:1291:2: (a3= TEXT )
            // Ep.g:1292:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht898); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[58]);
            	}

            a4=(Token)match(input,23,FOLLOW_23_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht919); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[60]);
            	}

            // Ep.g:1342:2: ( (a5= QUOTED_34_34 ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUOTED_34_34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Ep.g:1343:3: (a5= QUOTED_34_34 )
                    {
                    // Ep.g:1343:3: (a5= QUOTED_34_34 )
                    // Ep.g:1344:4: a5= QUOTED_34_34
                    {
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht942); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[61]);
            	}

            a6=(Token)match(input,21,FOLLOW_21_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht972); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[63]);
            	}

            // Ep.g:1395:2: ( ( (a7= 'ja' |a8= 'nein' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22||LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Ep.g:1396:3: ( (a7= 'ja' |a8= 'nein' ) )
                    {
                    // Ep.g:1396:3: ( (a7= 'ja' |a8= 'nein' ) )
                    // Ep.g:1397:4: (a7= 'ja' |a8= 'nein' )
                    {
                    // Ep.g:1397:4: (a7= 'ja' |a8= 'nein' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==25) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // Ep.g:1398:5: a7= 'ja'
                            {
                            a7=(Token)match(input,22,FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1001); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }
                            break;
                        case 2 :
                            // Ep.g:1411:10: a8= 'nein'
                            {
                            a8=(Token)match(input,25,FOLLOW_25_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1018); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
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

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[64]);
            	}

            a10=(Token)match(input,18,FOLLOW_18_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1047); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_8, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[65]);
            	}

            a11=(Token)match(input,28,FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1061); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[66]);
            	}

            // Ep.g:1460:2: ( (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Ep.g:1461:3: (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat )
            	    {
            	    // Ep.g:1461:3: (a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat )
            	    // Ep.g:1462:4: a12_0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat
            	    {
            	    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1084);
            	    a12_0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[68]);
            	}

            a13=(Token)match(input,29,FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1110); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_11, null, true);
            		copyLocalizationInfos((CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[69]);
            	}

            a14=(Token)match(input,29,FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1124); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_12, null, true);
            		copyLocalizationInfos((CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[70]);
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[71]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan"
    // Ep.g:1520:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan element = null] : a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ',' (a12= TEXT ) a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ',' (a18= TEXT ) a19= ',' ( (a20= TEXT ) )+ a21= ')' a22= '}' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;
        Token a22=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Ep.g:1523:2: (a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ',' (a12= TEXT ) a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ',' (a18= TEXT ) a19= ',' ( (a20= TEXT ) )+ a21= ')' a22= '}' )
            // Ep.g:1524:2: a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) a9= ',' (a10= TEXT ) a11= ',' (a12= TEXT ) a13= ',' (a14= TEXT ) a15= ',' (a16= TEXT ) a17= ',' (a18= TEXT ) a19= ',' ( (a20= TEXT ) )+ a21= ')' a22= '}'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1153); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[72]);
            	}

            a1=(Token)match(input,28,FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1167); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[73]);
            	}

            a2=(Token)match(input,26,FOLLOW_26_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1181); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[74]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1195); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[75]);
            	}

            // Ep.g:1580:2: (a4= TEXT )
            // Ep.g:1581:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1213); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[76]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1234); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[77]);
            	}

            a6=(Token)match(input,20,FOLLOW_20_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1248); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[78]);
            	}

            a7=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1262); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[79]);
            	}

            // Ep.g:1662:2: (a8= TEXT )
            // Ep.g:1663:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1280); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[80]);
            	}

            a9=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1301); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[81]);
            	}

            // Ep.g:1716:2: (a10= TEXT )
            // Ep.g:1717:3: a10= TEXT
            {
            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1319); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[82]);
            	}

            a11=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1340); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_11, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[83]);
            	}

            // Ep.g:1770:2: (a12= TEXT )
            // Ep.g:1771:3: a12= TEXT
            {
            a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1358); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[84]);
            	}

            a13=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1379); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_13, null, true);
            		copyLocalizationInfos((CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[85]);
            	}

            // Ep.g:1824:2: (a14= TEXT )
            // Ep.g:1825:3: a14= TEXT
            {
            a14=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1397); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[86]);
            	}

            a15=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1418); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_15, null, true);
            		copyLocalizationInfos((CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[87]);
            	}

            // Ep.g:1878:2: (a16= TEXT )
            // Ep.g:1879:3: a16= TEXT
            {
            a16=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1436); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[88]);
            	}

            a17=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1457); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_17, null, true);
            		copyLocalizationInfos((CommonToken)a17, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[89]);
            	}

            // Ep.g:1932:2: (a18= TEXT )
            // Ep.g:1933:3: a18= TEXT
            {
            a18=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1475); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[90]);
            	}

            a19=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1496); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_19, null, true);
            		copyLocalizationInfos((CommonToken)a19, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[91]);
            	}

            // Ep.g:1986:2: ( (a20= TEXT ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TEXT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Ep.g:1987:3: (a20= TEXT )
            	    {
            	    // Ep.g:1987:3: (a20= TEXT )
            	    // Ep.g:1988:4: a20= TEXT
            	    {
            	    a20=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1519); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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
            	    					retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_20, proxy, true);
            	    					copyLocalizationInfos((CommonToken) a20, element);
            	    					copyLocalizationInfos((CommonToken) a20, proxy);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[92]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[93]);
            	}

            a21=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1549); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_21, null, true);
            		copyLocalizationInfos((CommonToken)a21, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[94]);
            	}

            a22=(Token)match(input,29,FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1563); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_22, null, true);
            		copyLocalizationInfos((CommonToken)a22, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getEpElement(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[95]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[96]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat"
    // Ep.g:2060:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat element = null] : a0= 'zutat' a1= '(' (a2= INTEGER ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' ;
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Ep.g:2063:2: (a0= 'zutat' a1= '(' (a2= INTEGER ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' )
            // Ep.g:2064:2: a0= 'zutat' a1= '(' (a2= INTEGER ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1592); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[97]);
            	}

            a1=(Token)match(input,9,FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1606); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[98]);
            	}

            // Ep.g:2092:2: (a2= INTEGER )
            // Ep.g:2093:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1624); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[99]);
            	}

            a3=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1645); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[100]);
            	}

            // Ep.g:2142:2: (a4= TEXT )
            // Ep.g:2143:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1663); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[101]);
            	}

            a5=(Token)match(input,11,FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1684); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[102]);
            	}

            // Ep.g:2196:2: (a6= TEXT )
            // Ep.g:2197:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1702); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[103]);
            	}

            a7=(Token)match(input,10,FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1723); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.eINSTANCE.getGericht(), de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[104]);
            		addExpectedElement(null, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[105]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat"



    // $ANTLR start "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat"
    // Ep.g:2253:1: parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat returns [de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat element = null] : (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil |c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage |c2= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce );
    public final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat() throws RecognitionException {
        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat element =  null;

        int parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat_StartIndex = input.index();

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil c0 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage c1 =null;

        de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Ep.g:2254:2: (c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil |c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage |c2= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 17:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // Ep.g:2255:2: c0= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1748);
                    c0=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ep.g:2256:4: c1= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1758);
                    c1=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Ep.g:2257:4: c2= parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce
                    {
                    pushFollow(FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1768);
                    c2=parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

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
            if ( state.backtracking>0 ) { memoize(input, 10, parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement115 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement152 = new BitSet(new long[]{0x0000000000039000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement187 = new BitSet(new long[]{0x000000000002D000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement222 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement257 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person312 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person326 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person344 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person365 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person388 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil447 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil461 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil479 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil500 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil523 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage596 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage614 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage635 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage658 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce717 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce731 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce749 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce770 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce793 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht852 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht866 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht880 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht898 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht919 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht942 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht972 = new BitSet(new long[]{0x0000000002440000L});
    public static final BitSet FOLLOW_22_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1001 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1018 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1047 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1061 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1084 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1110 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1153 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1167 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1213 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1234 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1248 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1262 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1280 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1301 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1319 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1340 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1358 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1418 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1436 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1457 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1475 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1496 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1519 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1549 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1592 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1645 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1663 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1684 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_TEXT_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1702 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce_in_parse_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat1768 = new BitSet(new long[]{0x0000000000000002L});

}