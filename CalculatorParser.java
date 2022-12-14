// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			INT=1, DOT=2, TIMES=3, DIV=4, PLUS=5, MINUS=6, INTEGRAL=7, WS=8, POV=9;
	public static final int
			RULE_expression = 0, RULE_multiplyingExpression = 1, RULE_integralExpression = 2, RULE_PovExpression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
				"expression", "multiplyingExpression", "integralExpression", "PovExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, null, "'('", "')'", "','", "'.'", "'^'", "'sqrt'", "'*'", "'/'",
				"'+'", "'-'", "'cal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "INT", "DOT", "TIMES", "DIV", "PLUS", "MINUS", "INTEGRAL", "WS", "POV"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiExpressionContext> multiExpression() {
			return getRuleContexts(MultiExpressionContext.class);
		}
		public MultiExpressionContext multiExpression(int i) {
			return getRuleContext(MultiExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CalculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CalculatorParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(8);
				multiExpression();
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
						{
							setState(9);
							_la = _input.LA(1);
							if ( !(_la==PLUS || _la==MINUS) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(10);
							multiExpression();
						}
					}
					setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalculatorParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CalculatorParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CalculatorParser.DIV, i);
		}
		public MultiExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMultiExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMultiExpression(this);
		}
	}

	public final MultiExpressionContext multiExpression() throws RecognitionException {
		MultiExpressionContext _localctx = new MultiExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(16);
				powExpression();
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TIMES || _la==DIV) {
					{
						{
							setState(17);
							_la = _input.LA(1);
							if ( !(_la==TIMES || _la==DIV) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(18);
							powExpression();
						}
					}
					setState(23);
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
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<IntegralExpressionContext> integralExpression() {
			return getRuleContexts(IntegralExpressionContext.class);
		}
		public IntegralExpressionContext integralExpression(int i) {
			return getRuleContext(IntegralExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalculatorParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CalculatorParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CalculatorParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExpressionContext extends ParserRuleContext {
		public List<IntegralExpressionContext> floatExpression() {
			return getRuleContexts(IntegralExpressionContext.class);
		}
		public IntegralExpressionContext floatExpression(int i) {
			return getRuleContext(IntegralExpressionContext.class,i);
		}
		public List<TerminalNode> POV() { return getTokens(CalculatorParser.POV); }
		public TerminalNode POV(int i) {
			return getToken(CalculatorParser.POV, i);
		}
		public List<TerminalNode> SQRT() { return getTokens(CalculatorParser.SQRT); }
		public TerminalNode SQRT(int i) {
			return getToken(CalculatorParser.SQRT, i);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPowExpression(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				floatExpression();
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POW || _la==SQRT) {
					{
						{
							setState(25);
							_la = _input.LA(1);
							if ( !(_la==POW || _la==SQRT) ) {
								_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(26);
							floatExpression();
						}
					}
					setState(31);
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



	public static final String _serializedATN =
			"\u0004\u0001\r&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
					"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001\u0017"+
					"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002"+
					"\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
					"\u0003$\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
					"\u0000\u0003\u0001\u0000\n\u000b\u0001\u0000\b\t\u0001\u0000\u0006\u0007"+
					"%\u0000\b\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000"+
					"\u0004\u0018\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b"+
					"\r\u0003\u0002\u0001\u0000\t\n\u0007\u0000\u0000\u0000\n\f\u0003\u0002"+
					"\u0001\u0000\u000b\t\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000"+
					"\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
					"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010"+
					"\u0015\u0003\u0004\u0002\u0000\u0011\u0012\u0007\u0001\u0000\u0000\u0012"+
					"\u0014\u0003\u0004\u0002\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014"+
					"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
					"\u0016\u0001\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017"+
					"\u0015\u0001\u0000\u0000\u0000\u0018\u001d\u0003\u0006\u0003\u0000\u0019"+
					"\u001a\u0007\u0002\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b"+
					"\u0019\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
					"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
					"\u0005\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005"+
					"\u000b\u0000\u0000!$\u0005\u0001\u0000\u0000\"$\u0005\u0001\u0000\u0000"+
					"# \u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0007\u0001\u0000"+
					"\u0000\u0000\u0004\r\u0015\u001d#";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}