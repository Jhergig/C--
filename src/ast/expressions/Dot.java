/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast.expressions;

import org.antlr.v4.runtime.*;

import ast.AbstractExpression;
import ast.Expression;
import visitor.*;

//	dot:expression -> expression:expression  name:String

public class Dot extends AbstractExpression {

	public Dot(Expression expression, String name) {
		this.expression = expression;
		this.name = name;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression);
	}

	public Dot(Object expression, Object name) {
		this.expression = (Expression) getAST(expression);
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expression, name);
	}

	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression expression;
	private String name;

	public String toString() {
       return "{expression:" + getExpression() + ", name:" + getName() + "}";
   }
}
