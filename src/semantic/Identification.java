/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import java.util.HashMap;
import java.util.Map;

import ast.AST;
import ast.FunctionDefinition;
import ast.Parameter;
import ast.Position;
import ast.StructDefinition;
import ast.StructField;
import ast.StructType;
import ast.VarDefinition;
import ast.expressions.FunctionCallExp;
import ast.expressions.Variable;
import ast.sentences.FunctionCallSen;
import main.ErrorManager;
import visitor.DefaultVisitor;

public class Identification extends DefaultVisitor {

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    //	class VarDefinition { Type type;  String name; }
    public Object visit(VarDefinition node, Object param) {
        node.getType().accept(this, param); // No es necesario realmente

        VarDefinition definicion = variables.getFromTop(node.getName());
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node);
        variables.put(node.getName(), node);
        return null;
    }

    //	class Variable { String name; }
    public Object visit(Variable node, Object param) {
        VarDefinition definicion = variables.getFromAny(node.getName());
        predicado(definicion != null, "Variable no definida: " + node.getName(), node);
        node.setDefinicion(definicion); // Enlazar referencia con definición
        return null;
    }
    
    public Object visit(Parameter node, Object param) {
    	VarDefinition parametro = variables.getFromTop(node.getName());
    	predicado(parametro == null, "Parámetro ya definido: " + node.getName(), node);
    	variables.put(node.getName(), new VarDefinition(node.getType(), node.getName()));
		return null;
    }
    
    public Object visit(FunctionDefinition node, Object param) {
    	FunctionDefinition definicion = functions.get(node.getName());
    	predicado(definicion == null, "Función ya definida: " + node.getName(), node);
    	functions.put(node.getName(), node);
    	variables.set();
    	super.visit(node, param);
    	variables.reset();
    	return null;
    }
    
    public Object visit(FunctionCallExp node, Object param) {
    	super.visit(node, param);
    	FunctionDefinition definicion = functions.get(node.getName());
    	predicado(definicion != null, "Función no definida: " + node.getName(), node);
    	node.setDefinicion(definicion);
    	return null;
    }
    
    public Object visit(FunctionCallSen node, Object param) {
    	super.visit(node, param);
    	FunctionDefinition definicion = functions.get(node.getName());
    	predicado(definicion != null, "Función no definida: " + node.getName(), node);
    	node.setDefinicion(definicion);
    	return null;
    }
    
    public Object visit(StructDefinition node, Object param) {
    	structFields.set();
    	super.visit(node, param);
    	structFields.reset();
    	
    	StructDefinition definicion = structs.get(node.getName());
    	predicado(definicion == null, "Struct ya definido: " + node.getName(), node);
    	structs.put(node.getName(), node);
    	return null;
    }
    
    public Object visit(StructType node, Object param) {
    	StructDefinition definicion = structs.get(node.getName());
    	predicado(definicion != null, "Struct no definido: " + node.getName(), node);
    	node.setDefinicion(definicion);
    	return null;
    }
    
    public Object visit(StructField node, Object param) {
    	StructField campo = structFields.getFromTop(node.getName());
    	predicado(campo == null, "Campo repetido: " + node.getName(), node);
    	structFields.put(node.getName(), node);
    	return null;
    }
    

    // # --------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    private void error(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void predicado(boolean condition, String errorMessage, AST node) {
        if (!condition)
            error(errorMessage, node.getStart());
    }

    private ErrorManager errorManager;
    private ContextMap<String, VarDefinition> variables = new ContextMap<String, VarDefinition>();
    private Map<String, FunctionDefinition> functions = new HashMap<String, FunctionDefinition>();
    private Map<String, StructDefinition> structs = new HashMap<String, StructDefinition>();
    private ContextMap<String, StructField> structFields = new ContextMap<String, StructField>();
}
