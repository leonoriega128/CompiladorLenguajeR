// Generated from com\compiladores\Taller2024\Simple.g4 by ANTLR 4.5.1
package com.compiladores.Taller2024;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERACIONES=1, IF=2, ELSE=3, SUMA=4, FACTORIAL=5, GRANDE=6, LOAD=7, MULTIVEC=8, 
		MAX=9, MIN=10, SORT=11, REV=12, UNIQUE=13, SUBSET=14, AND=15, OR=16, NOT=17, 
		IGUAL=18, MENOR=19, MAYOR=20, MAYORIGUAL=21, MENORIGUAL=22, ASIGN=23, 
		LLAVEABRE=24, LLAVECIE=25, PARENTABRE=26, PARENTCIE=27, COMAC=28, VECTOR=29, 
		NUMBER=30, ID=31, FIN=32, COMMENT=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPERACIONES", "IF", "ELSE", "SUMA", "FACTORIAL", "GRANDE", "LOAD", "MULTIVEC", 
		"MAX", "MIN", "SORT", "REV", "UNIQUE", "SUBSET", "AND", "OR", "NOT", "IGUAL", 
		"MENOR", "MAYOR", "MAYORIGUAL", "MENORIGUAL", "ASIGN", "LLAVEABRE", "LLAVECIE", 
		"PARENTABRE", "PARENTCIE", "COMAC", "VECTOR", "NUMBER", "ID", "FIN", "COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'suma'", "'factorial'", "'grande'", "'load'", 
		"'multiplicacion_numero_vector'", "'max'", "'min'", "'sort'", "'rev'", 
		"'unique'", "'subset'", "'&&'", "'||'", "'!'", "'='", "'<'", "'>'", "'>='", 
		"'<='", "'<-'", "'{'", "'}'", "'('", "')'", "','", null, null, null, "'#'", 
		"'//'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPERACIONES", "IF", "ELSE", "SUMA", "FACTORIAL", "GRANDE", "LOAD", 
		"MULTIVEC", "MAX", "MIN", "SORT", "REV", "UNIQUE", "SUBSET", "AND", "OR", 
		"NOT", "IGUAL", "MENOR", "MAYOR", "MAYORIGUAL", "MENORIGUAL", "ASIGN", 
		"LLAVEABRE", "LLAVECIE", "PARENTABRE", "PARENTCIE", "COMAC", "VECTOR", 
		"NUMBER", "ID", "FIN", "COMMENT", "WS"
	};
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u00d4\n\36\f\36\16\36\u00d7\13\36\3\36\3\36\3\37\6\37\u00dc"+
		"\n\37\r\37\16\37\u00dd\3 \6 \u00e1\n \r \16 \u00e2\3 \7 \u00e6\n \f \16"+
		" \u00e9\13 \3!\3!\3\"\3\"\3\"\3#\6#\u00f1\n#\r#\16#\u00f2\3#\3#\2\2$\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00fe\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3L\3\2\2\2\5N\3\2\2\2"+
		"\7Q\3\2\2\2\tV\3\2\2\2\13[\3\2\2\2\re\3\2\2\2\17l\3\2\2\2\21q\3\2\2\2"+
		"\23\u008e\3\2\2\2\25\u0092\3\2\2\2\27\u0096\3\2\2\2\31\u009b\3\2\2\2\33"+
		"\u009f\3\2\2\2\35\u00a6\3\2\2\2\37\u00ad\3\2\2\2!\u00b0\3\2\2\2#\u00b3"+
		"\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3\2\2\2"+
		"-\u00be\3\2\2\2/\u00c1\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8"+
		"\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00db\3\2\2\2"+
		"?\u00e0\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E\u00f0\3\2\2\2GM\5)\25\2"+
		"HM\5+\26\2IM\5\'\24\2JM\5-\27\2KM\5%\23\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2"+
		"\2LJ\3\2\2\2LK\3\2\2\2M\4\3\2\2\2NO\7k\2\2OP\7h\2\2P\6\3\2\2\2QR\7g\2"+
		"\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\b\3\2\2\2VW\7u\2\2WX\7w\2\2XY\7o\2\2YZ"+
		"\7c\2\2Z\n\3\2\2\2[\\\7h\2\2\\]\7c\2\2]^\7e\2\2^_\7v\2\2_`\7q\2\2`a\7"+
		"t\2\2ab\7k\2\2bc\7c\2\2cd\7n\2\2d\f\3\2\2\2ef\7i\2\2fg\7t\2\2gh\7c\2\2"+
		"hi\7p\2\2ij\7f\2\2jk\7g\2\2k\16\3\2\2\2lm\7n\2\2mn\7q\2\2no\7c\2\2op\7"+
		"f\2\2p\20\3\2\2\2qr\7o\2\2rs\7w\2\2st\7n\2\2tu\7v\2\2uv\7k\2\2vw\7r\2"+
		"\2wx\7n\2\2xy\7k\2\2yz\7e\2\2z{\7c\2\2{|\7e\2\2|}\7k\2\2}~\7q\2\2~\177"+
		"\7p\2\2\177\u0080\7a\2\2\u0080\u0081\7p\2\2\u0081\u0082\7w\2\2\u0082\u0083"+
		"\7o\2\2\u0083\u0084\7g\2\2\u0084\u0085\7t\2\2\u0085\u0086\7q\2\2\u0086"+
		"\u0087\7a\2\2\u0087\u0088\7x\2\2\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2"+
		"\u008a\u008b\7v\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d\22\3\2"+
		"\2\2\u008e\u008f\7o\2\2\u008f\u0090\7c\2\2\u0090\u0091\7z\2\2\u0091\24"+
		"\3\2\2\2\u0092\u0093\7o\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\26\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099"+
		"\u009a\7v\2\2\u009a\30\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7x\2\2\u009e\32\3\2\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7s\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\34\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7"+
		"d\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\36"+
		"\3\2\2\2\u00ad\u00ae\7(\2\2\u00ae\u00af\7(\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7~\2\2\u00b1\u00b2\7~\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4$\3"+
		"\2\2\2\u00b5\u00b6\7?\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8(\3\2"+
		"\2\2\u00b9\u00ba\7@\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd,\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0.\3"+
		"\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7/\2\2\u00c3\60\3\2\2\2\u00c4\u00c5"+
		"\7}\2\2\u00c5\62\3\2\2\2\u00c6\u00c7\7\177\2\2\u00c7\64\3\2\2\2\u00c8"+
		"\u00c9\7*\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb8\3\2\2\2\u00cc"+
		"\u00cd\7.\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf\u00d5\5=\37\2\u00d0"+
		"\u00d1\59\35\2\u00d1\u00d2\5=\37\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7+\2\2\u00d9<\3\2\2\2\u00da"+
		"\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de>\3\2\2\2\u00df\u00e1\t\3\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e7\3\2\2\2\u00e4\u00e6\5=\37\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8@\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00eb\7%\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00eeD\3\2\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\b#\2\2\u00f5F\3\2\2\2\t\2L\u00d5\u00dd\u00e2\u00e7"+
		"\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}