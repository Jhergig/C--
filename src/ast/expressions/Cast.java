/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast.expressions;

import ast.AbstractExpression;
import ast.Expression;
import ast.Type;
import visitor.Visitor;

//	cast:expression -> type:type  expression:expression

public class Cast extends AbstractExpression {

	public Cast(Type type, Expression expression) {
		this.typee = type;
		this.expression = expression;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, expression);
	}

	public Cast(Object type, Object expression) {
		this.typee = (Type) getAST(type);
		this.expression = (Expression) getAST(expression);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, expression);
	}

	public Type getTypee() {
		return typee;
	}
	public void setTypee(Type typee) {
		this.typee = typee;
	}

	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Type typee;
	private Expression expression;

	public String toString() {
       return "{type:" + getType() + ", expression:" + getExpression() + "}";
   }
}
