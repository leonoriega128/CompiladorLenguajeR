// Generated from com\compiladores\Taller2024\Simple.g4 by ANTLR 4.5.1
package com.compiladores.Taller2024;

	import java.util.Map;
	import java.util.HashMap;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(SimpleParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(SimpleParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(SimpleParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(SimpleParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#factorial}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(SimpleParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#factorial}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(SimpleParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#unique}.
	 * @param ctx the parse tree
	 */
	void enterUnique(SimpleParser.UniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#unique}.
	 * @param ctx the parse tree
	 */
	void exitUnique(SimpleParser.UniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(SimpleParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(SimpleParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#rev}.
	 * @param ctx the parse tree
	 */
	void enterRev(SimpleParser.RevContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#rev}.
	 * @param ctx the parse tree
	 */
	void exitRev(SimpleParser.RevContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#max}.
	 * @param ctx the parse tree
	 */
	void enterMax(SimpleParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#max}.
	 * @param ctx the parse tree
	 */
	void exitMax(SimpleParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#min}.
	 * @param ctx the parse tree
	 */
	void enterMin(SimpleParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#min}.
	 * @param ctx the parse tree
	 */
	void exitMin(SimpleParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(SimpleParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(SimpleParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(SimpleParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(SimpleParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(SimpleParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(SimpleParser.LoadContext ctx);
}