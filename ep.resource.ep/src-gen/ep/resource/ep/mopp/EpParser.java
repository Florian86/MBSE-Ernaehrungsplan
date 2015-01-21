// $ANTLR 3.4

	package ep.resource.ep.mopp;
	
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "','", "'Beilage'", "'Ernaehrungsplan'", "'Gericht'", "'Hauptbestandteil'", "'Person'", "'Sauce'", "'besteht aus'", "'eplan'", "'gerichte'", "'istSalat'", "'ja'", "'kommentar'", "'name'", "'nein'", "'person'", "'zutat'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
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
    public static final int LINEBREAK=4;
    public static final int QUOTED_34_34=5;
    public static final int TEXT=6;
    public static final int WHITESPACE=7;

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


    	private ep.resource.ep.IEpTokenResolverFactory tokenResolverFactory = new ep.resource.ep.mopp.EpTokenResolverFactory();
    	
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
    	private List<ep.resource.ep.mopp.EpExpectedTerminal> expectedElements = new ArrayList<ep.resource.ep.mopp.EpExpectedTerminal>();
    	
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
    	
    	private ep.resource.ep.IEpLocationMap locationMap;
    	
    	private ep.resource.ep.mopp.EpSyntaxErrorMessageConverter syntaxErrorMessageConverter = new ep.resource.ep.mopp.EpSyntaxErrorMessageConverter(tokenNames);
    	
    	@Override
    	public void reportError(RecognitionException re) {
    		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
    	}
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new ep.resource.ep.IEpProblem() {
    					public ep.resource.ep.EpEProblemSeverity getSeverity() {
    						return ep.resource.ep.EpEProblemSeverity.ERROR;
    					}
    					public ep.resource.ep.EpEProblemType getType() {
    						return ep.resource.ep.EpEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public Collection<ep.resource.ep.IEpQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	protected void addErrorToResource(ep.resource.ep.mopp.EpLocalizedMessage message) {
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
    		ep.resource.ep.IEpExpectedElement terminal = ep.resource.ep.grammar.EpFollowSetProvider.TERMINALS[terminalID];
    		ep.resource.ep.mopp.EpContainedFeature[] containmentFeatures = new ep.resource.ep.mopp.EpContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = ep.resource.ep.grammar.EpFollowSetProvider.LINKS[ids[i]];
    		}
    		ep.resource.ep.grammar.EpContainmentTrace containmentTrace = new ep.resource.ep.grammar.EpContainmentTrace(eClass, containmentFeatures);
    		EObject container = getLastIncompleteElement();
    		ep.resource.ep.mopp.EpExpectedTerminal expectedElement = new ep.resource.ep.mopp.EpExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		final ep.resource.ep.IEpLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
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
    		final ep.resource.ep.IEpLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
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
    	protected void setLocalizationEnd(Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		final ep.resource.ep.IEpLocationMap locationMap = this.locationMap;
    		if (locationMap == null) {
    			// the locationMap can be null if the parser is used for code completion
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public ep.resource.ep.IEpTextParser createInstance(InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new EpParser(new CommonTokenStream(new EpLexer(new ANTLRInputStream(actualInputStream))));
    			} else {
    				return new EpParser(new CommonTokenStream(new EpLexer(new ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (IOException e) {
    			new ep.resource.ep.util.EpRuntimeUtil().logError("Error while creating parser.", e);
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
    			if (type.getInstanceClass() == ep.EpElement.class) {
    				return parse_ep_EpElement();
    			}
    			if (type.getInstanceClass() == ep.Person.class) {
    				return parse_ep_Person();
    			}
    			if (type.getInstanceClass() == ep.Hauptbestandteil.class) {
    				return parse_ep_Hauptbestandteil();
    			}
    			if (type.getInstanceClass() == ep.Beilage.class) {
    				return parse_ep_Beilage();
    			}
    			if (type.getInstanceClass() == ep.Sauce.class) {
    				return parse_ep_Sauce();
    			}
    			if (type.getInstanceClass() == ep.Gericht.class) {
    				return parse_ep_Gericht();
    			}
    			if (type.getInstanceClass() == ep.Ernaehrungsplan.class) {
    				return parse_ep_Ernaehrungsplan();
    			}
    			if (type.getInstanceClass() == ep.Gericht2Zutat.class) {
    				return parse_ep_Gericht2Zutat();
    			}
    		}
    		throw new ep.resource.ep.mopp.EpUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(ep.resource.ep.IEpOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public ep.resource.ep.IEpParseResult parse() {
    		// Reset parser state
    		terminateParsing = false;
    		postParseCommands = new ArrayList<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>>();
    		ep.resource.ep.mopp.EpParseResult parseResult = new ep.resource.ep.mopp.EpParseResult();
    		if (disableLocationMap) {
    			locationMap = new ep.resource.ep.mopp.EpDevNullLocationMap();
    		} else {
    			locationMap = new ep.resource.ep.mopp.EpLocationMap();
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
    	
    	public List<ep.resource.ep.mopp.EpExpectedTerminal> parseToExpectedElements(EClass type, ep.resource.ep.IEpTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
    		ep.resource.ep.IEpParseResult result = parse();
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
    			for (ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		Set<ep.resource.ep.mopp.EpExpectedTerminal> currentFollowSet = new LinkedHashSet<ep.resource.ep.mopp.EpExpectedTerminal>();
    		List<ep.resource.ep.mopp.EpExpectedTerminal> newFollowSet = new ArrayList<ep.resource.ep.mopp.EpExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			ep.resource.ep.mopp.EpExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 67;
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
    				for (ep.resource.ep.mopp.EpExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (ep.resource.ep.mopp.EpExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						Collection<ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]> newFollowerPair : newFollowers) {
    							ep.resource.ep.IEpExpectedElement newFollower = newFollowerPair.getLeft();
    							EObject container = getLastIncompleteElement();
    							ep.resource.ep.grammar.EpContainmentTrace containmentTrace = new ep.resource.ep.grammar.EpContainmentTrace(null, newFollowerPair.getRight());
    							ep.resource.ep.mopp.EpExpectedTerminal newFollowTerminal = new ep.resource.ep.mopp.EpExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (ep.resource.ep.mopp.EpExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(ep.resource.ep.mopp.EpExpectedTerminal expectedElement, int tokenIndex) {
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
    // Ep.g:502:1: start returns [ EObject element = null] : (c0= parse_ep_EpElement ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;

        int start_StartIndex = input.index();

        ep.EpElement c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Ep.g:503:2: ( (c0= parse_ep_EpElement ) EOF )
            // Ep.g:504:2: (c0= parse_ep_EpElement ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Ep.g:509:2: (c0= parse_ep_EpElement )
            // Ep.g:510:3: c0= parse_ep_EpElement
            {
            pushFollow(FOLLOW_parse_ep_EpElement_in_start82);
            c0=parse_ep_EpElement();

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



    // $ANTLR start "parse_ep_EpElement"
    // Ep.g:518:1: parse_ep_EpElement returns [ep.EpElement element = null] : a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}' ;
    public final ep.EpElement parse_ep_EpElement() throws RecognitionException {
        ep.EpElement element =  null;

        int parse_ep_EpElement_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a6=null;
        ep.Person a2_0 =null;

        ep.Zutat a3_0 =null;

        ep.Gericht a4_0 =null;

        ep.Ernaehrungsplan a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Ep.g:521:2: (a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}' )
            // Ep.g:522:2: a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ep_EpElement115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[1]);
            	}

            a1=(Token)match(input,27,FOLLOW_27_in_parse_ep_EpElement129); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[2]);
            	}

            // Ep.g:550:2: ( (a2_0= parse_ep_Person ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ep.g:551:3: (a2_0= parse_ep_Person )
            	    {
            	    // Ep.g:551:3: (a2_0= parse_ep_Person )
            	    // Ep.g:552:4: a2_0= parse_ep_Person
            	    {
            	    pushFollow(FOLLOW_parse_ep_Person_in_parse_ep_EpElement152);
            	    a2_0=parse_ep_Person();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_2, a2_0, true);
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
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[6]);
            	}

            // Ep.g:581:2: ( (a3_0= parse_ep_Zutat ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Ep.g:582:3: (a3_0= parse_ep_Zutat )
            	    {
            	    // Ep.g:582:3: (a3_0= parse_ep_Zutat )
            	    // Ep.g:583:4: a3_0= parse_ep_Zutat
            	    {
            	    pushFollow(FOLLOW_parse_ep_Zutat_in_parse_ep_EpElement187);
            	    a3_0=parse_ep_Zutat();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a3_0 != null) {
            	    					if (a3_0 != null) {
            	    						Object value = a3_0;
            	    						addObjectToList(element, ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_3, a3_0, true);
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
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[10]);
            	}

            // Ep.g:612:2: ( (a4_0= parse_ep_Gericht ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ep.g:613:3: (a4_0= parse_ep_Gericht )
            	    {
            	    // Ep.g:613:3: (a4_0= parse_ep_Gericht )
            	    // Ep.g:614:4: a4_0= parse_ep_Gericht
            	    {
            	    pushFollow(FOLLOW_parse_ep_Gericht_in_parse_ep_EpElement222);
            	    a4_0=parse_ep_Gericht();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a4_0 != null) {
            	    					if (a4_0 != null) {
            	    						Object value = a4_0;
            	    						addObjectToList(element, ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_4, a4_0, true);
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
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[12]);
            	}

            // Ep.g:641:2: ( (a5_0= parse_ep_Ernaehrungsplan ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ep.g:642:3: (a5_0= parse_ep_Ernaehrungsplan )
            	    {
            	    // Ep.g:642:3: (a5_0= parse_ep_Ernaehrungsplan )
            	    // Ep.g:643:4: a5_0= parse_ep_Ernaehrungsplan
            	    {
            	    pushFollow(FOLLOW_parse_ep_Ernaehrungsplan_in_parse_ep_EpElement257);
            	    a5_0=parse_ep_Ernaehrungsplan();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a5_0 != null) {
            	    					if (a5_0 != null) {
            	    						Object value = a5_0;
            	    						addObjectToList(element, ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_5, a5_0, true);
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
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[14]);
            	}

            a6=(Token)match(input,28,FOLLOW_28_in_parse_ep_EpElement283); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_6, null, true);
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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_ep_EpElement_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_EpElement"



    // $ANTLR start "parse_ep_Person"
    // Ep.g:685:1: parse_ep_Person returns [ep.Person element = null] : a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
    public final ep.Person parse_ep_Person() throws RecognitionException {
        ep.Person element =  null;

        int parse_ep_Person_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Ep.g:688:2: (a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:689:2: a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ep_Person312); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[15]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Person326); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[16]);
            	}

            // Ep.g:717:2: (a2= TEXT )
            // Ep.g:718:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Person344); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createPerson();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[17]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Person365); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[19]);
            	}

            // Ep.g:768:2: ( (a4= TEXT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TEXT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Ep.g:769:3: (a4= TEXT )
                    {
                    // Ep.g:769:3: (a4= TEXT )
                    // Ep.g:770:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Person388); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = ep.MetamodelFactory.eINSTANCE.createPerson();
                    					startIncompleteElement(element);
                    				}
                    				if (a4 != null) {
                    					ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    					tokenResolver.setOptions(getOptions());
                    					ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_4, resolved, true);
                    					copyLocalizationInfos((CommonToken) a4, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[20]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ep_Person418); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[23]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[24]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_ep_Person_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Person"



    // $ANTLR start "parse_ep_Hauptbestandteil"
    // Ep.g:825:1: parse_ep_Hauptbestandteil returns [ep.Hauptbestandteil element = null] : a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
    public final ep.Hauptbestandteil parse_ep_Hauptbestandteil() throws RecognitionException {
        ep.Hauptbestandteil element =  null;

        int parse_ep_Hauptbestandteil_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Ep.g:828:2: (a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:829:2: a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_ep_Hauptbestandteil447); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[25]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Hauptbestandteil461); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[26]);
            	}

            // Ep.g:857:2: (a2= TEXT )
            // Ep.g:858:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Hauptbestandteil479); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[27]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Hauptbestandteil500); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[29]);
            	}

            // Ep.g:908:2: ( (a4= TEXT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Ep.g:909:3: (a4= TEXT )
                    {
                    // Ep.g:909:3: (a4= TEXT )
                    // Ep.g:910:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Hauptbestandteil523); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
                    					startIncompleteElement(element);
                    				}
                    				if (a4 != null) {
                    					ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    					tokenResolver.setOptions(getOptions());
                    					ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_4, resolved, true);
                    					copyLocalizationInfos((CommonToken) a4, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[30]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ep_Hauptbestandteil553); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[32]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[33]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[34]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_ep_Hauptbestandteil_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Hauptbestandteil"



    // $ANTLR start "parse_ep_Beilage"
    // Ep.g:965:1: parse_ep_Beilage returns [ep.Beilage element = null] : a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
    public final ep.Beilage parse_ep_Beilage() throws RecognitionException {
        ep.Beilage element =  null;

        int parse_ep_Beilage_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Ep.g:968:2: (a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:969:2: a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_ep_Beilage582); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[35]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Beilage596); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[36]);
            	}

            // Ep.g:997:2: (a2= TEXT )
            // Ep.g:998:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Beilage614); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[37]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Beilage635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[39]);
            	}

            // Ep.g:1048:2: ( (a4= TEXT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ep.g:1049:3: (a4= TEXT )
                    {
                    // Ep.g:1049:3: (a4= TEXT )
                    // Ep.g:1050:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Beilage658); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = ep.MetamodelFactory.eINSTANCE.createBeilage();
                    					startIncompleteElement(element);
                    				}
                    				if (a4 != null) {
                    					ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    					tokenResolver.setOptions(getOptions());
                    					ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_4, resolved, true);
                    					copyLocalizationInfos((CommonToken) a4, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[40]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ep_Beilage688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[41]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[43]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[44]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_ep_Beilage_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Beilage"



    // $ANTLR start "parse_ep_Sauce"
    // Ep.g:1105:1: parse_ep_Sauce returns [ep.Sauce element = null] : a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
    public final ep.Sauce parse_ep_Sauce() throws RecognitionException {
        ep.Sauce element =  null;

        int parse_ep_Sauce_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Ep.g:1108:2: (a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:1109:2: a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_ep_Sauce717); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[45]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Sauce731); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[46]);
            	}

            // Ep.g:1137:2: (a2= TEXT )
            // Ep.g:1138:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Sauce749); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createSauce();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[47]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Sauce770); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[49]);
            	}

            // Ep.g:1188:2: ( (a4= TEXT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Ep.g:1189:3: (a4= TEXT )
                    {
                    // Ep.g:1189:3: (a4= TEXT )
                    // Ep.g:1190:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Sauce793); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = ep.MetamodelFactory.eINSTANCE.createSauce();
                    					startIncompleteElement(element);
                    				}
                    				if (a4 != null) {
                    					ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    					tokenResolver.setOptions(getOptions());
                    					ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_4, resolved, true);
                    					copyLocalizationInfos((CommonToken) a4, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[50]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ep_Sauce823); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[51]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[54]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_ep_Sauce_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Sauce"



    // $ANTLR start "parse_ep_Gericht"
    // Ep.g:1245:1: parse_ep_Gericht returns [ep.Gericht element = null] : a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}' ;
    public final ep.Gericht parse_ep_Gericht() throws RecognitionException {
        ep.Gericht element =  null;

        int parse_ep_Gericht_StartIndex = input.index();

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
        ep.Gericht2Zutat a12_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Ep.g:1248:2: (a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}' )
            // Ep.g:1249:2: a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_ep_Gericht852); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[55]);
            	}

            a1=(Token)match(input,27,FOLLOW_27_in_parse_ep_Gericht866); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[56]);
            	}

            a2=(Token)match(input,23,FOLLOW_23_in_parse_ep_Gericht880); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[57]);
            	}

            // Ep.g:1291:2: (a3= TEXT )
            // Ep.g:1292:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht898); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createGericht();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_3, resolved, true);
            				copyLocalizationInfos((CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[58]);
            	}

            a4=(Token)match(input,22,FOLLOW_22_in_parse_ep_Gericht919); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[60]);
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
                    a5=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_ep_Gericht942); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = ep.MetamodelFactory.eINSTANCE.createGericht();
                    					startIncompleteElement(element);
                    				}
                    				if (a5 != null) {
                    					ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
                    					tokenResolver.setOptions(getOptions());
                    					ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
                    					tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), result);
                    					Object resolvedObject = result.getResolvedToken();
                    					if (resolvedObject == null) {
                    						addErrorToResource(result.getErrorMessage(), ((CommonToken) a5).getLine(), ((CommonToken) a5).getCharPositionInLine(), ((CommonToken) a5).getStartIndex(), ((CommonToken) a5).getStopIndex());
                    					}
                    					java.lang.String resolved = (java.lang.String) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_5, resolved, true);
                    					copyLocalizationInfos((CommonToken) a5, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[61]);
            	}

            a6=(Token)match(input,20,FOLLOW_20_in_parse_ep_Gericht972); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[63]);
            	}

            // Ep.g:1395:2: ( ( (a7= 'ja' |a8= 'nein' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21||LA11_0==24) ) {
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

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==24) ) {
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
                            a7=(Token)match(input,21,FOLLOW_21_in_parse_ep_Gericht1001); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = ep.MetamodelFactory.eINSTANCE.createGericht();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, true, true);
                            					copyLocalizationInfos((CommonToken)a7, element);
                            					// set value of boolean attribute
                            					Object value = true;
                            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Ep.g:1411:10: a8= 'nein'
                            {
                            a8=(Token)match(input,24,FOLLOW_24_in_parse_ep_Gericht1018); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = ep.MetamodelFactory.eINSTANCE.createGericht();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, false, true);
                            					copyLocalizationInfos((CommonToken)a8, element);
                            					// set value of boolean attribute
                            					Object value = false;
                            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT), value);
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
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[64]);
            	}

            a10=(Token)match(input,17,FOLLOW_17_in_parse_ep_Gericht1047); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_8, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[65]);
            	}

            a11=(Token)match(input,27,FOLLOW_27_in_parse_ep_Gericht1061); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getGericht(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[66]);
            	}

            // Ep.g:1460:2: ( (a12_0= parse_ep_Gericht2Zutat ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Ep.g:1461:3: (a12_0= parse_ep_Gericht2Zutat )
            	    {
            	    // Ep.g:1461:3: (a12_0= parse_ep_Gericht2Zutat )
            	    // Ep.g:1462:4: a12_0= parse_ep_Gericht2Zutat
            	    {
            	    pushFollow(FOLLOW_parse_ep_Gericht2Zutat_in_parse_ep_Gericht1084);
            	    a12_0=parse_ep_Gericht2Zutat();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createGericht();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a12_0 != null) {
            	    					if (a12_0 != null) {
            	    						Object value = a12_0;
            	    						addObjectToList(element, ep.MetamodelPackage.GERICHT__ZUTATEN, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_10, a12_0, true);
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
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getGericht(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[67]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[68]);
            	}

            a13=(Token)match(input,28,FOLLOW_28_in_parse_ep_Gericht1110); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_11, null, true);
            		copyLocalizationInfos((CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[69]);
            	}

            a14=(Token)match(input,28,FOLLOW_28_in_parse_ep_Gericht1124); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_12, null, true);
            		copyLocalizationInfos((CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[70]);
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[71]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_ep_Gericht_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Gericht"



    // $ANTLR start "parse_ep_Ernaehrungsplan"
    // Ep.g:1520:1: parse_ep_Ernaehrungsplan returns [ep.Ernaehrungsplan element = null] : a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) ( (a9= ',' (a10= TEXT ) ) )* a11= ')' a12= '}' ;
    public final ep.Ernaehrungsplan parse_ep_Ernaehrungsplan() throws RecognitionException {
        ep.Ernaehrungsplan element =  null;

        int parse_ep_Ernaehrungsplan_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Ep.g:1523:2: (a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) ( (a9= ',' (a10= TEXT ) ) )* a11= ')' a12= '}' )
            // Ep.g:1524:2: a0= 'eplan' a1= '{' a2= 'person' a3= '(' (a4= TEXT ) a5= ')' a6= 'gerichte' a7= '(' (a8= TEXT ) ( (a9= ',' (a10= TEXT ) ) )* a11= ')' a12= '}'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_ep_Ernaehrungsplan1153); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[72]);
            	}

            a1=(Token)match(input,27,FOLLOW_27_in_parse_ep_Ernaehrungsplan1167); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[73]);
            	}

            a2=(Token)match(input,25,FOLLOW_25_in_parse_ep_Ernaehrungsplan1181); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[74]);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_ep_Ernaehrungsplan1195); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[75]);
            	}

            // Ep.g:1580:2: (a4= TEXT )
            // Ep.g:1581:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1213); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Person proxy = ep.MetamodelFactory.eINSTANCE.createPerson();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Person>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_4, proxy, true);
            				copyLocalizationInfos((CommonToken) a4, element);
            				copyLocalizationInfos((CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[76]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_ep_Ernaehrungsplan1234); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[77]);
            	}

            a6=(Token)match(input,19,FOLLOW_19_in_parse_ep_Ernaehrungsplan1248); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[78]);
            	}

            a7=(Token)match(input,8,FOLLOW_8_in_parse_ep_Ernaehrungsplan1262); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[79]);
            	}

            // Ep.g:1662:2: (a8= TEXT )
            // Ep.g:1663:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1280); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a8).getLine(), ((CommonToken) a8).getCharPositionInLine(), ((CommonToken) a8).getStartIndex(), ((CommonToken) a8).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_8, proxy, true);
            				copyLocalizationInfos((CommonToken) a8, element);
            				copyLocalizationInfos((CommonToken) a8, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[80]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[81]);
            	}

            // Ep.g:1703:2: ( (a9= ',' (a10= TEXT ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==10) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Ep.g:1704:3: (a9= ',' (a10= TEXT ) )
            	    {
            	    // Ep.g:1704:3: (a9= ',' (a10= TEXT ) )
            	    // Ep.g:1705:4: a9= ',' (a10= TEXT )
            	    {
            	    a9=(Token)match(input,10,FOLLOW_10_in_parse_ep_Ernaehrungsplan1310); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9_0_0_0, null, true);
            	    				copyLocalizationInfos((CommonToken)a9, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[82]);
            	    			}

            	    // Ep.g:1719:4: (a10= TEXT )
            	    // Ep.g:1720:5: a10= TEXT
            	    {
            	    a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1336); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a10 != null) {
            	    						ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	    						tokenResolver.setOptions(getOptions());
            	    						ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((CommonToken) a10).getLine(), ((CommonToken) a10).getCharPositionInLine(), ((CommonToken) a10).getStartIndex(), ((CommonToken) a10).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9_0_0_1, proxy, true);
            	    						copyLocalizationInfos((CommonToken) a10, element);
            	    						copyLocalizationInfos((CommonToken) a10, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[83]);
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[84]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[86]);
            	}

            a11=(Token)match(input,9,FOLLOW_9_in_parse_ep_Ernaehrungsplan1382); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[87]);
            	}

            a12=(Token)match(input,28,FOLLOW_28_in_parse_ep_Ernaehrungsplan1396); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_11, null, true);
            		copyLocalizationInfos((CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[88]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[89]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_ep_Ernaehrungsplan_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Ernaehrungsplan"



    // $ANTLR start "parse_ep_Gericht2Zutat"
    // Ep.g:1799:1: parse_ep_Gericht2Zutat returns [ep.Gericht2Zutat element = null] : a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' ;
    public final ep.Gericht2Zutat parse_ep_Gericht2Zutat() throws RecognitionException {
        ep.Gericht2Zutat element =  null;

        int parse_ep_Gericht2Zutat_StartIndex = input.index();

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

            // Ep.g:1802:2: (a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' )
            // Ep.g:1803:2: a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_ep_Gericht2Zutat1425); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[90]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Gericht2Zutat1439); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[91]);
            	}

            // Ep.g:1831:2: (a2= TEXT )
            // Ep.g:1832:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1457); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            				startIncompleteElement(element);
            			}
            			if (a2 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_2, resolved, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[92]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Gericht2Zutat1478); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[93]);
            	}

            // Ep.g:1881:2: (a4= TEXT )
            // Ep.g:1882:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1496); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            				startIncompleteElement(element);
            			}
            			if (a4 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a4).getLine(), ((CommonToken) a4).getCharPositionInLine(), ((CommonToken) a4).getStartIndex(), ((CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Zutat proxy = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Gericht2Zutat, ep.Zutat>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatZutatReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_4, proxy, true);
            				copyLocalizationInfos((CommonToken) a4, element);
            				copyLocalizationInfos((CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[94]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_ep_Gericht2Zutat1517); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[95]);
            	}

            // Ep.g:1935:2: (a6= TEXT )
            // Ep.g:1936:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1535); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new ep.resource.ep.mopp.EpTerminateParsingException();
            			}
            			if (element == null) {
            				element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            				startIncompleteElement(element);
            			}
            			if (a6 != null) {
            				ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a6).getLine(), ((CommonToken) a6).getCharPositionInLine(), ((CommonToken) a6).getStartIndex(), ((CommonToken) a6).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Gericht2Zutat, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatGerichtReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_6, proxy, true);
            				copyLocalizationInfos((CommonToken) a6, element);
            				copyLocalizationInfos((CommonToken) a6, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[96]);
            	}

            a7=(Token)match(input,9,FOLLOW_9_in_parse_ep_Gericht2Zutat1556); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getGericht(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[97]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[98]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_ep_Gericht2Zutat_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Gericht2Zutat"



    // $ANTLR start "parse_ep_Zutat"
    // Ep.g:1992:1: parse_ep_Zutat returns [ep.Zutat element = null] : (c0= parse_ep_Hauptbestandteil |c1= parse_ep_Beilage |c2= parse_ep_Sauce );
    public final ep.Zutat parse_ep_Zutat() throws RecognitionException {
        ep.Zutat element =  null;

        int parse_ep_Zutat_StartIndex = input.index();

        ep.Hauptbestandteil c0 =null;

        ep.Beilage c1 =null;

        ep.Sauce c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Ep.g:1993:2: (c0= parse_ep_Hauptbestandteil |c1= parse_ep_Beilage |c2= parse_ep_Sauce )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt14=1;
                }
                break;
            case 11:
                {
                alt14=2;
                }
                break;
            case 16:
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
                    // Ep.g:1994:2: c0= parse_ep_Hauptbestandteil
                    {
                    pushFollow(FOLLOW_parse_ep_Hauptbestandteil_in_parse_ep_Zutat1581);
                    c0=parse_ep_Hauptbestandteil();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ep.g:1995:4: c1= parse_ep_Beilage
                    {
                    pushFollow(FOLLOW_parse_ep_Beilage_in_parse_ep_Zutat1591);
                    c1=parse_ep_Beilage();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Ep.g:1996:4: c2= parse_ep_Sauce
                    {
                    pushFollow(FOLLOW_parse_ep_Sauce_in_parse_ep_Zutat1601);
                    c2=parse_ep_Sauce();

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
            if ( state.backtracking>0 ) { memoize(input, 10, parse_ep_Zutat_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_ep_Zutat"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_ep_EpElement_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_parse_ep_EpElement115 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_ep_EpElement129 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_parse_ep_Person_in_parse_ep_EpElement152 = new BitSet(new long[]{0x000000000001C800L});
    public static final BitSet FOLLOW_parse_ep_Zutat_in_parse_ep_EpElement187 = new BitSet(new long[]{0x0000000000016800L});
    public static final BitSet FOLLOW_parse_ep_Gericht_in_parse_ep_EpElement222 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_parse_ep_Ernaehrungsplan_in_parse_ep_EpElement257 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_parse_ep_EpElement283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_ep_Person312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Person326 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Person344 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Person365 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Person388 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Person418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_ep_Hauptbestandteil447 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Hauptbestandteil461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Hauptbestandteil479 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Hauptbestandteil500 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Hauptbestandteil523 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Hauptbestandteil553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_ep_Beilage582 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Beilage596 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Beilage614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Beilage635 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Beilage658 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Beilage688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_ep_Sauce717 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Sauce731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Sauce749 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Sauce770 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Sauce793 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Sauce823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_ep_Gericht852 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_ep_Gericht866 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_ep_Gericht880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht898 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_ep_Gericht919 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_ep_Gericht942 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_ep_Gericht972 = new BitSet(new long[]{0x0000000001220000L});
    public static final BitSet FOLLOW_21_in_parse_ep_Gericht1001 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24_in_parse_ep_Gericht1018 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_ep_Gericht1047 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_ep_Gericht1061 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_parse_ep_Gericht2Zutat_in_parse_ep_Gericht1084 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_parse_ep_Gericht1110 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_ep_Gericht1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_ep_Ernaehrungsplan1153 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_ep_Ernaehrungsplan1167 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_ep_Ernaehrungsplan1181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Ernaehrungsplan1195 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1213 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Ernaehrungsplan1234 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_ep_Ernaehrungsplan1248 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Ernaehrungsplan1262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1280 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_parse_ep_Ernaehrungsplan1310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1336 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_parse_ep_Ernaehrungsplan1382 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_ep_Ernaehrungsplan1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_ep_Gericht2Zutat1425 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Gericht2Zutat1439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1457 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Gericht2Zutat1478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1496 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Gericht2Zutat1517 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1535 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Gericht2Zutat1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Hauptbestandteil_in_parse_ep_Zutat1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Beilage_in_parse_ep_Zutat1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Sauce_in_parse_ep_Zutat1601 = new BitSet(new long[]{0x0000000000000002L});

}