// Generated from C:/Users/PC/Desktop/eeee/compilator/compilatorPascal/src/main/java/gram\GrammarFile.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, OR=2, AND=3, NOT=4, IF=5, THEN=6, ELSE=7, OF=8, WHILE=9, DO=10, 
		BEGIN=11, END=12, READ=13, WRITE=14, VAR=15, ARRAY=16, PROCEDURE=17, PROGRAM=18, 
		DIV=19, PLUS=20, MINUS=21, MULT=22, EQUALS=23, RT=24, LT=25, LE=26, RE=27, 
		LR=28, OP=29, CP=30, OC=31, CC=32, ATTRIB=33, DOT=34, COMMA=35, SMCOLON=36, 
		COLON=37, DBDOT=38, INTEGER=39, BOOLEAN=40, FLOAT=41, STRING=42, TRUE=43, 
		FALSE=44, ID=45, STR=46, WS=47, DIGIT=48;
	public static final int
		RULE_myStartingRule = 0, RULE_program = 1, RULE_block = 2, RULE_vardeclpart = 3, 
		RULE_vardecl = 4, RULE_type = 5, RULE_arraytype = 6, RULE_indexrange = 7, 
		RULE_simpletype = 8, RULE_procdeclpart = 9, RULE_procdecl = 10, RULE_formalParameterList = 11, 
		RULE_parameterGroup = 12, RULE_identifierList = 13, RULE_statementpart = 14, 
		RULE_cmpstatement = 15, RULE_statement = 16, RULE_smpstatement = 17, RULE_assstatement = 18, 
		RULE_procstatement = 19, RULE_parameterList = 20, RULE_readstatement = 21, 
		RULE_writestatement = 22, RULE_expression = 23, RULE_simpleExpression = 24, 
		RULE_term = 25, RULE_factor = 26, RULE_constant = 27, RULE_addop = 28, 
		RULE_multop = 29, RULE_variable = 30, RULE_stcstatement = 31, RULE_ifStatement = 32, 
		RULE_whilestatement = 33, RULE_forstatement = 34, RULE_specsym = 35, RULE_predid = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStartingRule", "program", "block", "vardeclpart", "vardecl", "type", 
			"arraytype", "indexrange", "simpletype", "procdeclpart", "procdecl", 
			"formalParameterList", "parameterGroup", "identifierList", "statementpart", 
			"cmpstatement", "statement", "smpstatement", "assstatement", "procstatement", 
			"parameterList", "readstatement", "writestatement", "expression", "simpleExpression", 
			"term", "factor", "constant", "addop", "multop", "variable", "stcstatement", 
			"ifStatement", "whilestatement", "forstatement", "specsym", "predid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'/'", "'+'", "'-'", "'*'", 
			"'='", "'>'", "'<'", "'<='", "'>='", "'<>'", "'('", "')'", "'['", "']'", 
			"':='", "'.'", "','", "';'", "':'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "OF", "WHILE", 
			"DO", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", "PROCEDURE", "PROGRAM", 
			"DIV", "PLUS", "MINUS", "MULT", "EQUALS", "RT", "LT", "LE", "RE", "LR", 
			"OP", "CP", "OC", "CC", "ATTRIB", "DOT", "COMMA", "SMCOLON", "COLON", 
			"DBDOT", "INTEGER", "BOOLEAN", "FLOAT", "STRING", "TRUE", "FALSE", "ID", 
			"STR", "WS", "DIGIT"
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
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartingRuleContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public MyStartingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStartingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMyStartingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMyStartingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor) return ((GrammarFileVisitor<? extends T>)visitor).visitMyStartingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartingRuleContext myStartingRule() throws RecognitionException {
		MyStartingRuleContext _localctx = new MyStartingRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStartingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				program();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgrmContext extends ProgramContext {
		public TerminalNode PROGRAM() { return getToken(GrammarFileParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode SMCOLON() { return getToken(GrammarFileParser.SMCOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GrammarFileParser.DOT, 0); }
		public ProgrmContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProgrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProgrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitProgrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			_localctx = new ProgrmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PROGRAM);
			setState(80);
			match(ID);
			setState(81);
			match(SMCOLON);
			setState(82);
			block();
			setState(83);
			match(DOT);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockProgrmContext extends BlockContext {
		public VardeclpartContext vardeclpart() {
			return getRuleContext(VardeclpartContext.class,0);
		}
		public ProcdeclpartContext procdeclpart() {
			return getRuleContext(ProcdeclpartContext.class,0);
		}
		public StatementpartContext statementpart() {
			return getRuleContext(StatementpartContext.class,0);
		}
		public BlockProgrmContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterBlockProgrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitBlockProgrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitBlockProgrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			_localctx = new BlockProgrmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(85);
				vardeclpart();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88);
				procdeclpart();
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(91);
				statementpart();
				}
				break;
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

	public static class VardeclpartContext extends ParserRuleContext {
		public VardeclpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclpart; }
	 
		public VardeclpartContext() { }
		public void copyFrom(VardeclpartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockVarContext extends VardeclpartContext {
		public TerminalNode VAR() { return getToken(GrammarFileParser.VAR, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(GrammarFileParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(GrammarFileParser.SMCOLON, i);
		}
		public BlockVarContext(VardeclpartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterBlockVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitBlockVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitBlockVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclpartContext vardeclpart() throws RecognitionException {
		VardeclpartContext _localctx = new VardeclpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardeclpart);
		int _la;
		try {
			_localctx = new BlockVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(94);
				match(VAR);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					vardecl();
					setState(96);
					match(SMCOLON);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationContext extends VardeclContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public VarDeclarationContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			variable();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(105);
				match(COMMA);
				setState(106);
				variable();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(COLON);
			setState(113);
			type();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarContext extends TypeContext {
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public SimpleVarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterSimpleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitSimpleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitSimpleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVarTypeContext extends TypeContext {
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public ArrayVarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterArrayVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitArrayVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitArrayVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
			case FLOAT:
			case STRING:
				_localctx = new SimpleVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				simpletype();
				}
				break;
			case ARRAY:
				_localctx = new ArrayVarTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				arraytype();
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

	public static class ArraytypeContext extends ParserRuleContext {
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
	 
		public ArraytypeContext() { }
		public void copyFrom(ArraytypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayVarContext extends ArraytypeContext {
		public TerminalNode ARRAY() { return getToken(GrammarFileParser.ARRAY, 0); }
		public TerminalNode OC() { return getToken(GrammarFileParser.OC, 0); }
		public IndexrangeContext indexrange() {
			return getRuleContext(IndexrangeContext.class,0);
		}
		public TerminalNode CC() { return getToken(GrammarFileParser.CC, 0); }
		public TerminalNode OF() { return getToken(GrammarFileParser.OF, 0); }
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public ArrayVarContext(ArraytypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterArrayVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitArrayVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitArrayVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arraytype);
		try {
			_localctx = new ArrayVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ARRAY);
			setState(120);
			match(OC);
			setState(121);
			indexrange();
			setState(122);
			match(CC);
			setState(123);
			match(OF);
			setState(124);
			simpletype();
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

	public static class IndexrangeContext extends ParserRuleContext {
		public IndexrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexrange; }
	 
		public IndexrangeContext() { }
		public void copyFrom(IndexrangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeIndexVarContext extends IndexrangeContext {
		public List<TerminalNode> DIGIT() { return getTokens(GrammarFileParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarFileParser.DIGIT, i);
		}
		public TerminalNode DBDOT() { return getToken(GrammarFileParser.DBDOT, 0); }
		public RangeIndexVarContext(IndexrangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterRangeIndexVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitRangeIndexVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitRangeIndexVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexrangeContext indexrange() throws RecognitionException {
		IndexrangeContext _localctx = new IndexrangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indexrange);
		try {
			_localctx = new RangeIndexVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(DIGIT);
			setState(127);
			match(DBDOT);
			setState(128);
			match(DIGIT);
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

	public static class SimpletypeContext extends ParserRuleContext {
		public SimpletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletype; }
	 
		public SimpletypeContext() { }
		public void copyFrom(SimpletypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdVarContext extends SimpletypeContext {
		public TerminalNode INTEGER() { return getToken(GrammarFileParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(GrammarFileParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarFileParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarFileParser.BOOLEAN, 0); }
		public IdVarContext(SimpletypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIdVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIdVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIdVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypeContext simpletype() throws RecognitionException {
		SimpletypeContext _localctx = new SimpletypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpletype);
		int _la;
		try {
			_localctx = new IdVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProcdeclpartContext extends ParserRuleContext {
		public List<ProcdeclContext> procdecl() {
			return getRuleContexts(ProcdeclContext.class);
		}
		public ProcdeclContext procdecl(int i) {
			return getRuleContext(ProcdeclContext.class,i);
		}
		public ProcdeclpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdeclpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProcdeclpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProcdeclpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitProcdeclpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcdeclpartContext procdeclpart() throws RecognitionException {
		ProcdeclpartContext _localctx = new ProcdeclpartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procdeclpart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(132);
				procdecl();
				}
				}
				setState(137);
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

	public static class ProcdeclContext extends ParserRuleContext {
		public ProcdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdecl; }
	 
		public ProcdeclContext() { }
		public void copyFrom(ProcdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcDeclFuncContext extends ProcdeclContext {
		public TerminalNode PROCEDURE() { return getToken(GrammarFileParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public List<TerminalNode> SMCOLON() { return getTokens(GrammarFileParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(GrammarFileParser.SMCOLON, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcDeclFuncContext(ProcdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProcDeclFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProcDeclFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitProcDeclFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcdeclContext procdecl() throws RecognitionException {
		ProcdeclContext _localctx = new ProcdeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procdecl);
		int _la;
		try {
			_localctx = new ProcDeclFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PROCEDURE);
			setState(139);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(140);
				formalParameterList();
				}
			}

			setState(143);
			match(SMCOLON);
			setState(144);
			block();
			setState(145);
			match(SMCOLON);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	 
		public FormalParameterListContext() { }
		public void copyFrom(FormalParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcVarDeclFuncContext extends FormalParameterListContext {
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public ProcVarDeclFuncContext(FormalParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterProcVarDeclFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitProcVarDeclFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitProcVarDeclFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameterList);
		int _la;
		try {
			_localctx = new ProcVarDeclFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OP);
			setState(148);
			parameterGroup();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				parameterGroup();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(CP);
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			identifierList();
			setState(159);
			match(COLON);
			setState(160);
			simpletype();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarFileParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarFileParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				match(ID);
				}
				}
				setState(169);
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

	public static class StatementpartContext extends ParserRuleContext {
		public StatementpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementpart; }
	 
		public StatementpartContext() { }
		public void copyFrom(StatementpartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtContext extends StatementpartContext {
		public List<CmpstatementContext> cmpstatement() {
			return getRuleContexts(CmpstatementContext.class);
		}
		public CmpstatementContext cmpstatement(int i) {
			return getRuleContext(CmpstatementContext.class,i);
		}
		public StmtContext(StatementpartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementpartContext statementpart() throws RecognitionException {
		StatementpartContext _localctx = new StatementpartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementpart);
		int _la;
		try {
			_localctx = new StmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEGIN) {
				{
				{
				setState(170);
				cmpstatement();
				}
				}
				setState(175);
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

	public static class CmpstatementContext extends ParserRuleContext {
		public CmpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpstatement; }
	 
		public CmpstatementContext() { }
		public void copyFrom(CmpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStmtContext extends CmpstatementContext {
		public TerminalNode BEGIN() { return getToken(GrammarFileParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(GrammarFileParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(GrammarFileParser.SMCOLON, i);
		}
		public TerminalNode END() { return getToken(GrammarFileParser.END, 0); }
		public MainStmtContext(CmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMainStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMainStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitMainStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpstatementContext cmpstatement() throws RecognitionException {
		CmpstatementContext _localctx = new CmpstatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmpstatement);
		int _la;
		try {
			_localctx = new MainStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BEGIN);
			setState(177);
			statement();
			setState(178);
			match(SMCOLON);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << BEGIN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(179);
				statement();
				setState(180);
				match(SMCOLON);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SmpStmtContext extends StatementContext {
		public SmpstatementContext smpstatement() {
			return getRuleContext(SmpstatementContext.class,0);
		}
		public SmpStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterSmpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitSmpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitSmpStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StcStmtContext extends StatementContext {
		public StcstatementContext stcstatement() {
			return getRuleContext(StcstatementContext.class,0);
		}
		public StcStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterStcStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitStcStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitStcStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case ID:
				_localctx = new SmpStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				smpstatement();
				}
				break;
			case FOR:
			case IF:
			case WHILE:
			case BEGIN:
				_localctx = new StcStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				stcstatement();
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

	public static class SmpstatementContext extends ParserRuleContext {
		public SmpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smpstatement; }
	 
		public SmpstatementContext() { }
		public void copyFrom(SmpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtIDContext extends SmpstatementContext {
		public ProcstatementContext procstatement() {
			return getRuleContext(ProcstatementContext.class,0);
		}
		public StmtIDContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterStmtID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitStmtID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitStmtID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultReadStmtContext extends SmpstatementContext {
		public ReadstatementContext readstatement() {
			return getRuleContext(ReadstatementContext.class,0);
		}
		public ResultReadStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterResultReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitResultReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitResultReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultWriteStmtContext extends SmpstatementContext {
		public WritestatementContext writestatement() {
			return getRuleContext(WritestatementContext.class,0);
		}
		public ResultWriteStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterResultWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitResultWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitResultWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttribStmtContext extends SmpstatementContext {
		public AssstatementContext assstatement() {
			return getRuleContext(AssstatementContext.class,0);
		}
		public AttribStmtContext(SmpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterAttribStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitAttribStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitAttribStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmpstatementContext smpstatement() throws RecognitionException {
		SmpstatementContext _localctx = new SmpstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_smpstatement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AttribStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				assstatement();
				}
				break;
			case 2:
				_localctx = new StmtIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				procstatement();
				}
				break;
			case 3:
				_localctx = new ResultReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				readstatement();
				}
				break;
			case 4:
				_localctx = new ResultWriteStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				writestatement();
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

	public static class AssstatementContext extends ParserRuleContext {
		public AssstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assstatement; }
	 
		public AssstatementContext() { }
		public void copyFrom(AssstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtAttribContext extends AssstatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ATTRIB() { return getToken(GrammarFileParser.ATTRIB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmtAttribContext(AssstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterStmtAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitStmtAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitStmtAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssstatementContext assstatement() throws RecognitionException {
		AssstatementContext _localctx = new AssstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assstatement);
		try {
			_localctx = new StmtAttribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			variable();
			setState(200);
			match(ATTRIB);
			setState(201);
			expression();
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

	public static class ProcstatementContext extends ParserRuleContext {
		public ProcstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procstatement; }
	 
		public ProcstatementContext() { }
		public void copyFrom(ProcstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdStmtContext extends ProcstatementContext {
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public IdStmtContext(ProcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIdStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIdStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIdStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcstatementContext procstatement() throws RecognitionException {
		ProcstatementContext _localctx = new ProcstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_procstatement);
		int _la;
		try {
			_localctx = new IdStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP) {
				{
				setState(204);
				match(OP);
				setState(205);
				parameterList();
				setState(206);
				match(CP);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expression();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				expression();
				}
				}
				setState(217);
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

	public static class ReadstatementContext extends ParserRuleContext {
		public ReadstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstatement; }
	 
		public ReadstatementContext() { }
		public void copyFrom(ReadstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadStmtContext extends ReadstatementContext {
		public TerminalNode READ() { return getToken(GrammarFileParser.READ, 0); }
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public ReadStmtContext(ReadstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstatementContext readstatement() throws RecognitionException {
		ReadstatementContext _localctx = new ReadstatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_readstatement);
		int _la;
		try {
			_localctx = new ReadStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(READ);
			setState(219);
			match(OP);
			setState(220);
			variable();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				variable();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(CP);
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

	public static class WritestatementContext extends ParserRuleContext {
		public WritestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestatement; }
	 
		public WritestatementContext() { }
		public void copyFrom(WritestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStmtContext extends WritestatementContext {
		public TerminalNode WRITE() { return getToken(GrammarFileParser.WRITE, 0); }
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarFileParser.COMMA, i);
		}
		public WriteStmtContext(WritestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestatementContext writestatement() throws RecognitionException {
		WritestatementContext _localctx = new WritestatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_writestatement);
		int _la;
		try {
			_localctx = new WriteStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(WRITE);
			setState(231);
			match(OP);
			setState(232);
			expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				expression();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(CP);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResultSimpleExpContext extends ExpressionContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ResultSimpleExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterResultSimpleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitResultSimpleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitResultSimpleExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultExpContext extends ExpressionContext {
		public Token relationop;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(GrammarFileParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(GrammarFileParser.LT, 0); }
		public TerminalNode RT() { return getToken(GrammarFileParser.RT, 0); }
		public TerminalNode LR() { return getToken(GrammarFileParser.LR, 0); }
		public TerminalNode LE() { return getToken(GrammarFileParser.LE, 0); }
		public TerminalNode RE() { return getToken(GrammarFileParser.RE, 0); }
		public ResultExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterResultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitResultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitResultExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ResultSimpleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				simpleExpression();
				}
				break;
			case 2:
				_localctx = new ResultExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				simpleExpression();
				setState(244);
				((ResultExpContext)_localctx).relationop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) ) {
					((ResultExpContext)_localctx).relationop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				simpleExpression();
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SmplExpressionContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public SmplExpressionContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterSmplExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitSmplExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitSmplExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleExpression);
		int _la;
		try {
			_localctx = new SmplExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			term();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(250);
				addop();
				setState(251);
				term();
				}
				}
				setState(257);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermExpressionContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultopContext> multop() {
			return getRuleContexts(MultopContext.class);
		}
		public MultopContext multop(int i) {
			return getRuleContext(MultopContext.class,i);
		}
		public TermExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterTermExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitTermExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitTermExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		int _la;
		try {
			_localctx = new TermExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			factor();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MULT))) != 0)) {
				{
				{
				setState(259);
				multop();
				setState(260);
				factor();
				}
				}
				setState(266);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarExprContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends FactorContext {
		public TerminalNode NOT() { return getToken(GrammarFileParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NotExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends FactorContext {
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public MultExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends FactorContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GrammarFileParser.MINUS, 0); }
		public ConstantExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				variable();
				}
				break;
			case 2:
				_localctx = new ConstantExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(268);
					match(MINUS);
					}
				}

				setState(271);
				constant();
				}
				break;
			case 3:
				_localctx = new MultExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(OP);
				setState(273);
				expression();
				setState(274);
				match(CP);
				}
				break;
			case 4:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(NOT);
				setState(277);
				factor();
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

	public static class ConstantContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GrammarFileParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarFileParser.DIGIT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GrammarFileParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GrammarFileParser.DOT, i);
		}
		public TerminalNode STR() { return getToken(GrammarFileParser.STR, 0); }
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(GrammarFileParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarFileParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(DIGIT);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(281);
					match(DOT);
					setState(282);
					match(DIGIT);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(ID);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				match(FALSE);
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarFileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarFileParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(GrammarFileParser.OR, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitAddop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultopContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(GrammarFileParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(GrammarFileParser.MULT, 0); }
		public TerminalNode AND() { return getToken(GrammarFileParser.AND, 0); }
		public MultopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMultop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMultop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitMultop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultopContext multop() throws RecognitionException {
		MultopContext _localctx = new MultopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MULT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexedVarContext extends VariableContext {
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode OC() { return getToken(GrammarFileParser.OC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CC() { return getToken(GrammarFileParser.CC, 0); }
		public IndexedVarContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIndexedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIndexedVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIndexedVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIDContext extends VariableContext {
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public VarIDContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new VarIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IndexedVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(ID);
				setState(300);
				match(OC);
				setState(301);
				expression();
				setState(302);
				match(CC);
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

	public static class StcstatementContext extends ParserRuleContext {
		public StcstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stcstatement; }
	 
		public StcstatementContext() { }
		public void copyFrom(StcstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementFuncContext extends StcstatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementFuncContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIfStatementFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIfStatementFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIfStatementFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementFuncContext extends StcstatementContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForStatementFuncContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterForStatementFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitForStatementFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitForStatementFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpStatementFuncContext extends StcstatementContext {
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public CmpStatementFuncContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterCmpStatementFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitCmpStatementFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitCmpStatementFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementFuncContext extends StcstatementContext {
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public WhileStatementFuncContext(StcstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterWhileStatementFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitWhileStatementFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitWhileStatementFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StcstatementContext stcstatement() throws RecognitionException {
		StcstatementContext _localctx = new StcstatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stcstatement);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				_localctx = new CmpStatementFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				cmpstatement();
				}
				break;
			case IF:
				_localctx = new IfStatementFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				ifStatement();
				}
				break;
			case WHILE:
				_localctx = new WhileStatementFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				whilestatement();
				}
				break;
			case FOR:
				_localctx = new ForStatementFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				forstatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(GrammarFileParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarFileParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends IfStatementContext {
		public StatementContext b1;
		public StatementContext b2;
		public TerminalNode IF() { return getToken(GrammarFileParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GrammarFileParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GrammarFileParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifStatement);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(IF);
				setState(313);
				expression();
				setState(314);
				match(THEN);
				setState(315);
				statement();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(IF);
				setState(318);
				expression();
				setState(319);
				match(THEN);
				setState(320);
				((IfElseStmtContext)_localctx).b1 = statement();
				setState(321);
				match(ELSE);
				setState(322);
				((IfElseStmtContext)_localctx).b2 = statement();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
	 
		public WhilestatementContext() { }
		public void copyFrom(WhilestatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends WhilestatementContext {
		public CmpstatementContext b1;
		public TerminalNode WHILE() { return getToken(GrammarFileParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(GrammarFileParser.DO, 0); }
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public WhileStmtContext(WhilestatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whilestatement);
		try {
			_localctx = new WhileStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(WHILE);
			setState(327);
			expression();
			setState(328);
			match(DO);
			setState(329);
			((WhileStmtContext)_localctx).b1 = cmpstatement();
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

	public static class ForstatementContext extends ParserRuleContext {
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
	 
		public ForstatementContext() { }
		public void copyFrom(ForstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStmtContext extends ForstatementContext {
		public AssstatementContext counter;
		public CmpstatementContext b1;
		public TerminalNode FOR() { return getToken(GrammarFileParser.FOR, 0); }
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public List<TerminalNode> SMCOLON() { return getTokens(GrammarFileParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(GrammarFileParser.SMCOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public CmpstatementContext cmpstatement() {
			return getRuleContext(CmpstatementContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public AssstatementContext assstatement() {
			return getRuleContext(AssstatementContext.class,0);
		}
		public ForStmtContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forstatement);
		int _la;
		try {
			_localctx = new ForStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FOR);
			setState(332);
			match(OP);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << OP) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << STR) | (1L << DIGIT))) != 0)) {
				{
				setState(333);
				simpleExpression();
				}
			}

			setState(336);
			match(SMCOLON);
			setState(337);
			expression();
			setState(338);
			match(SMCOLON);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(339);
				((ForStmtContext)_localctx).counter = assstatement();
				}
			}

			setState(342);
			match(CP);
			setState(343);
			((ForStmtContext)_localctx).b1 = cmpstatement();
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

	public static class SpecsymContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarFileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarFileParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(GrammarFileParser.MULT, 0); }
		public TerminalNode EQUALS() { return getToken(GrammarFileParser.EQUALS, 0); }
		public TerminalNode LR() { return getToken(GrammarFileParser.LR, 0); }
		public TerminalNode LT() { return getToken(GrammarFileParser.LT, 0); }
		public TerminalNode RT() { return getToken(GrammarFileParser.RT, 0); }
		public TerminalNode LE() { return getToken(GrammarFileParser.LE, 0); }
		public TerminalNode RE() { return getToken(GrammarFileParser.RE, 0); }
		public TerminalNode OP() { return getToken(GrammarFileParser.OP, 0); }
		public TerminalNode CP() { return getToken(GrammarFileParser.CP, 0); }
		public TerminalNode OC() { return getToken(GrammarFileParser.OC, 0); }
		public TerminalNode CC() { return getToken(GrammarFileParser.CC, 0); }
		public TerminalNode ATTRIB() { return getToken(GrammarFileParser.ATTRIB, 0); }
		public TerminalNode DOT() { return getToken(GrammarFileParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(GrammarFileParser.COMMA, 0); }
		public TerminalNode SMCOLON() { return getToken(GrammarFileParser.SMCOLON, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public TerminalNode DBDOT() { return getToken(GrammarFileParser.DBDOT, 0); }
		public TerminalNode DIV() { return getToken(GrammarFileParser.DIV, 0); }
		public TerminalNode OR() { return getToken(GrammarFileParser.OR, 0); }
		public TerminalNode AND() { return getToken(GrammarFileParser.AND, 0); }
		public TerminalNode NOT() { return getToken(GrammarFileParser.NOT, 0); }
		public TerminalNode IF() { return getToken(GrammarFileParser.IF, 0); }
		public TerminalNode THEN() { return getToken(GrammarFileParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GrammarFileParser.ELSE, 0); }
		public TerminalNode OF() { return getToken(GrammarFileParser.OF, 0); }
		public TerminalNode WHILE() { return getToken(GrammarFileParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(GrammarFileParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(GrammarFileParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GrammarFileParser.END, 0); }
		public TerminalNode READ() { return getToken(GrammarFileParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(GrammarFileParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(GrammarFileParser.VAR, 0); }
		public TerminalNode ARRAY() { return getToken(GrammarFileParser.ARRAY, 0); }
		public TerminalNode PROCEDURE() { return getToken(GrammarFileParser.PROCEDURE, 0); }
		public TerminalNode PROGRAM() { return getToken(GrammarFileParser.PROGRAM, 0); }
		public SpecsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterSpecsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitSpecsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitSpecsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecsymContext specsym() throws RecognitionException {
		SpecsymContext _localctx = new SpecsymContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_specsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << NOT) | (1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << OF) | (1L << WHILE) | (1L << DO) | (1L << BEGIN) | (1L << END) | (1L << READ) | (1L << WRITE) | (1L << VAR) | (1L << ARRAY) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << DIV) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << EQUALS) | (1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR) | (1L << OP) | (1L << CP) | (1L << OC) | (1L << CC) | (1L << ATTRIB) | (1L << DOT) | (1L << COMMA) | (1L << SMCOLON) | (1L << COLON) | (1L << DBDOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PredidContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarFileParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarFileParser.BOOLEAN, 0); }
		public TerminalNode TRUE() { return getToken(GrammarFileParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GrammarFileParser.FALSE, 0); }
		public PredidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterPredid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitPredid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitPredid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredidContext predid() throws RecognitionException {
		PredidContext _localctx = new PredidContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_predid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0160\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2N\n\2\r\2\16\2O\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\5\4Y\n\4\3\4\5\4\\\n\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\6"+
		"\5e\n\5\r\5\16\5f\5\5i\n\5\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6"+
		"\3\6\3\7\3\7\5\7x\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009a\n\r\f\r\16\r\u009d\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a8\n\17\f\17\16\17"+
		"\u00ab\13\17\3\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u00b9\n\21\f\21\16\21\u00bc\13\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00c2\n\22\3\23\3\23\3\23\3\23\5\23\u00c8\n\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\26\7\26"+
		"\u00d8\n\26\f\26\16\26\u00db\13\26\3\27\3\27\3\27\3\27\3\27\7\27\u00e2"+
		"\n\27\f\27\16\27\u00e5\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u00ee"+
		"\n\30\f\30\16\30\u00f1\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00fa"+
		"\n\31\3\32\3\32\3\32\3\32\7\32\u0100\n\32\f\32\16\32\u0103\13\32\3\33"+
		"\3\33\3\33\3\33\7\33\u0109\n\33\f\33\16\33\u010c\13\33\3\34\3\34\5\34"+
		"\u0110\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0119\n\34\3\35\3"+
		"\35\3\35\7\35\u011e\n\35\f\35\16\35\u0121\13\35\3\35\3\35\3\35\3\35\5"+
		"\35\u0127\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0133\n \3!\3"+
		"!\3!\3!\5!\u0139\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0147\n\"\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0151\n$\3$\3$\3$\3$\5$\u0157"+
		"\n$\3$\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\b\3\2),\3\2\31\36\4\2\4\4\26\27\5"+
		"\2\5\5\25\25\30\30\3\2\4(\4\2)*-.\2\u0163\2M\3\2\2\2\4Q\3\2\2\2\6X\3\2"+
		"\2\2\bh\3\2\2\2\nj\3\2\2\2\fw\3\2\2\2\16y\3\2\2\2\20\u0080\3\2\2\2\22"+
		"\u0084\3\2\2\2\24\u0089\3\2\2\2\26\u008c\3\2\2\2\30\u0095\3\2\2\2\32\u00a0"+
		"\3\2\2\2\34\u00a4\3\2\2\2\36\u00af\3\2\2\2 \u00b2\3\2\2\2\"\u00c1\3\2"+
		"\2\2$\u00c7\3\2\2\2&\u00c9\3\2\2\2(\u00cd\3\2\2\2*\u00d4\3\2\2\2,\u00dc"+
		"\3\2\2\2.\u00e8\3\2\2\2\60\u00f9\3\2\2\2\62\u00fb\3\2\2\2\64\u0104\3\2"+
		"\2\2\66\u0118\3\2\2\28\u0126\3\2\2\2:\u0128\3\2\2\2<\u012a\3\2\2\2>\u0132"+
		"\3\2\2\2@\u0138\3\2\2\2B\u0146\3\2\2\2D\u0148\3\2\2\2F\u014d\3\2\2\2H"+
		"\u015b\3\2\2\2J\u015d\3\2\2\2LN\5\4\3\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2P\3\3\2\2\2QR\7\24\2\2RS\7/\2\2ST\7&\2\2TU\5\6\4\2UV\7$\2\2"+
		"V\5\3\2\2\2WY\5\b\5\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5\24\13\2[Z\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\36\20\2^]\3\2\2\2^_\3\2\2\2_\7\3\2\2\2"+
		"`d\7\21\2\2ab\5\n\6\2bc\7&\2\2ce\3\2\2\2da\3\2\2\2ef\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gi\3\2\2\2h`\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jo\5> \2kl\7%\2\2l"+
		"n\5> \2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs"+
		"\7\'\2\2st\5\f\7\2t\13\3\2\2\2ux\5\22\n\2vx\5\16\b\2wu\3\2\2\2wv\3\2\2"+
		"\2x\r\3\2\2\2yz\7\22\2\2z{\7!\2\2{|\5\20\t\2|}\7\"\2\2}~\7\n\2\2~\177"+
		"\5\22\n\2\177\17\3\2\2\2\u0080\u0081\7\62\2\2\u0081\u0082\7(\2\2\u0082"+
		"\u0083\7\62\2\2\u0083\21\3\2\2\2\u0084\u0085\t\2\2\2\u0085\23\3\2\2\2"+
		"\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\23\2\2\u008d\u008f\7/\2\2\u008e\u0090\5\30\r\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7&\2\2\u0092"+
		"\u0093\5\6\4\2\u0093\u0094\7&\2\2\u0094\27\3\2\2\2\u0095\u0096\7\37\2"+
		"\2\u0096\u009b\5\32\16\2\u0097\u0098\7%\2\2\u0098\u009a\5\32\16\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7 \2\2\u009f"+
		"\31\3\2\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7\'\2\2\u00a2\u00a3\5\22"+
		"\n\2\u00a3\33\3\2\2\2\u00a4\u00a9\7/\2\2\u00a5\u00a6\7%\2\2\u00a6\u00a8"+
		"\7/\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5 \21"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3"+
		"\u00b4\5\"\22\2\u00b4\u00ba\7&\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\7"+
		"&\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\16\2\2\u00be!\3\2\2\2\u00bf\u00c2\5$\23\2\u00c0\u00c2"+
		"\5@!\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c8"+
		"\5&\24\2\u00c4\u00c8\5(\25\2\u00c5\u00c8\5,\27\2\u00c6\u00c8\5.\30\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8%\3\2\2\2\u00c9\u00ca\5> \2\u00ca\u00cb\7#\2\2\u00cb\u00cc\5"+
		"\60\31\2\u00cc\'\3\2\2\2\u00cd\u00d2\7/\2\2\u00ce\u00cf\7\37\2\2\u00cf"+
		"\u00d0\5*\26\2\u00d0\u00d1\7 \2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d9\5\60\31\2\u00d5\u00d6"+
		"\7%\2\2\u00d6\u00d8\5\60\31\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da+\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00dc\u00dd\7\17\2\2\u00dd\u00de\7\37\2\2\u00de\u00e3\5> \2\u00df"+
		"\u00e0\7%\2\2\u00e0\u00e2\5> \2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\7 \2\2\u00e7-\3\2\2\2\u00e8\u00e9\7\20\2\2\u00e9"+
		"\u00ea\7\37\2\2\u00ea\u00ef\5\60\31\2\u00eb\u00ec\7%\2\2\u00ec\u00ee\5"+
		"\60\31\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7 "+
		"\2\2\u00f3/\3\2\2\2\u00f4\u00fa\5\62\32\2\u00f5\u00f6\5\62\32\2\u00f6"+
		"\u00f7\t\3\2\2\u00f7\u00f8\5\62\32\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3"+
		"\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\61\3\2\2\2\u00fb\u0101\5\64\33\2\u00fc"+
		"\u00fd\5:\36\2\u00fd\u00fe\5\64\33\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\63\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010a\5\66\34\2\u0105\u0106\5<\37"+
		"\2\u0106\u0107\5\66\34\2\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\65\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u0119\5> \2\u010e\u0110\7\27\2\2\u010f\u010e"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0119\58\35\2\u0112"+
		"\u0113\7\37\2\2\u0113\u0114\5\60\31\2\u0114\u0115\7 \2\2\u0115\u0119\3"+
		"\2\2\2\u0116\u0117\7\6\2\2\u0117\u0119\5\66\34\2\u0118\u010d\3\2\2\2\u0118"+
		"\u010f\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2\2\2\u0119\67\3\2\2"+
		"\2\u011a\u011f\7\62\2\2\u011b\u011c\7$\2\2\u011c\u011e\7\62\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\7\60\2\2\u0123"+
		"\u0127\7/\2\2\u0124\u0127\7-\2\2\u0125\u0127\7.\2\2\u0126\u011a\3\2\2"+
		"\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125"+
		"\3\2\2\2\u01279\3\2\2\2\u0128\u0129\t\4\2\2\u0129;\3\2\2\2\u012a\u012b"+
		"\t\5\2\2\u012b=\3\2\2\2\u012c\u0133\7/\2\2\u012d\u012e\7/\2\2\u012e\u012f"+
		"\7!\2\2\u012f\u0130\5\60\31\2\u0130\u0131\7\"\2\2\u0131\u0133\3\2\2\2"+
		"\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0133?\3\2\2\2\u0134\u0139\5"+
		" \21\2\u0135\u0139\5B\"\2\u0136\u0139\5D#\2\u0137\u0139\5F$\2\u0138\u0134"+
		"\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"A\3\2\2\2\u013a\u013b\7\7\2\2\u013b\u013c\5\60\31\2\u013c\u013d\7\b\2"+
		"\2\u013d\u013e\5\"\22\2\u013e\u0147\3\2\2\2\u013f\u0140\7\7\2\2\u0140"+
		"\u0141\5\60\31\2\u0141\u0142\7\b\2\2\u0142\u0143\5\"\22\2\u0143\u0144"+
		"\7\t\2\2\u0144\u0145\5\"\22\2\u0145\u0147\3\2\2\2\u0146\u013a\3\2\2\2"+
		"\u0146\u013f\3\2\2\2\u0147C\3\2\2\2\u0148\u0149\7\13\2\2\u0149\u014a\5"+
		"\60\31\2\u014a\u014b\7\f\2\2\u014b\u014c\5 \21\2\u014cE\3\2\2\2\u014d"+
		"\u014e\7\3\2\2\u014e\u0150\7\37\2\2\u014f\u0151\5\62\32\2\u0150\u014f"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7&\2\2\u0153"+
		"\u0154\5\60\31\2\u0154\u0156\7&\2\2\u0155\u0157\5&\24\2\u0156\u0155\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7 \2\2\u0159"+
		"\u015a\5 \21\2\u015aG\3\2\2\2\u015b\u015c\t\6\2\2\u015cI\3\2\2\2\u015d"+
		"\u015e\t\7\2\2\u015eK\3\2\2\2\"OX[^fhow\u0089\u008f\u009b\u00a9\u00af"+
		"\u00ba\u00c1\u00c7\u00d2\u00d9\u00e3\u00ef\u00f9\u0101\u010a\u010f\u0118"+
		"\u011f\u0126\u0132\u0138\u0146\u0150\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}