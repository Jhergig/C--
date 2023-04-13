grammar Grammar
	;

import Lexicon
	;

@parser::header {
    import ast.*;
}

start returns[Program ast]
	: l+=def* EOF { $ast = new Program($l); }
	;
	
def  returns[Definition ast]
	: variable 	{ $ast = $variable.ast; }
	| struct	{ $ast = $struct.ast; }
	| function	{ $ast = $function.ast; }
	;

type returns[Type ast]
	: 'float'					{ $ast = new FloatType(); }
	| 'int'						{ $ast = new IntType(); }
	| 'char'					{ $ast = new CharType(); }
	| IDENT						{ $ast = new StructType($IDENT); }
	| '[' INT_CONSTANT ']' type	{ $ast = new ArrayType($type.ast, $INT_CONSTANT); }
	;
	
variable returns[VarDefinition ast]
	: 'var' IDENT ':' type ';' { $ast = new VarDefinition($type.ast, $IDENT); }
	;

struct returns[StructDefinition ast]
	: 'struct' name=IDENT '{' fields+=field* '}' ';' { $ast = new StructDefinition($name, $fields); }
	;

field returns[StructField ast]
	:(IDENT ':' type ';') { $ast = new StructField($type.ast, $IDENT); }
	;

function returns[FunctionDefinition ast]
	: IDENT '(' params ')' (':' type)? '{' v+=variable* s+=sentence* '}' { $ast = new FunctionDefinition($IDENT, $params.list, $type.ctx != null ? $type.ast : null, $v, $s); } 
	;

params returns[List<Parameter> list = new ArrayList<Parameter>()]
	: ((param { $list.add($param.ast); } ',')* p=param { $list.add($p.ast); })? 
	;

param returns[Parameter ast]
	: IDENT ':' type { $ast = new Parameter($type.ast, $IDENT); }
	;

sentence returns[Sentence ast]
	: 'read' expr ';' 																	{ $ast = new Read($expr.ast); }
	| 'print' expr? ';' 																{ $ast = new Print($expr.ast); }
	| 'printsp' expr? ';' 																{ $ast = new Printsp($expr.ast); }
	| 'println' expr? ';' 																{ $ast = new Println($expr.ast); }
	| l=expr '=' r=expr ';' 															{ $ast = new Assignment($l.ast, $r.ast); }
	| 'if' '(' expr ')' '{' then+=sentence* '}' ('else' '{' elsee+=sentence* '}')?		{ $ast = new If($expr.ast, $then, $elsee); }
	| 'while' '(' expr ')' '{' doo+=sentence* '}'										{ $ast = new While($expr.ast, $doo); }
	| 'return' expr? ';'																{ $ast = new Return($expr.ctx != null ? $expr.ast : null); }
	| name=IDENT '(' paramss ')' ';'													{ $ast = new FunctionCallSen($name, $paramss.list); }
	;

expr returns[Expression ast]
	:name=expr '[' position=expr ']'						{ $ast = new ArrayOp($name.ast, $position.ast);} 
	| l=expr op=('*' | '/') r=expr							{ $ast = new ArithmeticExpression($l.ast, $op, $r.ast); }
	| l=expr op=('+' | '-') r=expr							{ $ast = new ArithmeticExpression($l.ast, $op, $r.ast); }
	| l=expr op=('==' | '!='| '<'| '>'| '<='| '>=')r=expr	{ $ast = new ArithmeticExpression($l.ast, $op, $r.ast); }
	| l=expr op=('&&'| '||') r=expr							{ $ast = new ArithmeticExpression($l.ast, $op, $r.ast); }
	| '(' expr ')'											{ $ast = $expr.ast; }
	| IDENT													{ $ast = new Variable($IDENT); }
	| INT_CONSTANT											{ $ast = new IntConstant($INT_CONSTANT); }
	| FLOAT_CONSTANT										{ $ast = new FloatConstant($FLOAT_CONSTANT); }
	| CHAR_CONSTANT											{ $ast = new CharConstant($CHAR_CONSTANT); }
	| '<' type '>' '(' expr ')' 							{ $ast = new Cast($type.ast, $expr.ast);}
	| IDENT '(' paramss ')'									{ $ast = new FunctionCallExp($IDENT, $paramss.list);}
	| e=expr '.' IDENT  									{ $ast = new Dot($e.ast, $IDENT); }
 
	;

paramss returns[List<Expression> list = new ArrayList<Expression>()]
	: ((expr ',' {$list.add($expr.ast);})* e=expr {$list.add($e.ast);})?
	;
