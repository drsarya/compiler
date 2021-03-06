// Generated from C:/Users/PC/Desktop/eeee/compilator/compilatorPascal/src/main/java/gram\GrammarFile.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "FOR", "OR", 
			"AND", "NOT", "IF", "THEN", "ELSE", "OF", "WHILE", "DO", "BEGIN", "END", 
			"READ", "WRITE", "VAR", "ARRAY", "PROCEDURE", "PROGRAM", "DIV", "PLUS", 
			"MINUS", "MULT", "EQUALS", "RT", "LT", "LE", "RE", "LR", "OP", "CP", 
			"OC", "CC", "ATTRIB", "DOT", "COMMA", "SMCOLON", "COLON", "DBDOT", "INTEGER", 
			"BOOLEAN", "FLOAT", "STRING", "TRUE", "FALSE", "ID", "STR", "WS", "DIGIT"
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


	public GrammarFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0192\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3G\3H\3H\7H\u017c\nH\fH\16H\u017f\13H\3I\3I\7I\u0183"+
		"\nI\fI\16I\u0186\13I\3I\3I\3J\3J\3J\3J\3K\6K\u018f\nK\rK\16K\u0190\2\2"+
		"L\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG"+
		"\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\3\2!\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\6\2\62;C\\a"+
		"ac|\7\2\13\13\"\"\62;C\\c|\5\2\13\f\17\17\"\"\3\2\62;\2\u017a\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2\2\t\u009d"+
		"\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a3\3\2\2\2\21\u00a5\3"+
		"\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2\2\31\u00ad\3\2"+
		"\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2\2\2!\u00b5\3\2\2\2"+
		"#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3"+
		"\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2"+
		"\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00cf\3\2\2\2;\u00d2\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00da\3\2\2\2A\u00dd\3\2\2\2C\u00e2\3\2\2\2E\u00e7\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00f0\3\2\2\2K\u00f3\3\2\2\2M\u00f9\3\2\2\2O\u00fd\3\2"+
		"\2\2Q\u0102\3\2\2\2S\u0108\3\2\2\2U\u010c\3\2\2\2W\u0112\3\2\2\2Y\u011c"+
		"\3\2\2\2[\u0124\3\2\2\2]\u0126\3\2\2\2_\u0128\3\2\2\2a\u012a\3\2\2\2c"+
		"\u012c\3\2\2\2e\u012e\3\2\2\2g\u0130\3\2\2\2i\u0132\3\2\2\2k\u0135\3\2"+
		"\2\2m\u0138\3\2\2\2o\u013b\3\2\2\2q\u013d\3\2\2\2s\u013f\3\2\2\2u\u0141"+
		"\3\2\2\2w\u0143\3\2\2\2y\u0146\3\2\2\2{\u0148\3\2\2\2}\u014a\3\2\2\2\177"+
		"\u014c\3\2\2\2\u0081\u014e\3\2\2\2\u0083\u0151\3\2\2\2\u0085\u0159\3\2"+
		"\2\2\u0087\u0161\3\2\2\2\u0089\u0167\3\2\2\2\u008b\u016e\3\2\2\2\u008d"+
		"\u0173\3\2\2\2\u008f\u0179\3\2\2\2\u0091\u0180\3\2\2\2\u0093\u0189\3\2"+
		"\2\2\u0095\u018e\3\2\2\2\u0097\u0098\t\2\2\2\u0098\4\3\2\2\2\u0099\u009a"+
		"\t\3\2\2\u009a\6\3\2\2\2\u009b\u009c\t\4\2\2\u009c\b\3\2\2\2\u009d\u009e"+
		"\t\5\2\2\u009e\n\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\f\3\2\2\2\u00a1\u00a2"+
		"\t\7\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\20\3\2\2\2\u00a5\u00a6"+
		"\t\t\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\t\n\2\2\u00a8\24\3\2\2\2\u00a9\u00aa"+
		"\t\13\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\t\f\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\t\r\2\2\u00ae\32\3\2\2\2\u00af\u00b0\t\16\2\2\u00b0\34\3\2\2\2"+
		"\u00b1\u00b2\t\17\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\t\20\2\2\u00b4 \3\2"+
		"\2\2\u00b5\u00b6\t\21\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\t\22\2\2\u00b8$"+
		"\3\2\2\2\u00b9\u00ba\t\23\2\2\u00ba&\3\2\2\2\u00bb\u00bc\t\24\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\t\25\2\2\u00be*\3\2\2\2\u00bf\u00c0\t\26\2\2\u00c0"+
		",\3\2\2\2\u00c1\u00c2\t\27\2\2\u00c2.\3\2\2\2\u00c3\u00c4\t\30\2\2\u00c4"+
		"\60\3\2\2\2\u00c5\u00c6\t\31\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\t\32\2\2"+
		"\u00c8\64\3\2\2\2\u00c9\u00ca\t\33\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\5"+
		"\r\7\2\u00cc\u00cd\5\37\20\2\u00cd\u00ce\5%\23\2\u00ce8\3\2\2\2\u00cf"+
		"\u00d0\5\37\20\2\u00d0\u00d1\5%\23\2\u00d1:\3\2\2\2\u00d2\u00d3\5\3\2"+
		"\2\u00d3\u00d4\5\35\17\2\u00d4\u00d5\5\t\5\2\u00d5<\3\2\2\2\u00d6\u00d7"+
		"\5\35\17\2\u00d7\u00d8\5\37\20\2\u00d8\u00d9\5)\25\2\u00d9>\3\2\2\2\u00da"+
		"\u00db\5\23\n\2\u00db\u00dc\5\r\7\2\u00dc@\3\2\2\2\u00dd\u00de\5)\25\2"+
		"\u00de\u00df\5\21\t\2\u00df\u00e0\5\13\6\2\u00e0\u00e1\5\35\17\2\u00e1"+
		"B\3\2\2\2\u00e2\u00e3\5\13\6\2\u00e3\u00e4\5\31\r\2\u00e4\u00e5\5\'\24"+
		"\2\u00e5\u00e6\5\13\6\2\u00e6D\3\2\2\2\u00e7\u00e8\5\37\20\2\u00e8\u00e9"+
		"\5\r\7\2\u00e9F\3\2\2\2\u00ea\u00eb\5/\30\2\u00eb\u00ec\5\21\t\2\u00ec"+
		"\u00ed\5\23\n\2\u00ed\u00ee\5\31\r\2\u00ee\u00ef\5\13\6\2\u00efH\3\2\2"+
		"\2\u00f0\u00f1\5\t\5\2\u00f1\u00f2\5\37\20\2\u00f2J\3\2\2\2\u00f3\u00f4"+
		"\5\5\3\2\u00f4\u00f5\5\13\6\2\u00f5\u00f6\5\17\b\2\u00f6\u00f7\5\23\n"+
		"\2\u00f7\u00f8\5\35\17\2\u00f8L\3\2\2\2\u00f9\u00fa\5\13\6\2\u00fa\u00fb"+
		"\5\35\17\2\u00fb\u00fc\5\t\5\2\u00fcN\3\2\2\2\u00fd\u00fe\5%\23\2\u00fe"+
		"\u00ff\5\13\6\2\u00ff\u0100\5\3\2\2\u0100\u0101\5\t\5\2\u0101P\3\2\2\2"+
		"\u0102\u0103\5/\30\2\u0103\u0104\5%\23\2\u0104\u0105\5\23\n\2\u0105\u0106"+
		"\5)\25\2\u0106\u0107\5\13\6\2\u0107R\3\2\2\2\u0108\u0109\5-\27\2\u0109"+
		"\u010a\5\3\2\2\u010a\u010b\5%\23\2\u010bT\3\2\2\2\u010c\u010d\5\3\2\2"+
		"\u010d\u010e\5%\23\2\u010e\u010f\5%\23\2\u010f\u0110\5\3\2\2\u0110\u0111"+
		"\5\63\32\2\u0111V\3\2\2\2\u0112\u0113\5!\21\2\u0113\u0114\5%\23\2\u0114"+
		"\u0115\5\37\20\2\u0115\u0116\5\7\4\2\u0116\u0117\5\13\6\2\u0117\u0118"+
		"\5\t\5\2\u0118\u0119\5+\26\2\u0119\u011a\5%\23\2\u011a\u011b\5\13\6\2"+
		"\u011bX\3\2\2\2\u011c\u011d\5!\21\2\u011d\u011e\5%\23\2\u011e\u011f\5"+
		"\37\20\2\u011f\u0120\5\17\b\2\u0120\u0121\5%\23\2\u0121\u0122\5\3\2\2"+
		"\u0122\u0123\5\33\16\2\u0123Z\3\2\2\2\u0124\u0125\7\61\2\2\u0125\\\3\2"+
		"\2\2\u0126\u0127\7-\2\2\u0127^\3\2\2\2\u0128\u0129\7/\2\2\u0129`\3\2\2"+
		"\2\u012a\u012b\7,\2\2\u012bb\3\2\2\2\u012c\u012d\7?\2\2\u012dd\3\2\2\2"+
		"\u012e\u012f\7@\2\2\u012ff\3\2\2\2\u0130\u0131\7>\2\2\u0131h\3\2\2\2\u0132"+
		"\u0133\7>\2\2\u0133\u0134\7?\2\2\u0134j\3\2\2\2\u0135\u0136\7@\2\2\u0136"+
		"\u0137\7?\2\2\u0137l\3\2\2\2\u0138\u0139\7>\2\2\u0139\u013a\7@\2\2\u013a"+
		"n\3\2\2\2\u013b\u013c\7*\2\2\u013cp\3\2\2\2\u013d\u013e\7+\2\2\u013er"+
		"\3\2\2\2\u013f\u0140\7]\2\2\u0140t\3\2\2\2\u0141\u0142\7_\2\2\u0142v\3"+
		"\2\2\2\u0143\u0144\7<\2\2\u0144\u0145\7?\2\2\u0145x\3\2\2\2\u0146\u0147"+
		"\7\60\2\2\u0147z\3\2\2\2\u0148\u0149\7.\2\2\u0149|\3\2\2\2\u014a\u014b"+
		"\7=\2\2\u014b~\3\2\2\2\u014c\u014d\7<\2\2\u014d\u0080\3\2\2\2\u014e\u014f"+
		"\7\60\2\2\u014f\u0150\7\60\2\2\u0150\u0082\3\2\2\2\u0151\u0152\5\23\n"+
		"\2\u0152\u0153\5\35\17\2\u0153\u0154\5)\25\2\u0154\u0155\5\13\6\2\u0155"+
		"\u0156\5\17\b\2\u0156\u0157\5\13\6\2\u0157\u0158\5%\23\2\u0158\u0084\3"+
		"\2\2\2\u0159\u015a\5\5\3\2\u015a\u015b\5\37\20\2\u015b\u015c\5\37\20\2"+
		"\u015c\u015d\5\31\r\2\u015d\u015e\5\13\6\2\u015e\u015f\5\3\2\2\u015f\u0160"+
		"\5\35\17\2\u0160\u0086\3\2\2\2\u0161\u0162\5\r\7\2\u0162\u0163\5\31\r"+
		"\2\u0163\u0164\5\37\20\2\u0164\u0165\5\3\2\2\u0165\u0166\5)\25\2\u0166"+
		"\u0088\3\2\2\2\u0167\u0168\5\'\24\2\u0168\u0169\5)\25\2\u0169\u016a\5"+
		"%\23\2\u016a\u016b\5\23\n\2\u016b\u016c\5\35\17\2\u016c\u016d\5\17\b\2"+
		"\u016d\u008a\3\2\2\2\u016e\u016f\5)\25\2\u016f\u0170\5%\23\2\u0170\u0171"+
		"\5+\26\2\u0171\u0172\5\13\6\2\u0172\u008c\3\2\2\2\u0173\u0174\5\r\7\2"+
		"\u0174\u0175\5\3\2\2\u0175\u0176\5\31\r\2\u0176\u0177\5\'\24\2\u0177\u0178"+
		"\5\13\6\2\u0178\u008e\3\2\2\2\u0179\u017d\t\34\2\2\u017a\u017c\t\35\2"+
		"\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0090\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0184\7$\2\2\u0181"+
		"\u0183\t\36\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3"+
		"\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7$\2\2\u0188\u0092\3\2\2\2\u0189\u018a\t\37\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\bJ\2\2\u018c\u0094\3\2\2\2\u018d\u018f\t \2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0096\3\2\2\2\6\2\u017d\u0184\u0190\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}