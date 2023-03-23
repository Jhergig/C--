/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	if:sentence -> expression:expression  truee:sentence*  falsee:sentence*

public class If extends AbstractSentence {

	public If(Expression expression, List<Sentence> truee, List<Sentence> falsee) {
		this.expression = expression;
		this.truee = truee;
		this.falsee = falsee;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression, truee, falsee);
	}

	public If(Object expression, Object truee, Object falsee) {
		this.expression = (Expression) getAST(expression);
		this.truee = this.<Sentence>getAstFromContexts(truee);
		this.falsee = this.<Sentence>getAstFromContexts(falsee);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression, truee, falsee);
	}

	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public List<Sentence> getTruee() {
		return truee;
	}
	public void setTruee(List<Sentence> truee) {
		this.truee = truee;
	}

	public List<Sentence> getFalsee() {
		return falsee;
	}
	public void setFalsee(List<Sentence> falsee) {
		this.falsee = falsee;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression expression;
	private List<Sentence> truee;
	private List<Sentence> falsee;

	public String toString() {
       return "{expression:" + getExpression() + ", truee:" + getTruee() + ", falsee:" + getFalsee() + "}";
   }
}
