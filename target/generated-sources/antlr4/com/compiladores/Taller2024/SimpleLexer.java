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
		LLAVEABRE=24, LLAVECIE=25, PARENTABRE=26, PARENTCIE=27, COMAC=28, NUMBER=29, 
		ID=30, FIN=31, COMMENT=32, WS=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPERACIONES", "IF", "ELSE", "SUMA", "FACTORIAL", "GRANDE", "LOAD", "MULTIVEC", 
		"MAX", "MIN", "SORT", "REV", "UNIQUE", "SUBSET", "AND", "OR", "NOT", "IGUAL", 
		"MENOR", "MAYOR", "MAYORIGUAL", "MENORIGUAL", "ASIGN", "LLAVEABRE", "LLAVECIE", 
		"PARENTABRE", "PARENTCIE", "COMAC", "NUMBER", "ID", "FIN", "COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'if'", "'else'", "'suma'", "'factorial'", "'grande'", "'load'", 
		"'multiplicacion_numero_vector'", "'max'", "'min'", "'sort'", "'rev'", 
		"'unique'", "'subset'", "'&&'", "'||'", "'!'", "'='", "'<'", "'>'", "'>='", 
		"'<='", "'<-'", "'{'", "'}'", "'('", "')'", "','", null, null, "'#'", 
		"'//'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPERACIONES", "IF", "ELSE", "SUMA", "FACTORIAL", "GRANDE", "LOAD", 
		"MULTIVEC", "MAX", "MIN", "SORT", "REV", "UNIQUE", "SUBSET", "AND", "OR", 
		"NOT", "IGUAL", "MENOR", "MAYOR", "MAYORIGUAL", "MENORIGUAL", "ASIGN", 
		"LLAVEABRE", "LLAVECIE", "PARENTABRE", "PARENTCIE", "COMAC", "NUMBER", 
		"ID", "FIN", "COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\5\2K\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u00ce\n\36\r\36"+
		"\16\36\u00cf\3\37\6\37\u00d3\n\37\r\37\16\37\u00d4\3\37\7\37\u00d8\n\37"+
		"\f\37\16\37\u00db\13\37\3 \3 \3!\3!\3!\3\"\6\"\u00e3\n\"\r\"\16\"\u00e4"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\u00ef"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3J\3\2\2\2\5L\3\2\2"+
		"\2\7O\3\2\2\2\tT\3\2\2\2\13Y\3\2\2\2\rc\3\2\2\2\17j\3\2\2\2\21o\3\2\2"+
		"\2\23\u008c\3\2\2\2\25\u0090\3\2\2\2\27\u0094\3\2\2\2\31\u0099\3\2\2\2"+
		"\33\u009d\3\2\2\2\35\u00a4\3\2\2\2\37\u00ab\3\2\2\2!\u00ae\3\2\2\2#\u00b1"+
		"\3\2\2\2%\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2"+
		"-\u00bc\3\2\2\2/\u00bf\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65\u00c6"+
		"\3\2\2\2\67\u00c8\3\2\2\29\u00ca\3\2\2\2;\u00cd\3\2\2\2=\u00d2\3\2\2\2"+
		"?\u00dc\3\2\2\2A\u00de\3\2\2\2C\u00e2\3\2\2\2EK\5)\25\2FK\5+\26\2GK\5"+
		"\'\24\2HK\5-\27\2IK\5%\23\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI"+
		"\3\2\2\2K\4\3\2\2\2LM\7k\2\2MN\7h\2\2N\6\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7"+
		"u\2\2RS\7g\2\2S\b\3\2\2\2TU\7u\2\2UV\7w\2\2VW\7o\2\2WX\7c\2\2X\n\3\2\2"+
		"\2YZ\7h\2\2Z[\7c\2\2[\\\7e\2\2\\]\7v\2\2]^\7q\2\2^_\7t\2\2_`\7k\2\2`a"+
		"\7c\2\2ab\7n\2\2b\f\3\2\2\2cd\7i\2\2de\7t\2\2ef\7c\2\2fg\7p\2\2gh\7f\2"+
		"\2hi\7g\2\2i\16\3\2\2\2jk\7n\2\2kl\7q\2\2lm\7c\2\2mn\7f\2\2n\20\3\2\2"+
		"\2op\7o\2\2pq\7w\2\2qr\7n\2\2rs\7v\2\2st\7k\2\2tu\7r\2\2uv\7n\2\2vw\7"+
		"k\2\2wx\7e\2\2xy\7c\2\2yz\7e\2\2z{\7k\2\2{|\7q\2\2|}\7p\2\2}~\7a\2\2~"+
		"\177\7p\2\2\177\u0080\7w\2\2\u0080\u0081\7o\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7q\2\2\u0084\u0085\7a\2\2\u0085\u0086\7x\2\2"+
		"\u0086\u0087\7g\2\2\u0087\u0088\7e\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7t\2\2\u008b\22\3\2\2\2\u008c\u008d\7o\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7z\2\2\u008f\24\3\2\2\2\u0090\u0091\7o\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7p\2\2\u0093\26\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7v\2\2\u0098\30\3\2\2\2\u0099\u009a"+
		"\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7x\2\2\u009c\32\3\2\2\2\u009d\u009e"+
		"\7w\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7s\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7w\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00ad\7"+
		"(\2\2\u00ad \3\2\2\2\u00ae\u00af\7~\2\2\u00af\u00b0\7~\2\2\u00b0\"\3\2"+
		"\2\2\u00b1\u00b2\7#\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4&\3\2\2"+
		"\2\u00b5\u00b6\7>\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8*\3\2\2\2"+
		"\u00b9\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7>\2"+
		"\2\u00bd\u00be\7?\2\2\u00be.\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\7"+
		"/\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\62\3\2\2\2\u00c4\u00c5"+
		"\7\177\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\66\3\2\2\2\u00c8"+
		"\u00c9\7+\2\2\u00c98\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb:\3\2\2\2\u00cc\u00ce"+
		"\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0<\3\2\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9"+
		"\3\2\2\2\u00d6\u00d8\5;\36\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da>\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00dc\u00dd\7%\2\2\u00dd@\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7"+
		"\61\2\2\u00e0B\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\b\"\2\2\u00e7D\3\2\2\2\b\2J\u00cf\u00d4\u00d9\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}