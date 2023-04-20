/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	floatType:type -> 

public class FloatType extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public int getSize() {
		return 4;
	}

	public String toString() {
		return "{FloatType}";
	}

	@Override
	public char getSuffix() {
		return 'f';
	}

	@Override
	public String getMAPLName() {
		return "float";
	}
}
