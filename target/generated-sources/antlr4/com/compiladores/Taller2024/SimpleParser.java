// Generated from com\compiladores\Taller2024\Simple.g4 by ANTLR 4.5.1
package com.compiladores.Taller2024;

	import java.util.Map;
	import java.util.HashMap;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
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
	public static final int
		RULE_texto = 0, RULE_sentence = 1, RULE_asignacion = 2, RULE_compare = 3, 
		RULE_factorial = 4, RULE_unique = 5, RULE_suma = 6, RULE_rev = 7, RULE_max = 8, 
		RULE_min = 9, RULE_sort = 10, RULE_si = 11, RULE_load = 12;
	public static final String[] ruleNames = {
		"texto", "sentence", "asignacion", "compare", "factorial", "unique", "suma", 
		"rev", "max", "min", "sort", "si", "load"
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

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String,Object> symbolTable=new HashMap<String, Object>();

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TextoContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(SimpleParser.FIN, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SUMA) | (1L << FACTORIAL) | (1L << MAX) | (1L << MIN) | (1L << SORT) | (1L << REV) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				sentence();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(FIN);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public FactorialContext factorial() {
			return getRuleContext(FactorialContext.class,0);
		}
		public RevContext rev() {
			return getRuleContext(RevContext.class,0);
		}
		public MaxContext max() {
			return getRuleContext(MaxContext.class,0);
		}
		public MinContext min() {
			return getRuleContext(MinContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				compare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				suma();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				factorial();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				rev();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				max();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				min();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				sort();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(42);
				si();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(43);
				load();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(SimpleParser.IGUAL, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public TerminalNode VECTOR() { return getToken(SimpleParser.VECTOR, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(IGUAL);
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==VECTOR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CompareContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public TerminalNode OPERACIONES() { return getToken(SimpleParser.OPERACIONES, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(NUMBER);
			setState(51);
			match(OPERACIONES);
			setState(52);
			match(NUMBER);
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

	public static class FactorialContext extends ParserRuleContext {
		public int result;
		public Token n;
		public TerminalNode FACTORIAL() { return getToken(SimpleParser.FACTORIAL, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public TerminalNode NUMBER() { return getToken(SimpleParser.NUMBER, 0); }
		public FactorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterFactorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitFactorial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitFactorial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorialContext factorial() throws RecognitionException {
		FactorialContext _localctx = new FactorialContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factorial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FACTORIAL);
			setState(55);
			match(PARENTABRE);
			setState(56);
			((FactorialContext)_localctx).n = match(NUMBER);
			setState(57);
			match(PARENTCIE);

			        int num = Integer.parseInt((((FactorialContext)_localctx).n!=null?((FactorialContext)_localctx).n.getText():null));
			        ((FactorialContext)_localctx).result =  1;
			        for (int i = 1; i <= num; i++) {
			            _localctx.result *= i;
			        }
			        System.out.println("Factorial de " + num + " es " + _localctx.result);
			    
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

	public static class UniqueContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(SimpleParser.UNIQUE, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public UniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterUnique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitUnique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueContext unique() throws RecognitionException {
		UniqueContext _localctx = new UniqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(UNIQUE);
			setState(61);
			match(PARENTABRE);
			setState(62);
			match(ID);
			setState(63);
			match(PARENTCIE);
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

	public static class SumaContext extends ParserRuleContext {
		public int value;
		public Token n1;
		public Token n2;
		public TerminalNode SUMA() { return getToken(SimpleParser.SUMA, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode COMAC() { return getToken(SimpleParser.COMAC, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(SUMA);
			setState(66);
			match(PARENTABRE);
			setState(67);
			((SumaContext)_localctx).n1 = match(NUMBER);
			setState(68);
			match(COMAC);
			setState(69);
			((SumaContext)_localctx).n2 = match(NUMBER);
			setState(70);
			match(PARENTCIE);

			        ((SumaContext)_localctx).value =  Integer.parseInt((((SumaContext)_localctx).n1!=null?((SumaContext)_localctx).n1.getText():null)) + Integer.parseInt((((SumaContext)_localctx).n2!=null?((SumaContext)_localctx).n2.getText():null));
			        System.out.println("Sumando dos números: " + (((SumaContext)_localctx).n1!=null?((SumaContext)_localctx).n1.getText():null) + " + " + (((SumaContext)_localctx).n2!=null?((SumaContext)_localctx).n2.getText():null) + " = " + _localctx.value);
			    
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

	public static class RevContext extends ParserRuleContext {
		public TerminalNode REV() { return getToken(SimpleParser.REV, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public RevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterRev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitRev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitRev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RevContext rev() throws RecognitionException {
		RevContext _localctx = new RevContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(REV);
			setState(74);
			match(PARENTABRE);
			setState(75);
			match(ID);
			setState(76);
			match(PARENTCIE);
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

	public static class MaxContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public TerminalNode MAX() { return getToken(SimpleParser.MAX, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public MaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxContext max() throws RecognitionException {
		MaxContext _localctx = new MaxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_max);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MAX);
			setState(79);
			match(PARENTABRE);
			setState(80);
			((MaxContext)_localctx).ID = match(ID);
			((MaxContext)_localctx).value =  (((MaxContext)_localctx).ID!=null?((MaxContext)_localctx).ID.getText():null);
			setState(82);
			match(PARENTCIE);
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

	public static class MinContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(SimpleParser.MIN, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public MinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinContext min() throws RecognitionException {
		MinContext _localctx = new MinContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_min);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(MIN);
			setState(85);
			match(PARENTABRE);
			setState(86);
			match(ID);
			setState(87);
			match(PARENTCIE);
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

	public static class SortContext extends ParserRuleContext {
		public TerminalNode SORT() { return getToken(SimpleParser.SORT, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SORT);
			setState(90);
			match(PARENTABRE);
			setState(91);
			match(ID);
			setState(92);
			match(PARENTCIE);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleParser.IF, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public List<TerminalNode> LLAVEABRE() { return getTokens(SimpleParser.LLAVEABRE); }
		public TerminalNode LLAVEABRE(int i) {
			return getToken(SimpleParser.LLAVEABRE, i);
		}
		public List<TerminalNode> LLAVECIE() { return getTokens(SimpleParser.LLAVECIE); }
		public TerminalNode LLAVECIE(int i) {
			return getToken(SimpleParser.LLAVECIE, i);
		}
		public List<TerminalNode> OPERACIONES() { return getTokens(SimpleParser.OPERACIONES); }
		public TerminalNode OPERACIONES(int i) {
			return getToken(SimpleParser.OPERACIONES, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleParser.ELSE, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			match(PARENTABRE);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER || _la==ID );
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERACIONES) {
				{
				{
				setState(101);
				match(OPERACIONES);
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==ID) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(PARENTCIE);
			setState(109);
			match(LLAVEABRE);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				sentence();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SUMA) | (1L << FACTORIAL) | (1L << MAX) | (1L << MIN) | (1L << SORT) | (1L << REV) | (1L << NUMBER) | (1L << ID))) != 0) );
			setState(115);
			match(LLAVECIE);
			setState(125);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(116);
				match(ELSE);
				setState(117);
				match(LLAVEABRE);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					sentence();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << SUMA) | (1L << FACTORIAL) | (1L << MAX) | (1L << MIN) | (1L << SORT) | (1L << REV) | (1L << NUMBER) | (1L << ID))) != 0) );
				setState(123);
				match(LLAVECIE);
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

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(SimpleParser.ASIGN, 0); }
		public TerminalNode LOAD() { return getToken(SimpleParser.LOAD, 0); }
		public TerminalNode PARENTABRE() { return getToken(SimpleParser.PARENTABRE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpleParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpleParser.NUMBER, i);
		}
		public TerminalNode PARENTCIE() { return getToken(SimpleParser.PARENTCIE, 0); }
		public List<TerminalNode> COMAC() { return getTokens(SimpleParser.COMAC); }
		public TerminalNode COMAC(int i) {
			return getToken(SimpleParser.COMAC, i);
		}
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitLoad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVisitor ) return ((SimpleVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_load);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(ASIGN);
			setState(129);
			match(LOAD);
			setState(130);
			match(PARENTABRE);
			setState(131);
			match(NUMBER);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMAC) {
				{
				{
				setState(132);
				match(COMAC);
				setState(133);
				match(NUMBER);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(PARENTCIE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0090\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\rd\n\r\r\r\16\re\3\r"+
		"\3\r\7\rj\n\r\f\r\16\rm\13\r\3\r\3\r\3\r\6\rr\n\r\r\r\16\rs\3\r\3\r\3"+
		"\r\3\r\6\rz\n\r\r\r\16\r{\3\r\3\r\5\r\u0080\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16\3\16\3\16\3\16\2"+
		"\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\37 \3\2 !\u0092\2\37\3"+
		"\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f>\3\2\2\2\16C"+
		"\3\2\2\2\20K\3\2\2\2\22P\3\2\2\2\24V\3\2\2\2\26[\3\2\2\2\30`\3\2\2\2\32"+
		"\u0081\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\"\2\2#\3\3\2\2\2$/\5\6\4\2%/\5\b"+
		"\5\2&/\5\16\b\2\'/\5\n\6\2(/\5\20\t\2)/\5\22\n\2*/\5\24\13\2+/\5\26\f"+
		"\2,/\5\30\r\2-/\5\32\16\2.$\3\2\2\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.(\3"+
		"\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60"+
		"\61\7!\2\2\61\62\7\24\2\2\62\63\t\2\2\2\63\7\3\2\2\2\64\65\7 \2\2\65\66"+
		"\7\3\2\2\66\67\7 \2\2\67\t\3\2\2\289\7\7\2\29:\7\34\2\2:;\7 \2\2;<\7\35"+
		"\2\2<=\b\6\1\2=\13\3\2\2\2>?\7\17\2\2?@\7\34\2\2@A\7!\2\2AB\7\35\2\2B"+
		"\r\3\2\2\2CD\7\6\2\2DE\7\34\2\2EF\7 \2\2FG\7\36\2\2GH\7 \2\2HI\7\35\2"+
		"\2IJ\b\b\1\2J\17\3\2\2\2KL\7\16\2\2LM\7\34\2\2MN\7!\2\2NO\7\35\2\2O\21"+
		"\3\2\2\2PQ\7\13\2\2QR\7\34\2\2RS\7!\2\2ST\b\n\1\2TU\7\35\2\2U\23\3\2\2"+
		"\2VW\7\f\2\2WX\7\34\2\2XY\7!\2\2YZ\7\35\2\2Z\25\3\2\2\2[\\\7\r\2\2\\]"+
		"\7\34\2\2]^\7!\2\2^_\7\35\2\2_\27\3\2\2\2`a\7\4\2\2ac\7\34\2\2bd\t\3\2"+
		"\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2gh\7\3\2\2hj\t\3\2"+
		"\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\35"+
		"\2\2oq\7\32\2\2pr\5\4\3\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2u\177\7\33\2\2vw\7\5\2\2wy\7\32\2\2xz\5\4\3\2yx\3\2\2\2z{\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\33\2\2~\u0080\3\2\2\2\177v\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\7!\2\2\u0082\u0083\7"+
		"\31\2\2\u0083\u0084\7\t\2\2\u0084\u0085\7\34\2\2\u0085\u008a\7 \2\2\u0086"+
		"\u0087\7\36\2\2\u0087\u0089\7 \2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\35\2\2\u008e\33\3\2\2\2\n\37.eks{\177\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}