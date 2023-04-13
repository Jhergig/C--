/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import ast.*;
import ast.expressions.ArithmeticExpression;
import ast.expressions.ArrayOp;
import ast.expressions.Cast;
import ast.expressions.CharConstant;
import ast.expressions.Dot;
import ast.expressions.FloatConstant;
import ast.expressions.IntConstant;
import ast.expressions.Variable;
import ast.sentences.Assignment;
import ast.sentences.If;
import ast.sentences.Print;
import ast.sentences.Read;
import ast.sentences.While;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

	public TypeChecking(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// # ----------------------------------------------------------
	// class Assignment { Expression left; Expression right; }
	public Object visit(Assignment node, Object param) {

		super.visit(node, param);
		predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node);
		predicado(node.getLeft().isModificable(), "Se requiere expresión modificable", node.getLeft());
		predicado(esTipoSimple(node.getLeft()), "Se requiere expresión de tipo simple", node);

		return null;
	}
	
	public Object visit(If node, Object param) {
		super.visit(node, param);
		predicado(node.getExpression().getType() instanceof IntType, "La condición debe ser de tipo entero", node);
		return null;
	}
	
	public Object visit(While node, Object param) {
		super.visit(node, param);
		predicado(node.getExpression().getType() instanceof IntType, "La condición debe ser de tipo entero", node);
		return null;
	}
	
	public Object visit(Read node, Object param) {
		super.visit(node, param);
		predicado(node.getExpression().isModificable(), "Se requiere expresión modificable", node);
		predicado(esTipoSimple(node.getExpression()), "Se requiere expresión de tipo simple", node);
		return null;
	}
	
	public Object visit(Print node, Object param) {
		super.visit(node, param);
		predicado(esTipoSimple(node.getExpression()), "Se requiere expresión de tipo simple", node);
		return null;
	}

	// class ArithmeticExpression { Expression left; String operator; Expression
	// right; }
	public Object visit(ArithmeticExpression node, Object param) {

		super.visit(node, param);
		predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node);
		if ("&&||%".contains(node.getOperator()))  
			predicado(node.getLeft().getType() instanceof IntType && node.getRight().getType() instanceof IntType, "Los operandos deben ser enteros", node);
		predicado(esNumerico(node.getLeft()) && esNumerico(node.getRight()), "Los operandos deben ser de tipo int o float", node);
		node.setType(node.getLeft().getType());
		node.setModificable(false);

		return null;
	}

	// class Variable { String name; }
	public Object visit(Variable node, Object param) {
		node.setType(node.getDefinicion().getType());
		node.setModificable(true);
		return null;
	}

	// class IntConstant { String valor; }
	public Object visit(IntConstant node, Object param) {
		node.setType(new IntType());
		node.setModificable(false);
		return null;
	}

	// class RealConstant { String valor; }
	public Object visit(FloatConstant node, Object param) {
		node.setType(new FloatType());
		node.setModificable(false);
		return null;
	}

	public Object visit(CharConstant node, Object param) {
		node.setType(new CharType());
		node.setModificable(false);
		return null;
	}

	public Object visit(ArrayOp node, Object param) {
		super.visit(node, param);
		predicado(node.getPos().getType() instanceof IntType, "El índice debe ser de tipo Int", node);
		predicado(node.getName().getType() instanceof ArrayType, "La expresión debe ser de tipo Array", node);
		node.setType(node.getName().getType());
		return null;
	}

	public Object visit(Cast node, Object param) {
		super.visit(node, param);
		predicado(esTipoSimple(node.getTypee()), "El tipo del cast debe ser simple", node);
		predicado(esTipoSimple(node.getExpression()), "El tipo de la expresión debe ser simple", node);
		predicado(node.getExpression().getType().getClass() != node.getTypee().getClass(),
				"No se puede castear al mismo tipo", node);
		node.setType(node.getTypee());
		node.setModificable(node.getExpression().isModificable());
		return null;
	}

	public Object visit(Dot node, Object param) {
		super.visit(node, param);
		predicado(node.getExpression().getType() instanceof StructType, "Se requiere tipo struct", node);
		if (node.getExpression().getType() instanceof StructType) {
			predicado(((StructType)((Variable) node.getExpression()).getDefinicion().getType()).getDefinicion().hasField(node.getName()), "Campo no definido", node);
			node.setType(((StructType)((Variable) node.getExpression()).getDefinicion().getType()).getDefinicion().fieldType(node.getName()));
		}
		return null;
	}

	// --------------------------------------------------------
	// Funciones auxiliares

	private boolean mismoTipo(Expression a, Expression b) {
		return (a.getType().getClass() == b.getType().getClass());
	}

	private boolean esTipoSimple(Expression exp) {
		return esTipoSimple(exp.getType());
	}

	private boolean esTipoSimple(Type type) {
		return (type instanceof IntType || type instanceof FloatType || type instanceof CharType);
	}
	
	private boolean esNumerico(Expression exp) {
		return esTipoSimple(exp.getType());
	}

	private boolean esNumerico(Type type) {
		return (type instanceof IntType || type instanceof FloatType);
	}
	// Métodos auxiliares recomendados (opcionales) -------------

	/**
	 * predicado. Método auxiliar para implementar los predicados. Borrar si no se
	 * quiere usar.
	 *
	 * Ejemplos de uso (suponiendo que existe un método "esPrimitivo(expr)"):
	 *
	 * 1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
	 * primitivo", expr.getStart()); 2. predicado(esPrimitivo(expr.tipo), "La
	 * expresión debe ser de un tipo primitivo", expr); // Se asume getStart() 3.
	 * predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
	 * primitivo");
	 *
	 * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero
	 * fuente donde estaba el nodo (y así poder dar información más detallada de la
	 * posición del error). Si se usa VGen, dicho método habrá sido generado en
	 * todos los nodos del AST. No es obligatorio llamar a getStart() (ejemplo 2),
	 * ya que si se pasa el nodo, se usará por defecto dicha posición. Si no se
	 * quiere imprimir la posición del fichero, se puede omitir el tercer argumento
	 * (ejemplo 3).
	 *
	 * @param condition     Debe cumplirse para que no se produzca un error
	 * @param errorMessage  Se imprime si no se cumple la condición
	 * @param posicionError Fila y columna del fichero donde se ha producido el
	 *                      error.
	 */

	private void predicado(boolean condition, String errorMessage, AST node) {
		predicado(condition, errorMessage, node.getStart());
	}

	private void predicado(boolean condition, String errorMessage, Position position) {
		if (!condition)
			errorManager.notify("Type Checking", errorMessage, position);
	}

	private void predicado(boolean condition, String errorMessage) {
		predicado(condition, errorMessage, (Position) null);
	}

	private ErrorManager errorManager;
}
