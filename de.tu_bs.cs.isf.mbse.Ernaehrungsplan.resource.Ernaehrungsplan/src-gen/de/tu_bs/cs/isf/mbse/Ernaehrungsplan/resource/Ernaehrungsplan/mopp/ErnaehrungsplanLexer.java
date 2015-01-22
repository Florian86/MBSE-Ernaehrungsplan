// $ANTLR 3.4

	package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ErnaehrungsplanLexer extends Lexer {
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

    public ErnaehrungsplanLexer() {} 
    public ErnaehrungsplanLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ErnaehrungsplanLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Ernaehrungsplan.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:20:6: ( ';' )
            // Ernaehrungsplan.g:20:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:21:6: ( 'abstract' )
            // Ernaehrungsplan.g:21:8: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:22:6: ( 'att' )
            // Ernaehrungsplan.g:22:8: 'att'
            {
            match("att"); 



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
            // Ernaehrungsplan.g:23:7: ( 'cont' )
            // Ernaehrungsplan.g:23:9: 'cont'
            {
            match("cont"); 



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
            // Ernaehrungsplan.g:24:7: ( 'datatype' )
            // Ernaehrungsplan.g:24:9: 'datatype'
            {
            match("datatype"); 



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
            // Ernaehrungsplan.g:25:7: ( 'entity' )
            // Ernaehrungsplan.g:25:9: 'entity'
            {
            match("entity"); 



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
            // Ernaehrungsplan.g:26:7: ( 'model' )
            // Ernaehrungsplan.g:26:9: 'model'
            {
            match("model"); 



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
            // Ernaehrungsplan.g:27:7: ( 'ref' )
            // Ernaehrungsplan.g:27:9: 'ref'
            {
            match("ref"); 



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
            // Ernaehrungsplan.g:28:7: ( '{' )
            // Ernaehrungsplan.g:28:9: '{'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:29:7: ( '}' )
            // Ernaehrungsplan.g:29:9: '}'
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
    // $ANTLR end "T__16"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:949:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Ernaehrungsplan.g:950:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Ernaehrungsplan.g:950:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Ernaehrungsplan.g:950:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Ernaehrungsplan.g:950:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ernaehrungsplan.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:952:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Ernaehrungsplan.g:953:2: ( ( ' ' | '\\t' | '\\f' ) )
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

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Ernaehrungsplan.g:956:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Ernaehrungsplan.g:957:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Ernaehrungsplan.g:957:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Ernaehrungsplan.g:957:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Ernaehrungsplan.g:957:3: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Ernaehrungsplan.g:957:4: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Ernaehrungsplan.g:957:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Ernaehrungsplan.g:957:20: '\\n'
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

    public void mTokens() throws RecognitionException {
        // Ernaehrungsplan.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | TEXT | WHITESPACE | LINEBREAK )
        int alt3=13;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt3=1;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'b':
                {
                int LA3_13 = input.LA(3);

                if ( (LA3_13=='s') ) {
                    int LA3_20 = input.LA(4);

                    if ( (LA3_20=='t') ) {
                        int LA3_27 = input.LA(5);

                        if ( (LA3_27=='r') ) {
                            int LA3_34 = input.LA(6);

                            if ( (LA3_34=='a') ) {
                                int LA3_39 = input.LA(7);

                                if ( (LA3_39=='c') ) {
                                    int LA3_43 = input.LA(8);

                                    if ( (LA3_43=='t') ) {
                                        int LA3_46 = input.LA(9);

                                        if ( (LA3_46=='-'||(LA3_46 >= '0' && LA3_46 <= '9')||(LA3_46 >= 'A' && LA3_46 <= 'Z')||LA3_46=='_'||(LA3_46 >= 'a' && LA3_46 <= 'z')) ) {
                                            alt3=11;
                                        }
                                        else {
                                            alt3=2;
                                        }
                                    }
                                    else {
                                        alt3=11;
                                    }
                                }
                                else {
                                    alt3=11;
                                }
                            }
                            else {
                                alt3=11;
                            }
                        }
                        else {
                            alt3=11;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
                }
                break;
            case 't':
                {
                int LA3_14 = input.LA(3);

                if ( (LA3_14=='t') ) {
                    int LA3_21 = input.LA(4);

                    if ( (LA3_21=='-'||(LA3_21 >= '0' && LA3_21 <= '9')||(LA3_21 >= 'A' && LA3_21 <= 'Z')||LA3_21=='_'||(LA3_21 >= 'a' && LA3_21 <= 'z')) ) {
                        alt3=11;
                    }
                    else {
                        alt3=3;
                    }
                }
                else {
                    alt3=11;
                }
                }
                break;
            default:
                alt3=11;
            }

            }
            break;
        case 'c':
            {
            int LA3_3 = input.LA(2);

            if ( (LA3_3=='o') ) {
                int LA3_15 = input.LA(3);

                if ( (LA3_15=='n') ) {
                    int LA3_22 = input.LA(4);

                    if ( (LA3_22=='t') ) {
                        int LA3_29 = input.LA(5);

                        if ( (LA3_29=='-'||(LA3_29 >= '0' && LA3_29 <= '9')||(LA3_29 >= 'A' && LA3_29 <= 'Z')||LA3_29=='_'||(LA3_29 >= 'a' && LA3_29 <= 'z')) ) {
                            alt3=11;
                        }
                        else {
                            alt3=4;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'd':
            {
            int LA3_4 = input.LA(2);

            if ( (LA3_4=='a') ) {
                int LA3_16 = input.LA(3);

                if ( (LA3_16=='t') ) {
                    int LA3_23 = input.LA(4);

                    if ( (LA3_23=='a') ) {
                        int LA3_30 = input.LA(5);

                        if ( (LA3_30=='t') ) {
                            int LA3_36 = input.LA(6);

                            if ( (LA3_36=='y') ) {
                                int LA3_40 = input.LA(7);

                                if ( (LA3_40=='p') ) {
                                    int LA3_44 = input.LA(8);

                                    if ( (LA3_44=='e') ) {
                                        int LA3_47 = input.LA(9);

                                        if ( (LA3_47=='-'||(LA3_47 >= '0' && LA3_47 <= '9')||(LA3_47 >= 'A' && LA3_47 <= 'Z')||LA3_47=='_'||(LA3_47 >= 'a' && LA3_47 <= 'z')) ) {
                                            alt3=11;
                                        }
                                        else {
                                            alt3=5;
                                        }
                                    }
                                    else {
                                        alt3=11;
                                    }
                                }
                                else {
                                    alt3=11;
                                }
                            }
                            else {
                                alt3=11;
                            }
                        }
                        else {
                            alt3=11;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'e':
            {
            int LA3_5 = input.LA(2);

            if ( (LA3_5=='n') ) {
                int LA3_17 = input.LA(3);

                if ( (LA3_17=='t') ) {
                    int LA3_24 = input.LA(4);

                    if ( (LA3_24=='i') ) {
                        int LA3_31 = input.LA(5);

                        if ( (LA3_31=='t') ) {
                            int LA3_37 = input.LA(6);

                            if ( (LA3_37=='y') ) {
                                int LA3_41 = input.LA(7);

                                if ( (LA3_41=='-'||(LA3_41 >= '0' && LA3_41 <= '9')||(LA3_41 >= 'A' && LA3_41 <= 'Z')||LA3_41=='_'||(LA3_41 >= 'a' && LA3_41 <= 'z')) ) {
                                    alt3=11;
                                }
                                else {
                                    alt3=6;
                                }
                            }
                            else {
                                alt3=11;
                            }
                        }
                        else {
                            alt3=11;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'm':
            {
            int LA3_6 = input.LA(2);

            if ( (LA3_6=='o') ) {
                int LA3_18 = input.LA(3);

                if ( (LA3_18=='d') ) {
                    int LA3_25 = input.LA(4);

                    if ( (LA3_25=='e') ) {
                        int LA3_32 = input.LA(5);

                        if ( (LA3_32=='l') ) {
                            int LA3_38 = input.LA(6);

                            if ( (LA3_38=='-'||(LA3_38 >= '0' && LA3_38 <= '9')||(LA3_38 >= 'A' && LA3_38 <= 'Z')||LA3_38=='_'||(LA3_38 >= 'a' && LA3_38 <= 'z')) ) {
                                alt3=11;
                            }
                            else {
                                alt3=7;
                            }
                        }
                        else {
                            alt3=11;
                        }
                    }
                    else {
                        alt3=11;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case 'r':
            {
            int LA3_7 = input.LA(2);

            if ( (LA3_7=='e') ) {
                int LA3_19 = input.LA(3);

                if ( (LA3_19=='f') ) {
                    int LA3_26 = input.LA(4);

                    if ( (LA3_26=='-'||(LA3_26 >= '0' && LA3_26 <= '9')||(LA3_26 >= 'A' && LA3_26 <= 'Z')||LA3_26=='_'||(LA3_26 >= 'a' && LA3_26 <= 'z')) ) {
                        alt3=11;
                    }
                    else {
                        alt3=8;
                    }
                }
                else {
                    alt3=11;
                }
            }
            else {
                alt3=11;
            }
            }
            break;
        case '{':
            {
            alt3=9;
            }
            break;
        case '}':
            {
            alt3=10;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'b':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=11;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt3=12;
            }
            break;
        case '\n':
        case '\r':
            {
            alt3=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // Ernaehrungsplan.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // Ernaehrungsplan.g:1:15: T__8
                {
                mT__8(); 


                }
                break;
            case 3 :
                // Ernaehrungsplan.g:1:20: T__9
                {
                mT__9(); 


                }
                break;
            case 4 :
                // Ernaehrungsplan.g:1:25: T__10
                {
                mT__10(); 


                }
                break;
            case 5 :
                // Ernaehrungsplan.g:1:31: T__11
                {
                mT__11(); 


                }
                break;
            case 6 :
                // Ernaehrungsplan.g:1:37: T__12
                {
                mT__12(); 


                }
                break;
            case 7 :
                // Ernaehrungsplan.g:1:43: T__13
                {
                mT__13(); 


                }
                break;
            case 8 :
                // Ernaehrungsplan.g:1:49: T__14
                {
                mT__14(); 


                }
                break;
            case 9 :
                // Ernaehrungsplan.g:1:55: T__15
                {
                mT__15(); 


                }
                break;
            case 10 :
                // Ernaehrungsplan.g:1:61: T__16
                {
                mT__16(); 


                }
                break;
            case 11 :
                // Ernaehrungsplan.g:1:67: TEXT
                {
                mTEXT(); 


                }
                break;
            case 12 :
                // Ernaehrungsplan.g:1:72: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 13 :
                // Ernaehrungsplan.g:1:83: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;

        }

    }


 

}