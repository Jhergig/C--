/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Program { List<Definition> definitions; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getDefinitions(), param);
		return null;
	}

	//	class VarDefinition { Type type;  String name; }
	public Object visit(VarDefinition node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class StructDefinition { String name;  List<StructField> structfield; }
	public Object visit(StructDefinition node, Object param) {
		visitChildren(node.getStructfield(), param);
		return null;
	}

	//	class FunctionDefinition { String name;  List<Parameter> parameter;  Type type;  List<VarDefinition> vardefinition;  List<Sentence> sentence; }
	public Object visit(FunctionDefinition node, Object param) {
		visitChildren(node.getParameter(), param);
		if (node.getType() != null)
			node.getType().accept(this, param);
		visitChildren(node.getVardefinition(), param);
		visitChildren(node.getSentence(), param);
		return null;
	}

	//	class StructField { Type type;  String name; }
	public Object visit(StructField node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class Parameter { Type type;  String name; }
	public Object visit(Parameter node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class IntType {  }
	public Object visit(IntType node, Object param) {
		return null;
	}

	//	class FloatType {  }
	public Object visit(FloatType node, Object param) {
		return null;
	}

	//	class CharType {  }
	public Object visit(CharType node, Object param) {
		return null;
	}

	//	class StructType { String name; }
	public Object visit(StructType node, Object param) {
		return null;
	}

	//	class ArrayType { Type type;  int size; }
	public Object visit(ArrayType node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class Print { Expression expression; }
	public Object visit(Print node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Printsp { Expression expression; }
	public Object visit(Printsp node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Println { Expression expression; }
	public Object visit(Println node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Read { Expression expression; }
	public Object visit(Read node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class Assignment { Expression left;  Expression right; }
	public Object visit(Assignment node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class If { Expression expression;  List<Sentence> truee;  List<Sentence> falsee; }
	public Object visit(If node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		visitChildren(node.getTruee(), param);
		visitChildren(node.getFalsee(), param);
		return null;
	}

	//	class While { Expression expression;  List<Sentence> doo; }
	public Object visit(While node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		visitChildren(node.getDoo(), param);
		return null;
	}

	//	class Return { Expression expression; }
	public Object visit(Return node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class FunctionCallSen { String name;  List<Expression> parameters; }
	public Object visit(FunctionCallSen node, Object param) {
		visitChildren(node.getParameters(), param);
		return null;
	}

	//	class ArithmeticExpression { Expression left;  String operator;  Expression right; }
	public Object visit(ArithmeticExpression node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Variable { String name; }
	public Object visit(Variable node, Object param) {
		return null;
	}

	//	class IntConstant { String value; }
	public Object visit(IntConstant node, Object param) {
		return null;
	}

	//	class FloatConstant { String value; }
	public Object visit(FloatConstant node, Object param) {
		return null;
	}

	//	class CharConstant { String value; }
	public Object visit(CharConstant node, Object param) {
		return null;
	}

	//	class Cast { Type type;  Expression expression; }
	public Object visit(Cast node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class FunctionCallExp { String name;  List<Expression> parameters; }
	public Object visit(FunctionCallExp node, Object param) {
		visitChildren(node.getParameters(), param);
		return null;
	}

	//	class Dot { Expression expression;  String name; }
	public Object visit(Dot node, Object param) {
		if (node.getExpression() != null)
			node.getExpression().accept(this, param);
		return null;
	}

	//	class ArrayOp { Expression name;  Expression pos; }
	public Object visit(ArrayOp node, Object param) {
		if (node.getName() != null)
			node.getName().accept(this, param);
		if (node.getPos() != null)
			node.getPos().accept(this, param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
            	if (child != null)
                child.accept(this, param);
    }
}
