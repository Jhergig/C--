/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	structDefinition:definition -> name:String  structfield:structField*

public class StructDefinition extends AbstractDefinition {

	public StructDefinition(String name, List<StructField> structfield) {
		this.name = name;
		this.structfield = structfield;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(structfield);
	}

	public StructDefinition(Object name, Object structfield) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.structfield = this.<StructField>getAstFromContexts(structfield);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, structfield);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<StructField> getStructfield() {
		return structfield;
	}
	public void setStructfield(List<StructField> structfield) {
		this.structfield = structfield;
	}
	public boolean hasField(String name) {
		for (StructField field : structfield) {
			if (field.getName().equals(name))
				return true;
		}
		return false;
	}
	
	public Type fieldType(String name) {
		for (StructField field : structfield) {
			if (field.getName().equals(name))
				return field.getType();
		}
		return null;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<StructField> structfield;

	public String toString() {
       return "{name:" + getName() + ", structfield:" + getStructfield() + "}";
   }
}
