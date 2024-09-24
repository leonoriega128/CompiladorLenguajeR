// Generated from com\compiladores\Taller2024\Simple.g4 by ANTLR 4.5.1
package com.compiladores.Taller2024;

	import java.util.Map;
	import java.util.HashMap;
	

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(SimpleParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(SimpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(SimpleParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#factorial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorial(SimpleParser.FactorialContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique(SimpleParser.UniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(SimpleParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#rev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRev(SimpleParser.RevContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#max}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(SimpleParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#min}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(SimpleParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(SimpleParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(SimpleParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(SimpleParser.LoadContext ctx);
}