/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	arrayOp:expression -> name:expression  pos:expression

public class ArrayOp extends AbstractExpression {

	public ArrayOp(Expression name, Expression pos) {
		this.name = name;
		this.pos = pos;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, pos);
	}

	public ArrayOp(Object name, Object pos) {
		this.name = (Expression) getAST(name);
		this.pos = (Expression) getAST(pos);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, pos);
	}

	public Expression getName() {
		return name;
	}
	public void setName(Expression name) {
		this.name = name;
	}

	public Expression getPos() {
		return pos;
	}
	public void setPos(Expression pos) {
		this.pos = pos;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expression name;
	private Expression pos;

	public String toString() {
       return "{name:" + getName() + ", pos:" + getPos() + "}";
   }
}
