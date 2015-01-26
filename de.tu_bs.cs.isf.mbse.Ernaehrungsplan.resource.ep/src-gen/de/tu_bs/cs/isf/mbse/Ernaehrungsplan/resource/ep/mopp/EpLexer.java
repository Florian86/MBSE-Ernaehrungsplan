// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EpLexer extends Lexer {
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

    	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
    	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
    	
    	public void reportError(RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public EpLexer() {} 
    public EpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Ep.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:20:6: ( '(' )
            // Ep.g:20:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:21:7: ( ')' )
            // Ep.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:22:7: ( ',' )
            // Ep.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:23:7: ( 'Beilage' )
            // Ep.g:23:9: 'Beilage'
            {
            match("Beilage"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:24:7: ( 'Ernaehrungsplan' )
            // Ep.g:24:9: 'Ernaehrungsplan'
            {
            match("Ernaehrungsplan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:25:7: ( 'Gericht' )
            // Ep.g:25:9: 'Gericht'
            {
            match("Gericht"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:26:7: ( 'Hauptbestandteil' )
            // Ep.g:26:9: 'Hauptbestandteil'
            {
            match("Hauptbestandteil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:27:7: ( 'Person' )
            // Ep.g:27:9: 'Person'
            {
            match("Person"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:28:7: ( 'Sauce' )
            // Ep.g:28:9: 'Sauce'
            {
            match("Sauce"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:29:7: ( 'besteht aus' )
            // Ep.g:29:9: 'besteht aus'
            {
            match("besteht aus"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:30:7: ( 'eplan' )
            // Ep.g:30:9: 'eplan'
            {
            match("eplan"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:31:7: ( 'gerichte' )
            // Ep.g:31:9: 'gerichte'
            {
            match("gerichte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:32:7: ( 'istSalat' )
            // Ep.g:32:9: 'istSalat'
            {
            match("istSalat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:33:7: ( 'ja' )
            // Ep.g:33:9: 'ja'
            {
            match("ja"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:34:7: ( 'kommentar' )
            // Ep.g:34:9: 'kommentar'
            {
            match("kommentar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:35:7: ( 'name' )
            // Ep.g:35:9: 'name'
            {
            match("name"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:36:7: ( 'nein' )
            // Ep.g:36:9: 'nein'
            {
            match("nein"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:37:7: ( 'person' )
            // Ep.g:37:9: 'person'
            {
            match("person"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:38:7: ( 'zutat' )
            // Ep.g:38:9: 'zutat'
            {
            match("zutat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:39:7: ( '{' )
            // Ep.g:39:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:40:7: ( '}' )
            // Ep.g:40:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:2261:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )+ ) )
            // Ep.g:2262:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )+ )
            {
            // Ep.g:2262:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )+ )
            // Ep.g:2262:3: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )+
            {
            // Ep.g:2262:3: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ep.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:2264:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Ep.g:2265:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Ep.g:2265:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Ep.g:2265:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Ep.g:2265:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Ep.g:2265:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Ep.g:2265:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Ep.g:2265:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:2268:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Ep.g:2269:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:2272:8: ( ( ( '0' .. '9' ) ) )
            // Ep.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ep.g:2275:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // Ep.g:2276:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // Ep.g:2276:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // Ep.g:2276:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // Ep.g:2276:3: ( '\"' )
            // Ep.g:2276:4: '\"'
            {
            match('\"'); 

            }


            // Ep.g:2276:8: (~ ( '\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ep.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // Ep.g:2276:17: ( '\"' )
            // Ep.g:2276:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // Ep.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | TEXT | LINEBREAK | WHITESPACE | INTEGER | QUOTED_34_34 )
        int alt4=26;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Ep.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Ep.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Ep.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Ep.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Ep.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Ep.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // Ep.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // Ep.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // Ep.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // Ep.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // Ep.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // Ep.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // Ep.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // Ep.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // Ep.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // Ep.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // Ep.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // Ep.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // Ep.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // Ep.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // Ep.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // Ep.g:1:135: TEXT
                {
                mTEXT(); 


                }
                break;
            case 23 :
                // Ep.g:1:140: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 24 :
                // Ep.g:1:150: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 25 :
                // Ep.g:1:161: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 26 :
                // Ep.g:1:169: QUOTED_34_34
                {
                mQUOTED_34_34(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\4\uffff\17\25\7\uffff\12\25\1\64\17\25\1\uffff\20\25\1\124\1\125"+
        "\7\25\1\135\1\25\1\137\3\25\2\uffff\1\25\1\144\4\25\1\151\1\uffff"+
        "\1\25\1\uffff\3\25\1\156\1\uffff\1\157\1\25\1\161\1\25\1\uffff\4"+
        "\25\2\uffff\1\25\1\uffff\1\25\1\uffff\1\171\1\172\3\25\2\uffff\1"+
        "\176\2\25\1\uffff\10\25\1\u0089\1\25\1\uffff\1\u008b\1\uffff";
    static final String DFA4_eofS =
        "\u008c\uffff";
    static final String DFA4_minS =
        "\1\11\3\uffff\1\145\1\162\1\145\1\141\1\145\1\141\1\145\1\160\1"+
        "\145\1\163\1\141\1\157\1\141\1\145\1\165\7\uffff\1\151\1\156\1\162"+
        "\1\165\1\162\1\165\1\163\1\154\1\162\1\164\1\55\2\155\1\151\1\162"+
        "\1\164\1\154\1\141\1\151\1\160\1\163\1\143\1\164\1\141\1\151\1\123"+
        "\1\uffff\1\155\1\145\1\156\1\163\2\141\1\145\1\143\1\164\1\157\2"+
        "\145\1\156\1\143\1\141\1\145\2\55\1\157\1\164\1\147\2\150\1\142"+
        "\1\156\1\55\1\150\1\55\1\150\1\154\1\156\2\uffff\1\156\1\55\1\145"+
        "\1\162\1\164\1\145\1\55\1\uffff\1\164\1\uffff\1\164\1\141\1\164"+
        "\1\55\1\uffff\1\55\1\165\1\55\1\163\1\uffff\1\40\1\145\1\164\1\141"+
        "\2\uffff\1\156\1\uffff\1\164\1\uffff\2\55\1\162\1\147\1\141\2\uffff"+
        "\1\55\1\163\1\156\1\uffff\1\160\1\144\1\154\1\164\1\141\1\145\1"+
        "\156\1\151\1\55\1\154\1\uffff\1\55\1\uffff";
    static final String DFA4_maxS =
        "\1\175\3\uffff\1\145\1\162\1\145\1\141\1\145\1\141\1\145\1\160\1"+
        "\145\1\163\1\141\1\157\2\145\1\165\7\uffff\1\151\1\156\1\162\1\165"+
        "\1\162\1\165\1\163\1\154\1\162\1\164\1\172\2\155\1\151\1\162\1\164"+
        "\1\154\1\141\1\151\1\160\1\163\1\143\1\164\1\141\1\151\1\123\1\uffff"+
        "\1\155\1\145\1\156\1\163\2\141\1\145\1\143\1\164\1\157\2\145\1\156"+
        "\1\143\1\141\1\145\2\172\1\157\1\164\1\147\2\150\1\142\1\156\1\172"+
        "\1\150\1\172\1\150\1\154\1\156\2\uffff\1\156\1\172\1\145\1\162\1"+
        "\164\1\145\1\172\1\uffff\1\164\1\uffff\1\164\1\141\1\164\1\172\1"+
        "\uffff\1\172\1\165\1\172\1\163\1\uffff\1\40\1\145\1\164\1\141\2"+
        "\uffff\1\156\1\uffff\1\164\1\uffff\2\172\1\162\1\147\1\141\2\uffff"+
        "\1\172\1\163\1\156\1\uffff\1\160\1\144\1\154\1\164\1\141\1\145\1"+
        "\156\1\151\1\172\1\154\1\uffff\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\17\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\32\uffff\1\16\37\uffff\1\20\1\21\7\uffff\1\11\1\uffff\1\13\4\uffff"+
        "\1\23\4\uffff\1\10\4\uffff\1\22\1\4\1\uffff\1\6\1\uffff\1\12\5\uffff"+
        "\1\14\1\15\3\uffff\1\17\12\uffff\1\5\1\uffff\1\7";
    static final String DFA4_specialS =
        "\u008c\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\27\1\26\1\uffff\1\27\1\26\22\uffff\1\27\1\uffff\1\31\5\uffff"+
            "\1\1\1\2\2\uffff\1\3\1\25\2\uffff\12\30\7\uffff\1\25\1\4\2\25"+
            "\1\5\1\25\1\6\1\7\7\25\1\10\2\25\1\11\7\25\4\uffff\1\25\1\uffff"+
            "\1\25\1\12\2\25\1\13\1\25\1\14\1\25\1\15\1\16\1\17\2\25\1\20"+
            "\1\25\1\21\11\25\1\22\1\23\1\uffff\1\24",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46\3\uffff\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\136",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\160",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\1\167",
            "",
            "\1\170",
            "",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u008a",
            "",
            "\1\25\23\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | TEXT | LINEBREAK | WHITESPACE | INTEGER | QUOTED_34_34 );";
        }
    }
 

}