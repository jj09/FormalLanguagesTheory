// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g 2014-03-20 23:44:39

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class RegExParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLOSURE_EXP", "UNION_EXP", "CONCAT_EXP", "LIST", "LIT", "WS", "'('", "')'", "'*'", "'+'"
    };
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "union", "concat", "closure", "exp"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false
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
    public String getGrammarFileName() { return "C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g"; }


    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:23:1: exp : ( closure | union )* ;
    public final RegExParser.exp_return exp() throws RecognitionException {
        RegExParser.exp_return retval = new RegExParser.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RegExParser.closure_return closure1 = null;

        RegExParser.union_return union2 = null;



        try { dbg.enterRule(getGrammarFileName(), "exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:24:2: ( ( closure | union )* )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:24:4: ( closure | union )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(24,4);
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:24:4: ( closure | union )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }
                else if ( (LA1_0==LIT) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==12) ) {
                        alt1=1;
                    }
                    else if ( (LA1_3==EOF||LA1_3==LIT||LA1_3==10||LA1_3==13) ) {
                        alt1=2;
                    }


                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:24:5: closure
            	    {
            	    dbg.location(24,5);
            	    pushFollow(FOLLOW_closure_in_exp65);
            	    closure1=closure();

            	    state._fsp--;

            	    adaptor.addChild(root_0, closure1.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:24:15: union
            	    {
            	    dbg.location(24,15);
            	    pushFollow(FOLLOW_union_in_exp69);
            	    union2=union();

            	    state._fsp--;

            	    adaptor.addChild(root_0, union2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(25, 2);

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
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:27:1: closure : ( '(' union ')' '*' -> ^( CLOSURE_EXP union ) | LIT '*' -> ^( CLOSURE_EXP LIT ) );
    public final RegExParser.closure_return closure() throws RecognitionException {
        RegExParser.closure_return retval = new RegExParser.closure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        Token char_literal6=null;
        Token LIT7=null;
        Token char_literal8=null;
        RegExParser.union_return union4 = null;


        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object LIT7_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");
        RewriteRuleTokenStream stream_11=new RewriteRuleTokenStream(adaptor,"token 11");
        RewriteRuleTokenStream stream_LIT=new RewriteRuleTokenStream(adaptor,"token LIT");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_union=new RewriteRuleSubtreeStream(adaptor,"rule union");
        try { dbg.enterRule(getGrammarFileName(), "closure");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:28:2: ( '(' union ')' '*' -> ^( CLOSURE_EXP union ) | LIT '*' -> ^( CLOSURE_EXP LIT ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( (LA2_0==LIT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:28:4: '(' union ')' '*'
                    {
                    dbg.location(28,4);
                    char_literal3=(Token)match(input,10,FOLLOW_10_in_closure84);  
                    stream_10.add(char_literal3);

                    dbg.location(28,8);
                    pushFollow(FOLLOW_union_in_closure86);
                    union4=union();

                    state._fsp--;

                    stream_union.add(union4.getTree());
                    dbg.location(28,14);
                    char_literal5=(Token)match(input,11,FOLLOW_11_in_closure88);  
                    stream_11.add(char_literal5);

                    dbg.location(28,18);
                    char_literal6=(Token)match(input,12,FOLLOW_12_in_closure90);  
                    stream_12.add(char_literal6);



                    // AST REWRITE
                    // elements: union
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:22: -> ^( CLOSURE_EXP union )
                    {
                        dbg.location(28,25);
                        // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:28:25: ^( CLOSURE_EXP union )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(28,27);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLOSURE_EXP, "CLOSURE_EXP"), root_1);

                        dbg.location(28,39);
                        adaptor.addChild(root_1, stream_union.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:28:48: LIT '*'
                    {
                    dbg.location(28,48);
                    LIT7=(Token)match(input,LIT,FOLLOW_LIT_in_closure102);  
                    stream_LIT.add(LIT7);

                    dbg.location(28,52);
                    char_literal8=(Token)match(input,12,FOLLOW_12_in_closure104);  
                    stream_12.add(char_literal8);



                    // AST REWRITE
                    // elements: LIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:56: -> ^( CLOSURE_EXP LIT )
                    {
                        dbg.location(28,59);
                        // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:28:59: ^( CLOSURE_EXP LIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(28,61);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLOSURE_EXP, "CLOSURE_EXP"), root_1);

                        dbg.location(28,73);
                        adaptor.addChild(root_1, stream_LIT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        dbg.location(29, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "closure");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "closure"

    public static class union_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "union"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:32:1: union : concat ( '+' concat )* -> ^( UNION_EXP ( concat )* ) ;
    public final RegExParser.union_return union() throws RecognitionException {
        RegExParser.union_return retval = new RegExParser.union_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        RegExParser.concat_return concat9 = null;

        RegExParser.concat_return concat11 = null;


        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_concat=new RewriteRuleSubtreeStream(adaptor,"rule concat");
        try { dbg.enterRule(getGrammarFileName(), "union");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:2: ( concat ( '+' concat )* -> ^( UNION_EXP ( concat )* ) )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:4: concat ( '+' concat )*
            {
            dbg.location(33,4);
            pushFollow(FOLLOW_concat_in_union126);
            concat9=concat();

            state._fsp--;

            stream_concat.add(concat9.getTree());
            dbg.location(33,11);
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:11: ( '+' concat )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:12: '+' concat
            	    {
            	    dbg.location(33,12);
            	    char_literal10=(Token)match(input,13,FOLLOW_13_in_union129);  
            	    stream_13.add(char_literal10);

            	    dbg.location(33,16);
            	    pushFollow(FOLLOW_concat_in_union131);
            	    concat11=concat();

            	    state._fsp--;

            	    stream_concat.add(concat11.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: concat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:25: -> ^( UNION_EXP ( concat )* )
            {
                dbg.location(33,28);
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:28: ^( UNION_EXP ( concat )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(33,30);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNION_EXP, "UNION_EXP"), root_1);

                dbg.location(33,40);
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:33:40: ( concat )*
                while ( stream_concat.hasNext() ) {
                    dbg.location(33,40);
                    adaptor.addChild(root_1, stream_concat.nextTree());

                }
                stream_concat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(34, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "union");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "union"

    public static class concat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concat"
    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:36:1: concat : ( LIT )+ -> ^( CONCAT_EXP ( LIT )+ ) ;
    public final RegExParser.concat_return concat() throws RecognitionException {
        RegExParser.concat_return retval = new RegExParser.concat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LIT12=null;

        Object LIT12_tree=null;
        RewriteRuleTokenStream stream_LIT=new RewriteRuleTokenStream(adaptor,"token LIT");

        try { dbg.enterRule(getGrammarFileName(), "concat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:37:2: ( ( LIT )+ -> ^( CONCAT_EXP ( LIT )+ ) )
            dbg.enterAlt(1);

            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:37:4: ( LIT )+
            {
            dbg.location(37,4);
            // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:37:4: ( LIT )+
            int cnt4=0;
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==LIT) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:37:4: LIT
            	    {
            	    dbg.location(37,4);
            	    LIT12=(Token)match(input,LIT,FOLLOW_LIT_in_concat154);  
            	    stream_LIT.add(LIT12);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt4++;
            } while (true);
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: LIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:9: -> ^( CONCAT_EXP ( LIT )+ )
            {
                dbg.location(37,12);
                // C:\\SkyDrive\\KSU\\CIS770 - Formal Languages Theory\\workspace\\Assignment2\\src\\parser\\RegEx.g:37:12: ^( CONCAT_EXP ( LIT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(37,14);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONCAT_EXP, "CONCAT_EXP"), root_1);

                dbg.location(37,25);
                if ( !(stream_LIT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_LIT.hasNext() ) {
                    dbg.location(37,25);
                    adaptor.addChild(root_1, stream_LIT.nextNode());

                }
                stream_LIT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(38, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "concat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "concat"

    // Delegated rules


 

    public static final BitSet FOLLOW_closure_in_exp65 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_union_in_exp69 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_10_in_closure84 = new BitSet(new long[]{0x0000000000000D00L});
    public static final BitSet FOLLOW_union_in_closure86 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_closure88 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_closure90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIT_in_closure102 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_closure104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concat_in_union126 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_union129 = new BitSet(new long[]{0x0000000000002500L});
    public static final BitSet FOLLOW_concat_in_union131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_LIT_in_concat154 = new BitSet(new long[]{0x0000000000000102L});

}