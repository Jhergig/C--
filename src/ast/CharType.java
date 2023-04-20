/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	charType:type -> 

public class CharType extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

    public int getSize() {
        return 2;
    }
    
	public String toString() {
       return "{CharType}";
   }

	@Override
	public char getSuffix() {
		return 'c';
	}

	@Override
	public String getMAPLName() {
		return "char";
	}
}
