// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g 2014-03-19 01:00:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RegExLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int WS=4;

    // delegates
    // delegators

    public RegExLexer() {;} 
    public RegExLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RegExLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:3:6: ( '[' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:3:8: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:4:6: ( ']' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:4:8: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:5:6: ( '(' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:5:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:6:6: ( ')' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:6:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:7:6: ( '*' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:7:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:7: ( '0' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:9: '0'
            {
            match('0'); 

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
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:9:7: ( '1' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:9:9: '1'
            {
            match('1'); 

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
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:10:7: ( '2' )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:10:9: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:26:2: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:26:4: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
        // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | WS )
        int alt1=9;
        switch ( input.LA(1) ) {
        case '[':
            {
            alt1=1;
            }
            break;
        case ']':
            {
            alt1=2;
            }
            break;
        case '(':
            {
            alt1=3;
            }
            break;
        case ')':
            {
            alt1=4;
            }
            break;
        case '*':
            {
            alt1=5;
            }
            break;
        case '0':
            {
            alt1=6;
            }
            break;
        case '1':
            {
            alt1=7;
            }
            break;
        case '2':
            {
            alt1=8;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt1=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:25: T__8
                {
                mT__8(); 

                }
                break;
            case 5 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:30: T__9
                {
                mT__9(); 

                }
                break;
            case 6 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:35: T__10
                {
                mT__10(); 

                }
                break;
            case 7 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:41: T__11
                {
                mT__11(); 

                }
                break;
            case 8 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:47: T__12
                {
                mT__12(); 

                }
                break;
            case 9 :
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:1:53: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}