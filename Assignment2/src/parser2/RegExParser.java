// Generated from C:\SkyDrive\KSU\CIS770 - Formal Languages Theory\workspace\Assignment2\src\parser2\RegEx.g4 by ANTLR 4.1
package parser2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegExParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, LIT=5, WS=6, CLOSURE_EXP=7, UNION_EXP=8, 
		CONCAT_EXP=9, LIST=10;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'*'", "'('", "LIT", "WS", "CLOSURE_EXP", "UNION_EXP", 
		"CONCAT_EXP", "LIST"
	};
	public static final int
		RULE_exp = 0, RULE_closure = 1, RULE_union = 2, RULE_concat = 3;
	public static final String[] ruleNames = {
		"exp", "closure", "union", "concat"
	};

	@Override
	public String getGrammarFileName() { return "RegEx.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegExParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public List<ClosureContext> closure() {
			return getRuleContexts(ClosureContext.class);
		}
		public ClosureContext closure(int i) {
			return getRuleContext(ClosureContext.class,i);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegExVisitor ) return ((RegExVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==LIT) {
				{
				setState(10);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(8); closure();
					}
					break;
				case LIT:
					{
					setState(9); union();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureContext extends ParserRuleContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public ClosureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegExVisitor ) return ((RegExVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureContext closure() throws RecognitionException {
		ClosureContext _localctx = new ClosureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); match(4);
			setState(16); union();
			setState(17); match(1);
			setState(18); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public List<ConcatContext> concat() {
			return getRuleContexts(ConcatContext.class);
		}
		public ConcatContext concat(int i) {
			return getRuleContext(ConcatContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegExVisitor ) return ((RegExVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); concat();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(21); match(2);
				setState(22); concat();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatContext extends ParserRuleContext {
		public List<TerminalNode> LIT() { return getTokens(RegExParser.LIT); }
		public TerminalNode LIT(int i) {
			return getToken(RegExParser.LIT, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegExVisitor ) return ((RegExVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(28); match(LIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\f$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\7\4\32\n\4\f\4\16\4\35\13\4\3\5\6\5 \n\5\r\5\16\5!\3"+
		"\5\2\6\2\4\6\b\2\2#\2\16\3\2\2\2\4\21\3\2\2\2\6\26\3\2\2\2\b\37\3\2\2"+
		"\2\n\r\5\4\3\2\13\r\5\6\4\2\f\n\3\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f"+
		"\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\16\3\2\2\2\21\22\7\6\2\2\22\23"+
		"\5\6\4\2\23\24\7\3\2\2\24\25\7\5\2\2\25\5\3\2\2\2\26\33\5\b\5\2\27\30"+
		"\7\4\2\2\30\32\5\b\5\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\7\3\2\2\2\35\33\3\2\2\2\36 \7\7\2\2\37\36\3\2\2\2 !\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"\t\3\2\2\2\6\f\16\33!";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}