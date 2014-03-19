// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g 2014-03-19 01:00:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RegExParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "'['", "']'", "'('", "')'", "'*'", "'0'", "'1'", "'2'"
    };
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "orExp", "closure", "exp"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public RegExParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public RegExParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public RegExParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return RegExParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g"; }


    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:7:1: exp : '[' ( closure | orExp )* ']' ;
    public final RegExParser.exp_return exp() throws RecognitionException {
        RegExParser.exp_return retval = new RegExParser.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal1=null;
        Token char_literal4=null;
        RegExParser.closure_return closure2 = null;

        RegExParser.orExp_return orExp3 = null;


        Object char_literal1_tree=null;
        Object char_literal4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:2: ( '[' ( closure | orExp )* ']' )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:4: '[' ( closure | orExp )* ']'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(8,4);
            char_literal1=(Token)match(input,5,FOLLOW_5_in_exp25); 
            char_literal1_tree = (Object)adaptor.create(char_literal1);
            adaptor.addChild(root_0, char_literal1_tree);

            dbg.location(8,8);
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:8: ( closure | orExp )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>=10 && LA1_0<=12)) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:9: closure
            	    {
            	    dbg.location(8,9);
            	    pushFollow(FOLLOW_closure_in_exp28);
            	    closure2=closure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, closure2.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:8:19: orExp
            	    {
            	    dbg.location(8,19);
            	    pushFollow(FOLLOW_orExp_in_exp32);
            	    orExp3=orExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, orExp3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(8,27);
            char_literal4=(Token)match(input,6,FOLLOW_6_in_exp36); 
            char_literal4_tree = (Object)adaptor.create(char_literal4);
            adaptor.addChild(root_0, char_literal4_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(9, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exp"

    public static class closure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "closure"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:11:1: closure : '(' orExp ')' '*' ;
    public final RegExParser.closure_return closure() throws RecognitionException {
        RegExParser.closure_return retval = new RegExParser.closure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal7=null;
        Token char_literal8=null;
        RegExParser.orExp_return orExp6 = null;


        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        Object char_literal8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "closure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:12:2: ( '(' orExp ')' '*' )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:12:4: '(' orExp ')' '*'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(12,4);
            char_literal5=(Token)match(input,7,FOLLOW_7_in_closure49); 
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            dbg.location(12,8);
            pushFollow(FOLLOW_orExp_in_closure51);
            orExp6=orExp();

            state._fsp--;

            adaptor.addChild(root_0, orExp6.getTree());
            dbg.location(12,14);
            char_literal7=(Token)match(input,8,FOLLOW_8_in_closure53); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);

            dbg.location(12,18);
            char_literal8=(Token)match(input,9,FOLLOW_9_in_closure55); 
            char_literal8_tree = (Object)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(13, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "closure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "closure"

    public static class orExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExp"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:16:1: orExp : ( '0' | '1' | '2' );
    public final RegExParser.orExp_return orExp() throws RecognitionException {
        RegExParser.orExp_return retval = new RegExParser.orExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;

        Object set9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "orExp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:21:2: ( '0' | '1' | '2' )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\RegEx.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(21,2);
            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=10 && input.LA(1)<=12) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set9));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(22, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "orExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_5_in_exp25 = new BitSet(new long[]{0x0000000000001CC0L});
    public static final BitSet FOLLOW_closure_in_exp28 = new BitSet(new long[]{0x0000000000001CC0L});
    public static final BitSet FOLLOW_orExp_in_exp32 = new BitSet(new long[]{0x0000000000001CC0L});
    public static final BitSet FOLLOW_6_in_exp36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_closure49 = new BitSet(new long[]{0x0000000000001C80L});
    public static final BitSet FOLLOW_orExp_in_closure51 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_closure53 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_closure55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orExp0 = new BitSet(new long[]{0x0000000000000002L});

}