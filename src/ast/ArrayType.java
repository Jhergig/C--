/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	arrayType:type -> type:type  size:int

public class ArrayType extends AbstractType {

	public ArrayType(Type type, int size) {
		this.type = type;
		this.size = size;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type);
	}

	public ArrayType(Object type, Object size) {
		this.type = (Type) getAST(type);
		this.size = (size instanceof Token) ? Integer.parseInt(((Token)size).getText()) : (Integer) size;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type, size);
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Type type;
	private int size;

	public String toString() {
       return "{type:" + getType() + ", size:" + getSize() + "}";
   }

	@Override
	public char getSuffix() {
		return 0;
	}

	@Override
	public String getMAPLName() {
		return null;
	}
}
