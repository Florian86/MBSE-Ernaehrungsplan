// $ANTLR 3.4

	package ep.resource.ep.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EpParser extends EpANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'('", "')'", "','", "'Beilage'", "'Ernaehrungsplan'", "'Gericht'", "'Hauptbestandteil'", "'Person'", "'Sauce'", "'besteht aus'", "'eplan'", "'gerichte'", "'istSalat'", "'ja'", "'kommentar'", "'name'", "'nein'", "'personen'", "'zutat'", "'{'", "'}'"
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
        this.state.initializeRuleMemo(26 + 1);
         

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
    	private java.util.List<ep.resource.ep.mopp.EpExpectedTerminal> expectedElements = new java.util.ArrayList<ep.resource.ep.mopp.EpExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
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
    					public java.util.Collection<ep.resource.ep.IEpQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
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
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
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
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
    				ep.resource.ep.IEpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
    				ep.resource.ep.IEpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
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
    	protected void setLocalizationEnd(java.util.Collection<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>() {
    			public boolean execute(ep.resource.ep.IEpTextResource resource) {
    				ep.resource.ep.IEpLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public ep.resource.ep.IEpTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new EpParser(new org.antlr.runtime3_4_0.CommonTokenStream(new EpLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new EpParser(new org.antlr.runtime3_4_0.CommonTokenStream(new EpLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
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
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((EpLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((EpLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
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
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
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
    		java.util.Map<?,?> options = getOptions();
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
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<ep.resource.ep.IEpCommand<ep.resource.ep.IEpTextResource>>();
    		ep.resource.ep.mopp.EpParseResult parseResult = new ep.resource.ep.mopp.EpParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<ep.resource.ep.mopp.EpExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, ep.resource.ep.IEpTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		ep.resource.ep.IEpParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
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
    		java.util.Set<ep.resource.ep.mopp.EpExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<ep.resource.ep.mopp.EpExpectedTerminal>();
    		java.util.List<ep.resource.ep.mopp.EpExpectedTerminal> newFollowSet = new java.util.ArrayList<ep.resource.ep.mopp.EpExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			ep.resource.ep.mopp.EpExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 70;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
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
    						java.util.Collection<ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (ep.resource.ep.util.EpPair<ep.resource.ep.IEpExpectedElement, ep.resource.ep.mopp.EpContainedFeature[]> newFollowerPair : newFollowers) {
    							ep.resource.ep.IEpExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
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
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Ep.g:520:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_ep_EpElement ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        ep.EpElement c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Ep.g:521:2: ( (c0= parse_ep_EpElement ) EOF )
            // Ep.g:522:2: (c0= parse_ep_EpElement ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Ep.g:527:2: (c0= parse_ep_EpElement )
            // Ep.g:528:3: c0= parse_ep_EpElement
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
    // Ep.g:536:1: parse_ep_EpElement returns [ep.EpElement element = null] : a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}' ;
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

            // Ep.g:539:2: (a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}' )
            // Ep.g:540:2: a0= 'Ernaehrungsplan' a1= '{' ( (a2_0= parse_ep_Person ) )+ ( (a3_0= parse_ep_Zutat ) )+ ( (a4_0= parse_ep_Gericht ) )+ ( (a5_0= parse_ep_Ernaehrungsplan ) )+ a6= '}'
            {
            a0=(Token)match(input,12,FOLLOW_12_in_parse_ep_EpElement115); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createEpElement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_0_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[2]);
            	}

            // Ep.g:568:2: ( (a2_0= parse_ep_Person ) )+
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
            	    // Ep.g:569:3: (a2_0= parse_ep_Person )
            	    {
            	    // Ep.g:569:3: (a2_0= parse_ep_Person )
            	    // Ep.g:570:4: a2_0= parse_ep_Person
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

            // Ep.g:599:2: ( (a3_0= parse_ep_Zutat ) )+
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
            	    // Ep.g:600:3: (a3_0= parse_ep_Zutat )
            	    {
            	    // Ep.g:600:3: (a3_0= parse_ep_Zutat )
            	    // Ep.g:601:4: a3_0= parse_ep_Zutat
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

            // Ep.g:630:2: ( (a4_0= parse_ep_Gericht ) )+
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
            	    // Ep.g:631:3: (a4_0= parse_ep_Gericht )
            	    {
            	    // Ep.g:631:3: (a4_0= parse_ep_Gericht )
            	    // Ep.g:632:4: a4_0= parse_ep_Gericht
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

            // Ep.g:659:2: ( (a5_0= parse_ep_Ernaehrungsplan ) )+
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
            	    // Ep.g:660:3: (a5_0= parse_ep_Ernaehrungsplan )
            	    {
            	    // Ep.g:660:3: (a5_0= parse_ep_Ernaehrungsplan )
            	    // Ep.g:661:4: a5_0= parse_ep_Ernaehrungsplan
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
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
    // Ep.g:703:1: parse_ep_Person returns [ep.Person element = null] : a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
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

            // Ep.g:706:2: (a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:707:2: a0= 'Person' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_ep_Person312); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[16]);
            	}

            // Ep.g:735:2: (a2= TEXT )
            // Ep.g:736:3: a2= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[19]);
            	}

            // Ep.g:786:2: ( (a4= TEXT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==TEXT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Ep.g:787:3: (a4= TEXT )
                    {
                    // Ep.g:787:3: (a4= TEXT )
                    // Ep.g:788:4: a4= TEXT
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
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_1_0_0_4, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
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
    // Ep.g:843:1: parse_ep_Hauptbestandteil returns [ep.Hauptbestandteil element = null] : a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
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

            // Ep.g:846:2: (a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:847:2: a0= 'Hauptbestandteil' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_ep_Hauptbestandteil447); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[26]);
            	}

            // Ep.g:875:2: (a2= TEXT )
            // Ep.g:876:3: a2= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[29]);
            	}

            // Ep.g:926:2: ( (a4= TEXT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TEXT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Ep.g:927:3: (a4= TEXT )
                    {
                    // Ep.g:927:3: (a4= TEXT )
                    // Ep.g:928:4: a4= TEXT
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
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_2_0_0_4, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
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
    // Ep.g:983:1: parse_ep_Beilage returns [ep.Beilage element = null] : a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
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

            // Ep.g:986:2: (a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:987:2: a0= 'Beilage' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_ep_Beilage582); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createBeilage();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[36]);
            	}

            // Ep.g:1015:2: (a2= TEXT )
            // Ep.g:1016:3: a2= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[38]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[39]);
            	}

            // Ep.g:1066:2: ( (a4= TEXT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ep.g:1067:3: (a4= TEXT )
                    {
                    // Ep.g:1067:3: (a4= TEXT )
                    // Ep.g:1068:4: a4= TEXT
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
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_3_0_0_4, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
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
    // Ep.g:1123:1: parse_ep_Sauce returns [ep.Sauce element = null] : a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' ;
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

            // Ep.g:1126:2: (a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')' )
            // Ep.g:1127:2: a0= 'Sauce' a1= '(' (a2= TEXT ) a3= ',' ( (a4= TEXT ) )? a5= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_ep_Sauce717); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createSauce();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[46]);
            	}

            // Ep.g:1155:2: (a2= TEXT )
            // Ep.g:1156:3: a2= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[48]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[49]);
            	}

            // Ep.g:1206:2: ( (a4= TEXT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TEXT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Ep.g:1207:3: (a4= TEXT )
                    {
                    // Ep.g:1207:3: (a4= TEXT )
                    // Ep.g:1208:4: a4= TEXT
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
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
                    					}
                    					java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_4_0_0_4, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
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
    // Ep.g:1263:1: parse_ep_Gericht returns [ep.Gericht element = null] : a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}' ;
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

            // Ep.g:1266:2: (a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}' )
            // Ep.g:1267:2: a0= 'Gericht' a1= '{' a2= 'name' (a3= TEXT ) a4= 'kommentar' ( (a5= QUOTED_34_34 ) )? a6= 'istSalat' ( ( (a7= 'ja' |a8= 'nein' ) ) )? a10= 'besteht aus' a11= '{' ( (a12_0= parse_ep_Gericht2Zutat ) )+ a13= '}' a14= '}'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_ep_Gericht852); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[57]);
            	}

            // Ep.g:1309:2: (a3= TEXT )
            // Ep.g:1310:3: a3= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_3, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[59]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[60]);
            	}

            // Ep.g:1360:2: ( (a5= QUOTED_34_34 ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUOTED_34_34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Ep.g:1361:3: (a5= QUOTED_34_34 )
                    {
                    // Ep.g:1361:3: (a5= QUOTED_34_34 )
                    // Ep.g:1362:4: a5= QUOTED_34_34
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
                    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
                    					}
                    					java.lang.String resolved = (java.lang.String) resolvedObject;
                    					if (resolved != null) {
                    						Object value = resolved;
                    						element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), value);
                    						completedElement(value, false);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_5, resolved, true);
                    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[63]);
            	}

            // Ep.g:1413:2: ( ( (a7= 'ja' |a8= 'nein' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21||LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Ep.g:1414:3: ( (a7= 'ja' |a8= 'nein' ) )
                    {
                    // Ep.g:1414:3: ( (a7= 'ja' |a8= 'nein' ) )
                    // Ep.g:1415:4: (a7= 'ja' |a8= 'nein' )
                    {
                    // Ep.g:1415:4: (a7= 'ja' |a8= 'nein' )
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
                            // Ep.g:1416:5: a7= 'ja'
                            {
                            a7=(Token)match(input,21,FOLLOW_21_in_parse_ep_Gericht1001); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = ep.MetamodelFactory.eINSTANCE.createGericht();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, true, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                            					// set value of boolean attribute
                            					Object value = true;
                            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT), value);
                            					completedElement(value, false);
                            				}

                            }
                            break;
                        case 2 :
                            // Ep.g:1429:10: a8= 'nein'
                            {
                            a8=(Token)match(input,24,FOLLOW_24_in_parse_ep_Gericht1018); if (state.failed) return element;

                            if ( state.backtracking==0 ) {
                            					if (element == null) {
                            						element = ep.MetamodelFactory.eINSTANCE.createGericht();
                            						startIncompleteElement(element);
                            					}
                            					collectHiddenTokens(element);
                            					retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_5_0_0_7, false, true);
                            					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getGericht(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[66]);
            	}

            // Ep.g:1478:2: ( (a12_0= parse_ep_Gericht2Zutat ) )+
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
            	    // Ep.g:1479:3: (a12_0= parse_ep_Gericht2Zutat )
            	    {
            	    // Ep.g:1479:3: (a12_0= parse_ep_Gericht2Zutat )
            	    // Ep.g:1480:4: a12_0= parse_ep_Gericht2Zutat
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
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
    // Ep.g:1538:1: parse_ep_Ernaehrungsplan returns [ep.Ernaehrungsplan element = null] : a0= 'eplan' a1= '{' a2= 'personen' a3= '(' (a4= TEXT ) ( (a5= ',' (a6= TEXT ) ) )* a7= ')' a8= 'gerichte' a9= '(' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* a13= ')' a14= '}' ;
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
        Token a13=null;
        Token a14=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Ep.g:1541:2: (a0= 'eplan' a1= '{' a2= 'personen' a3= '(' (a4= TEXT ) ( (a5= ',' (a6= TEXT ) ) )* a7= ')' a8= 'gerichte' a9= '(' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* a13= ')' a14= '}' )
            // Ep.g:1542:2: a0= 'eplan' a1= '{' a2= 'personen' a3= '(' (a4= TEXT ) ( (a5= ',' (a6= TEXT ) ) )* a7= ')' a8= 'gerichte' a9= '(' (a10= TEXT ) ( (a11= ',' (a12= TEXT ) ) )* a13= ')' a14= '}'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_ep_Ernaehrungsplan1153); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
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
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[75]);
            	}

            // Ep.g:1598:2: (a4= TEXT )
            // Ep.g:1599:3: a4= TEXT
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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Person proxy = ep.MetamodelFactory.eINSTANCE.createPerson();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Person>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_4, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[76]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[77]);
            	}

            // Ep.g:1639:2: ( (a5= ',' (a6= TEXT ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==10) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Ep.g:1640:3: (a5= ',' (a6= TEXT ) )
            	    {
            	    // Ep.g:1640:3: (a5= ',' (a6= TEXT ) )
            	    // Ep.g:1641:4: a5= ',' (a6= TEXT )
            	    {
            	    a5=(Token)match(input,10,FOLLOW_10_in_parse_ep_Ernaehrungsplan1243); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[78]);
            	    			}

            	    // Ep.g:1655:4: (a6= TEXT )
            	    // Ep.g:1656:5: a6= TEXT
            	    {
            	    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1269); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a6 != null) {
            	    						ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	    						tokenResolver.setOptions(getOptions());
            	    						ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						ep.Person proxy = ep.MetamodelFactory.eINSTANCE.createPerson();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Person>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_5_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[79]);
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[80]);
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
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[81]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[82]);
            	}

            a7=(Token)match(input,9,FOLLOW_9_in_parse_ep_Ernaehrungsplan1315); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[83]);
            	}

            a8=(Token)match(input,19,FOLLOW_19_in_parse_ep_Ernaehrungsplan1329); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[84]);
            	}

            a9=(Token)match(input,8,FOLLOW_8_in_parse_ep_Ernaehrungsplan1343); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[85]);
            	}

            // Ep.g:1746:2: (a10= TEXT )
            // Ep.g:1747:3: a10= TEXT
            {
            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1361); if (state.failed) return element;

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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a10).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_9, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a10, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[86]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[87]);
            	}

            // Ep.g:1787:2: ( (a11= ',' (a12= TEXT ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==10) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Ep.g:1788:3: (a11= ',' (a12= TEXT ) )
            	    {
            	    // Ep.g:1788:3: (a11= ',' (a12= TEXT ) )
            	    // Ep.g:1789:4: a11= ',' (a12= TEXT )
            	    {
            	    a11=(Token)match(input,10,FOLLOW_10_in_parse_ep_Ernaehrungsplan1391); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_10_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[88]);
            	    			}

            	    // Ep.g:1803:4: (a12= TEXT )
            	    // Ep.g:1804:5: a12= TEXT
            	    {
            	    a12=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1417); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new ep.resource.ep.mopp.EpTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a12 != null) {
            	    						ep.resource.ep.IEpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            	    						tokenResolver.setOptions(getOptions());
            	    						ep.resource.ep.IEpTokenResolveResult result = getFreshTokenResolveResult();
            	    						tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), result);
            	    						Object resolvedObject = result.getResolvedToken();
            	    						if (resolvedObject == null) {
            	    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            	    						}
            	    						String resolved = (String) resolvedObject;
            	    						ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            	    						collectHiddenTokens(element);
            	    						registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Ernaehrungsplan, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), resolved, proxy);
            	    						if (proxy != null) {
            	    							Object value = proxy;
            	    							addObjectToList(element, ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE, value);
            	    							completedElement(value, false);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_10_0_0_1, proxy, true);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, proxy);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[89]);
            	    				addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[90]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[91]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[92]);
            	}

            a13=(Token)match(input,9,FOLLOW_9_in_parse_ep_Ernaehrungsplan1463); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[93]);
            	}

            a14=(Token)match(input,28,FOLLOW_28_in_parse_ep_Ernaehrungsplan1477); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createErnaehrungsplan();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_6_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getEpElement(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[94]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[95]);
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
    // Ep.g:1883:1: parse_ep_Gericht2Zutat returns [ep.Gericht2Zutat element = null] : a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' ;
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

            // Ep.g:1886:2: (a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')' )
            // Ep.g:1887:2: a0= 'zutat' a1= '(' (a2= TEXT ) a3= ',' (a4= TEXT ) a5= ',' (a6= TEXT ) a7= ')'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_ep_Gericht2Zutat1506); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[96]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_ep_Gericht2Zutat1520); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[97]);
            	}

            // Ep.g:1915:2: (a2= TEXT )
            // Ep.g:1916:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1538); if (state.failed) return element;

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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_2, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[98]);
            	}

            a3=(Token)match(input,10,FOLLOW_10_in_parse_ep_Gericht2Zutat1559); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[99]);
            	}

            // Ep.g:1965:2: (a4= TEXT )
            // Ep.g:1966:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1577); if (state.failed) return element;

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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Zutat proxy = ep.MetamodelFactory.eINSTANCE.createHauptbestandteil();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Gericht2Zutat, ep.Zutat>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatZutatReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_4, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[100]);
            	}

            a5=(Token)match(input,10,FOLLOW_10_in_parse_ep_Gericht2Zutat1598); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[101]);
            	}

            // Ep.g:2019:2: (a6= TEXT )
            // Ep.g:2020:3: a6= TEXT
            {
            a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1616); if (state.failed) return element;

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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				ep.Gericht proxy = ep.MetamodelFactory.eINSTANCE.createGericht();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new ep.resource.ep.mopp.EpContextDependentURIFragmentFactory<ep.Gericht2Zutat, ep.Gericht>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatGerichtReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_6, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[102]);
            	}

            a7=(Token)match(input,9,FOLLOW_9_in_parse_ep_Gericht2Zutat1637); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = ep.MetamodelFactory.eINSTANCE.createGericht2Zutat();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, ep.resource.ep.grammar.EpGrammarInformationProvider.EP_7_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(ep.MetamodelPackage.eINSTANCE.getGericht(), ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[103]);
            		addExpectedElement(null, ep.resource.ep.mopp.EpExpectationConstants.EXPECTATIONS[104]);
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
    // Ep.g:2076:1: parse_ep_Zutat returns [ep.Zutat element = null] : (c0= parse_ep_Hauptbestandteil |c1= parse_ep_Beilage |c2= parse_ep_Sauce );
    public final ep.Zutat parse_ep_Zutat() throws RecognitionException {
        ep.Zutat element =  null;

        int parse_ep_Zutat_StartIndex = input.index();

        ep.Hauptbestandteil c0 =null;

        ep.Beilage c1 =null;

        ep.Sauce c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Ep.g:2077:2: (c0= parse_ep_Hauptbestandteil |c1= parse_ep_Beilage |c2= parse_ep_Sauce )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt15=1;
                }
                break;
            case 11:
                {
                alt15=2;
                }
                break;
            case 16:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // Ep.g:2078:2: c0= parse_ep_Hauptbestandteil
                    {
                    pushFollow(FOLLOW_parse_ep_Hauptbestandteil_in_parse_ep_Zutat1662);
                    c0=parse_ep_Hauptbestandteil();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ep.g:2079:4: c1= parse_ep_Beilage
                    {
                    pushFollow(FOLLOW_parse_ep_Beilage_in_parse_ep_Zutat1672);
                    c1=parse_ep_Beilage();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Ep.g:2080:4: c2= parse_ep_Sauce
                    {
                    pushFollow(FOLLOW_parse_ep_Sauce_in_parse_ep_Zutat1682);
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
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1213 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_parse_ep_Ernaehrungsplan1243 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1269 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_parse_ep_Ernaehrungsplan1315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_ep_Ernaehrungsplan1329 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Ernaehrungsplan1343 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1361 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_parse_ep_Ernaehrungsplan1391 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Ernaehrungsplan1417 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_parse_ep_Ernaehrungsplan1463 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_ep_Ernaehrungsplan1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_ep_Gericht2Zutat1506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_ep_Gericht2Zutat1520 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1538 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Gericht2Zutat1559 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1577 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_ep_Gericht2Zutat1598 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_parse_ep_Gericht2Zutat1616 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_ep_Gericht2Zutat1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Hauptbestandteil_in_parse_ep_Zutat1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Beilage_in_parse_ep_Zutat1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_ep_Sauce_in_parse_ep_Zutat1682 = new BitSet(new long[]{0x0000000000000002L});

}