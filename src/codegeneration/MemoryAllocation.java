/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package codegeneration;

import ast.*;
import visitor.*;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

	// class Programa { List<DefVariable> definiciones; List<Sentencia> sentencias;
	// }
	public Object visit(Program node, Object param) {

		int currentAddress = 0;

		for (Definition child : node.getDefinitions()) {
			if (child instanceof VarDefinition) {
				((VarDefinition) child).setAddress(currentAddress);
				currentAddress += ((VarDefinition) child).getType().getSize();
			}
		}
		return null;
	}

}
