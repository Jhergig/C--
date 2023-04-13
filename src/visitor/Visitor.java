/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;
import ast.expressions.ArithmeticExpression;
import ast.expressions.ArrayOp;
import ast.expressions.Cast;
import ast.expressions.CharConstant;
import ast.expressions.Dot;
import ast.expressions.FloatConstant;
import ast.expressions.FunctionCallExp;
import ast.expressions.IntConstant;
import ast.expressions.Variable;
import ast.sentences.Assignment;
import ast.sentences.FunctionCallSen;
import ast.sentences.If;
import ast.sentences.Print;
import ast.sentences.Println;
import ast.sentences.Printsp;
import ast.sentences.Read;
import ast.sentences.Return;
import ast.sentences.While;

public interface Visitor {
	public Object visit(Program node, Object param);
	public Object visit(VarDefinition node, Object param);
	public Object visit(StructDefinition node, Object param);
	public Object visit(FunctionDefinition node, Object param);
	public Object visit(StructField node, Object param);
	public Object visit(Parameter node, Object param);
	public Object visit(IntType node, Object param);
	public Object visit(FloatType node, Object param);
	public Object visit(CharType node, Object param);
	public Object visit(StructType node, Object param);
	public Object visit(ArrayType node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Printsp node, Object param);
	public Object visit(Println node, Object param);
	public Object visit(Read node, Object param);
	public Object visit(Assignment node, Object param);
	public Object visit(If node, Object param);
	public Object visit(While node, Object param);
	public Object visit(Return node, Object param);
	public Object visit(FunctionCallSen node, Object param);
	public Object visit(ArithmeticExpression node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(IntConstant node, Object param);
	public Object visit(FloatConstant node, Object param);
	public Object visit(CharConstant node, Object param);
	public Object visit(Cast node, Object param);
	public Object visit(FunctionCallExp node, Object param);
	public Object visit(Dot node, Object param);
	public Object visit(ArrayOp node, Object param);
}
