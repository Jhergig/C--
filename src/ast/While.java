/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	while:sentence -> expression:expression  doo:sentence*

public class While extends AbstractSentence {

	public While(Expression expression, List<Sentence> doo) {
		this.expression = expression;
		this.doo = doo;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression, doo);
	}

	public While(Object expression, Object doo) {
		this.expression = (Expression) getAST(expression);
		this.doo = this.<Sentence>getAstFromContexts(doo);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression, doo);
	}

	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public List<Sentence> getDoo() {
		return doo;
	}
	public void setDoo(List<Sentence> doo) {
		this.doo = doo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression expression;
	private List<Sentence> doo;

	public String toString() {
       return "{expression:" + getExpression() + ", doo:" + getDoo() + "}";
   }
}
