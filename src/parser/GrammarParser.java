// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, FLOAT_CONSTANT=38, 
		CHAR_CONSTANT=39, IDENT=40, LINE_COMMENT=41, MULTILINE_COMMENT=42, WHITESPACE=43;
	public static final int
		RULE_start = 0, RULE_def = 1, RULE_type = 2, RULE_variable = 3, RULE_struct = 4, 
		RULE_field = 5, RULE_function = 6, RULE_params = 7, RULE_param = 8, RULE_sentence = 9, 
		RULE_expr = 10, RULE_paramss = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "def", "type", "variable", "struct", "field", "function", "params", 
			"param", "sentence", "expr", "paramss"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'float'", "'int'", "'char'", "'['", "']'", "'var'", "':'", "';'", 
			"'struct'", "'{'", "'}'", "'('", "')'", "','", "'read'", "'print'", "'printsp'", 
			"'println'", "'='", "'if'", "'else'", "'while'", "'return'", "'*'", "'/'", 
			"'+'", "'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_CONSTANT", "FLOAT_CONSTANT", "CHAR_CONSTANT", "IDENT", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Program ast;
		public DefContext def;
		public List<DefContext> l = new ArrayList<DefContext>();
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << IDENT))) != 0)) {
				{
				{
				setState(24);
				((StartContext)_localctx).def = def();
				((StartContext)_localctx).l.add(((StartContext)_localctx).def);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Program(((StartContext)_localctx).l); 
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

	public static class DefContext extends ParserRuleContext {
		public Definition ast;
		public VariableContext variable;
		public StructContext struct;
		public FunctionContext function;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((DefContext)_localctx).variable = variable();
				 ((DefContext)_localctx).ast =  ((DefContext)_localctx).variable.ast; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((DefContext)_localctx).struct = struct();
				 ((DefContext)_localctx).ast =  ((DefContext)_localctx).struct.ast; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((DefContext)_localctx).function = function();
				 ((DefContext)_localctx).ast =  ((DefContext)_localctx).function.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token IDENT;
		public Token INT_CONSTANT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__0);
				 ((TypeContext)_localctx).ast =  new FloatType(); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__1);
				 ((TypeContext)_localctx).ast =  new IntType(); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__2);
				 ((TypeContext)_localctx).ast =  new CharType(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).IDENT); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__3);
				setState(53);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(54);
				match(T__4);
				setState(55);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).type.ast, ((TypeContext)_localctx).INT_CONSTANT); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			((VariableContext)_localctx).IDENT = match(IDENT);
			setState(62);
			match(T__6);
			setState(63);
			((VariableContext)_localctx).type = type();
			setState(64);
			match(T__7);
			 ((VariableContext)_localctx).ast =  new VarDefinition(((VariableContext)_localctx).type.ast, ((VariableContext)_localctx).IDENT); 
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

	public static class StructContext extends ParserRuleContext {
		public StructDefinition ast;
		public Token name;
		public FieldContext field;
		public List<FieldContext> fields = new ArrayList<FieldContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__8);
			setState(68);
			((StructContext)_localctx).name = match(IDENT);
			setState(69);
			match(T__9);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(70);
				((StructContext)_localctx).field = field();
				((StructContext)_localctx).fields.add(((StructContext)_localctx).field);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__10);
			setState(77);
			match(T__7);
			 ((StructContext)_localctx).ast =  new StructDefinition(((StructContext)_localctx).name, ((StructContext)_localctx).fields); 
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

	public static class FieldContext extends ParserRuleContext {
		public StructField ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			((FieldContext)_localctx).IDENT = match(IDENT);
			setState(81);
			match(T__6);
			setState(82);
			((FieldContext)_localctx).type = type();
			setState(83);
			match(T__7);
			}
			 ((FieldContext)_localctx).ast =  new StructField(((FieldContext)_localctx).type.ast, ((FieldContext)_localctx).IDENT); 
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token IDENT;
		public ParamsContext params;
		public TypeContext type;
		public VariableContext variable;
		public List<VariableContext> v = new ArrayList<VariableContext>();
		public SentenceContext sentence;
		public List<SentenceContext> s = new ArrayList<SentenceContext>();
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((FunctionContext)_localctx).IDENT = match(IDENT);
			setState(88);
			match(T__11);
			setState(89);
			((FunctionContext)_localctx).params = params();
			setState(90);
			match(T__12);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(91);
				match(T__6);
				setState(92);
				((FunctionContext)_localctx).type = type();
				}
			}

			setState(95);
			match(T__9);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(96);
				((FunctionContext)_localctx).variable = variable();
				((FunctionContext)_localctx).v.add(((FunctionContext)_localctx).variable);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(102);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).s.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__10);
			 ((FunctionContext)_localctx).ast =  new FunctionDefinition(((FunctionContext)_localctx).IDENT, ((FunctionContext)_localctx).params.list, ((FunctionContext)_localctx).type != null ? ((FunctionContext)_localctx).type.ast : null, ((FunctionContext)_localctx).v, ((FunctionContext)_localctx).s); 
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

	public static class ParamsContext extends ParserRuleContext {
		public List<Parameter> list = new ArrayList<Parameter>();
		public ParamContext param;
		public ParamContext p;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						((ParamsContext)_localctx).param = param();
						 _localctx.list.add(((ParamsContext)_localctx).param.ast); 
						setState(113);
						match(T__13);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(120);
				((ParamsContext)_localctx).p = ((ParamsContext)_localctx).param = param();
				 _localctx.list.add(((ParamsContext)_localctx).p.ast); 
				}
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

	public static class ParamContext extends ParserRuleContext {
		public Parameter ast;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ParamContext)_localctx).IDENT = match(IDENT);
			setState(126);
			match(T__6);
			setState(127);
			((ParamContext)_localctx).type = type();
			 ((ParamContext)_localctx).ast =  new Parameter(((ParamContext)_localctx).type.ast, ((ParamContext)_localctx).IDENT); 
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

	public static class SentenceContext extends ParserRuleContext {
		public Sentence ast;
		public ExprContext expr;
		public ExprContext l;
		public ExprContext r;
		public SentenceContext sentence;
		public List<SentenceContext> then = new ArrayList<SentenceContext>();
		public List<SentenceContext> elsee = new ArrayList<SentenceContext>();
		public List<SentenceContext> doo = new ArrayList<SentenceContext>();
		public Token name;
		public ParamssContext paramss;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ParamssContext paramss() {
			return getRuleContext(ParamssContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentence);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__14);
				setState(131);
				expr(0);
				setState(132);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__15);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(135);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(138);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new Print(((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__16);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(141);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(144);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new Printsp(((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(T__17);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(147);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(150);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new Println(((SentenceContext)_localctx).expr.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				((SentenceContext)_localctx).l = expr(0);
				setState(153);
				match(T__18);
				setState(154);
				((SentenceContext)_localctx).r = expr(0);
				setState(155);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new Assignment(((SentenceContext)_localctx).l.ast, ((SentenceContext)_localctx).r.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(T__19);
				setState(159);
				match(T__11);
				setState(160);
				((SentenceContext)_localctx).expr = expr(0);
				setState(161);
				match(T__12);
				setState(162);
				match(T__9);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					{
					setState(163);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).then.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__10);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(170);
					match(T__20);
					setState(171);
					match(T__9);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
						{
						{
						setState(172);
						((SentenceContext)_localctx).sentence = sentence();
						((SentenceContext)_localctx).elsee.add(((SentenceContext)_localctx).sentence);
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(178);
					match(T__10);
					}
				}

				 ((SentenceContext)_localctx).ast =  new If(((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).then, ((SentenceContext)_localctx).elsee); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(T__21);
				setState(184);
				match(T__11);
				setState(185);
				((SentenceContext)_localctx).expr = expr(0);
				setState(186);
				match(T__12);
				setState(187);
				match(T__9);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					{
					setState(188);
					((SentenceContext)_localctx).sentence = sentence();
					((SentenceContext)_localctx).doo.add(((SentenceContext)_localctx).sentence);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__10);
				 ((SentenceContext)_localctx).ast =  new While(((SentenceContext)_localctx).expr.ast, ((SentenceContext)_localctx).doo); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(T__22);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(198);
					((SentenceContext)_localctx).expr = expr(0);
					}
				}

				setState(201);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new Return(((SentenceContext)_localctx).expr != null ? ((SentenceContext)_localctx).expr.ast : null); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				((SentenceContext)_localctx).name = match(IDENT);
				setState(204);
				match(T__11);
				setState(205);
				((SentenceContext)_localctx).paramss = paramss();
				setState(206);
				match(T__12);
				setState(207);
				match(T__7);
				 ((SentenceContext)_localctx).ast =  new FunctionCallSen(((SentenceContext)_localctx).name, ((SentenceContext)_localctx).paramss.list); 
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public ExprContext name;
		public ExprContext l;
		public ExprContext e;
		public ExprContext expr;
		public Token IDENT;
		public Token INT_CONSTANT;
		public Token FLOAT_CONSTANT;
		public Token CHAR_CONSTANT;
		public TypeContext type;
		public ParamssContext paramss;
		public Token op;
		public ExprContext r;
		public ExprContext position;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(GrammarParser.FLOAT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamssContext paramss() {
			return getRuleContext(ParamssContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(213);
				match(T__11);
				setState(214);
				((ExprContext)_localctx).expr = expr(0);
				setState(215);
				match(T__12);
				 ((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast; 
				}
				break;
			case 2:
				{
				setState(218);
				((ExprContext)_localctx).IDENT = match(IDENT);
				 ((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).IDENT); 
				}
				break;
			case 3:
				{
				setState(220);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new IntConstant(((ExprContext)_localctx).INT_CONSTANT); 
				}
				break;
			case 4:
				{
				setState(222);
				((ExprContext)_localctx).FLOAT_CONSTANT = match(FLOAT_CONSTANT);
				 ((ExprContext)_localctx).ast =  new FloatConstant(((ExprContext)_localctx).FLOAT_CONSTANT); 
				}
				break;
			case 5:
				{
				setState(224);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExprContext)_localctx).ast =  new CharConstant(((ExprContext)_localctx).CHAR_CONSTANT); 
				}
				break;
			case 6:
				{
				setState(226);
				match(T__29);
				setState(227);
				((ExprContext)_localctx).type = type();
				setState(228);
				match(T__30);
				setState(229);
				match(T__11);
				setState(230);
				((ExprContext)_localctx).expr = expr(0);
				setState(231);
				match(T__12);
				 ((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).type.ast, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 7:
				{
				setState(234);
				((ExprContext)_localctx).IDENT = match(IDENT);
				setState(235);
				match(T__11);
				setState(236);
				((ExprContext)_localctx).paramss = paramss();
				setState(237);
				match(T__12);
				 ((ExprContext)_localctx).ast =  new FunctionCallExp(((ExprContext)_localctx).IDENT, ((ExprContext)_localctx).paramss.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(243);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(13);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast, ((ExprContext)_localctx).op, ((ExprContext)_localctx).r.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(248);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(12);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast, ((ExprContext)_localctx).op, ((ExprContext)_localctx).r.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(253);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(11);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast, ((ExprContext)_localctx).op, ((ExprContext)_localctx).r.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(258);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(10);
						 ((ExprContext)_localctx).ast =  new ArithmeticExpression(((ExprContext)_localctx).l.ast, ((ExprContext)_localctx).op, ((ExprContext)_localctx).r.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.name = _prevctx;
						_localctx.name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(263);
						match(T__3);
						setState(264);
						((ExprContext)_localctx).position = ((ExprContext)_localctx).expr = expr(0);
						setState(265);
						match(T__4);
						 ((ExprContext)_localctx).ast =  new ArrayOp(((ExprContext)_localctx).name.ast, ((ExprContext)_localctx).position.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(269);
						match(T__35);
						setState(270);
						((ExprContext)_localctx).IDENT = match(IDENT);
						 ((ExprContext)_localctx).ast =  new Dot(((ExprContext)_localctx).e.ast, ((ExprContext)_localctx).IDENT); 
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamssContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext expr;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramss; }
	}

	public final ParamssContext paramss() throws RecognitionException {
		ParamssContext _localctx = new ParamssContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramss);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << INT_CONSTANT) | (1L << FLOAT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						((ParamssContext)_localctx).expr = expr(0);
						setState(278);
						match(T__13);
						_localctx.list.add(((ParamssContext)_localctx).expr.ast);
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(286);
				((ParamssContext)_localctx).e = ((ParamssContext)_localctx).expr = expr(0);
				_localctx.list.add(((ParamssContext)_localctx).e.ast);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\3\b\7\bd\n\b\f\b\16\bg\13"+
		"\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tv\n\t\f"+
		"\t\16\ty\13\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u008b\n\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\5"+
		"\13\u00b6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c0\n\13"+
		"\f\13\16\13\u00c3\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d5\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116\13\f\3\r\3\r\3\r\3"+
		"\r\7\r\u011c\n\r\f\r\16\r\u011f\13\r\3\r\3\r\3\r\5\r\u0124\n\r\3\r\2\3"+
		"\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\32\33\3\2\34\35\3\2\36#\3"+
		"\2$%\2\u0144\2\35\3\2\2\2\4,\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nE\3\2\2\2"+
		"\fR\3\2\2\2\16Y\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u00d4\3\2\2\2\26"+
		"\u00f2\3\2\2\2\30\u0123\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2"+
		"\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!"+
		"\"\b\2\1\2\"\3\3\2\2\2#$\5\b\5\2$%\b\3\1\2%-\3\2\2\2&\'\5\n\6\2\'(\b\3"+
		"\1\2(-\3\2\2\2)*\5\16\b\2*+\b\3\1\2+-\3\2\2\2,#\3\2\2\2,&\3\2\2\2,)\3"+
		"\2\2\2-\5\3\2\2\2./\7\3\2\2/=\b\4\1\2\60\61\7\4\2\2\61=\b\4\1\2\62\63"+
		"\7\5\2\2\63=\b\4\1\2\64\65\7*\2\2\65=\b\4\1\2\66\67\7\6\2\2\678\7\'\2"+
		"\289\7\7\2\29:\5\6\4\2:;\b\4\1\2;=\3\2\2\2<.\3\2\2\2<\60\3\2\2\2<\62\3"+
		"\2\2\2<\64\3\2\2\2<\66\3\2\2\2=\7\3\2\2\2>?\7\b\2\2?@\7*\2\2@A\7\t\2\2"+
		"AB\5\6\4\2BC\7\n\2\2CD\b\5\1\2D\t\3\2\2\2EF\7\13\2\2FG\7*\2\2GK\7\f\2"+
		"\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2"+
		"\2NO\7\r\2\2OP\7\n\2\2PQ\b\6\1\2Q\13\3\2\2\2RS\7*\2\2ST\7\t\2\2TU\5\6"+
		"\4\2UV\7\n\2\2VW\3\2\2\2WX\b\7\1\2X\r\3\2\2\2YZ\7*\2\2Z[\7\16\2\2[\\\5"+
		"\20\t\2\\_\7\17\2\2]^\7\t\2\2^`\5\6\4\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2"+
		"ae\7\f\2\2bd\5\b\5\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2"+
		"ge\3\2\2\2hj\5\24\13\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2"+
		"\2mk\3\2\2\2no\7\r\2\2op\b\b\1\2p\17\3\2\2\2qr\5\22\n\2rs\b\t\1\2st\7"+
		"\20\2\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw"+
		"\3\2\2\2z{\5\22\n\2{|\b\t\1\2|~\3\2\2\2}w\3\2\2\2}~\3\2\2\2~\21\3\2\2"+
		"\2\177\u0080\7*\2\2\u0080\u0081\7\t\2\2\u0081\u0082\5\6\4\2\u0082\u0083"+
		"\b\n\1\2\u0083\23\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5\26\f\2\u0086"+
		"\u0087\7\n\2\2\u0087\u00d5\3\2\2\2\u0088\u008a\7\22\2\2\u0089\u008b\5"+
		"\26\f\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\n\2\2\u008d\u00d5\b\13\1\2\u008e\u0090\7\23\2\2\u008f\u0091\5"+
		"\26\f\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u00d5\b\13\1\2\u0094\u0096\7\24\2\2\u0095\u0097\5"+
		"\26\f\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7\n\2\2\u0099\u00d5\b\13\1\2\u009a\u009b\5\26\f\2\u009b\u009c\7"+
		"\25\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\n\2\2\u009e\u009f\b\13\1\2"+
		"\u009f\u00d5\3\2\2\2\u00a0\u00a1\7\26\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3"+
		"\5\26\f\2\u00a3\u00a4\7\17\2\2\u00a4\u00a8\7\f\2\2\u00a5\u00a7\5\24\13"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b5\7\r\2\2\u00ac"+
		"\u00ad\7\27\2\2\u00ad\u00b1\7\f\2\2\u00ae\u00b0\5\24\13\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\7\r\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\13\1\2\u00b8"+
		"\u00d5\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5"+
		"\26\f\2\u00bc\u00bd\7\17\2\2\u00bd\u00c1\7\f\2\2\u00be\u00c0\5\24\13\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5"+
		"\u00c6\b\13\1\2\u00c6\u00d5\3\2\2\2\u00c7\u00c9\7\31\2\2\u00c8\u00ca\5"+
		"\26\f\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\n\2\2\u00cc\u00d5\b\13\1\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7\16"+
		"\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\7\n\2\2\u00d2"+
		"\u00d3\b\13\1\2\u00d3\u00d5\3\2\2\2\u00d4\u0084\3\2\2\2\u00d4\u0088\3"+
		"\2\2\2\u00d4\u008e\3\2\2\2\u00d4\u0094\3\2\2\2\u00d4\u009a\3\2\2\2\u00d4"+
		"\u00a0\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4\u00cd\3\2"+
		"\2\2\u00d5\25\3\2\2\2\u00d6\u00d7\b\f\1\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9"+
		"\5\26\f\2\u00d9\u00da\7\17\2\2\u00da\u00db\b\f\1\2\u00db\u00f3\3\2\2\2"+
		"\u00dc\u00dd\7*\2\2\u00dd\u00f3\b\f\1\2\u00de\u00df\7\'\2\2\u00df\u00f3"+
		"\b\f\1\2\u00e0\u00e1\7(\2\2\u00e1\u00f3\b\f\1\2\u00e2\u00e3\7)\2\2\u00e3"+
		"\u00f3\b\f\1\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\5\6\4\2\u00e6\u00e7\7!\2"+
		"\2\u00e7\u00e8\7\16\2\2\u00e8\u00e9\5\26\f\2\u00e9\u00ea\7\17\2\2\u00ea"+
		"\u00eb\b\f\1\2\u00eb\u00f3\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed\u00ee\7\16"+
		"\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\b\f\1\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00d6\3\2\2\2\u00f2\u00dc\3\2\2\2\u00f2\u00de\3\2"+
		"\2\2\u00f2\u00e0\3\2\2\2\u00f2\u00e2\3\2\2\2\u00f2\u00e4\3\2\2\2\u00f2"+
		"\u00ec\3\2\2\2\u00f3\u0114\3\2\2\2\u00f4\u00f5\f\16\2\2\u00f5\u00f6\t"+
		"\2\2\2\u00f6\u00f7\5\26\f\17\u00f7\u00f8\b\f\1\2\u00f8\u0113\3\2\2\2\u00f9"+
		"\u00fa\f\r\2\2\u00fa\u00fb\t\3\2\2\u00fb\u00fc\5\26\f\16\u00fc\u00fd\b"+
		"\f\1\2\u00fd\u0113\3\2\2\2\u00fe\u00ff\f\f\2\2\u00ff\u0100\t\4\2\2\u0100"+
		"\u0101\5\26\f\r\u0101\u0102\b\f\1\2\u0102\u0113\3\2\2\2\u0103\u0104\f"+
		"\13\2\2\u0104\u0105\t\5\2\2\u0105\u0106\5\26\f\f\u0106\u0107\b\f\1\2\u0107"+
		"\u0113\3\2\2\2\u0108\u0109\f\17\2\2\u0109\u010a\7\6\2\2\u010a\u010b\5"+
		"\26\f\2\u010b\u010c\7\7\2\2\u010c\u010d\b\f\1\2\u010d\u0113\3\2\2\2\u010e"+
		"\u010f\f\3\2\2\u010f\u0110\7&\2\2\u0110\u0111\7*\2\2\u0111\u0113\b\f\1"+
		"\2\u0112\u00f4\3\2\2\2\u0112\u00f9\3\2\2\2\u0112\u00fe\3\2\2\2\u0112\u0103"+
		"\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010e\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\27\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0117\u0118\5\26\f\2\u0118\u0119\7\20\2\2\u0119\u011a\b\r\1\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\5\26\f\2\u0121\u0122\b\r\1\2\u0122\u0124\3\2\2\2\u0123\u011d\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\31\35,<K_ekw}\u008a\u0090"+
		"\u0096\u00a8\u00b1\u00b5\u00c1\u00c9\u00d4\u00f2\u0112\u0114\u011d\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}