// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g 2014-03-20 00:55:29

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RegExLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int CLOSURE_EXP=4;
    public static final int UNION_EXP=5;
    public static final int CONCAT_EXP=6;
    public static final int LIST=7;
    public static final int LIT=8;
    public static final int WS=9;

    // delegates
    // delegators

    public RegExLexer() {;} 
    public RegExLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RegExLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:7:7: ( '(' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:8:7: ( ')' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:9:7: ( '*' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:9:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:10:7: ( '+' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:10:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "LIT"
    public final void mLIT() throws RecognitionException {
        try {
            int _type = LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:41:2: ( '0' | '1' | '2' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='2') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:46:2: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:46:4: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:8: ( T__10 | T__11 | T__12 | T__13 | LIT | WS )
        int alt1=6;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt1=1;
            }
            break;
        case ')':
            {
            alt1=2;
            }
            break;
        case '*':
            {
            alt1=3;
            }
            break;
        case '+':
            {
            alt1=4;
            }
            break;
        case '0':
        case '1':
        case '2':
            {
            alt1=5;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt1=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:34: LIT
                {
                mLIT(); 

                }
                break;
            case 6 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:1:38: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}