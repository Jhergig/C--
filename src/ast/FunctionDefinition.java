/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import parser.GrammarParser.SentenceContext;
import parser.GrammarParser.VariableContext;
import visitor.*;

//	functionDefinition:definition -> name:String  parameter:parameter*  type:type  vardefinition:varDefinition*  sentence:sentence*

public class FunctionDefinition extends AbstractDefinition {

	public FunctionDefinition(String name, List<Parameter> parameter, Type type, List<VarDefinition> vardefinition, List<Sentence> sentence) {
		this.name = name;
		this.parameter = parameter;
		this.type = type;
		this.vardefinition = vardefinition;
		this.sentence = sentence;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parameter, type, vardefinition, sentence);
	}

	public FunctionDefinition(Object name, Object parameter, Object type, Object vardefinition, Object sentence) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.parameter = this.<Parameter>getAstFromContexts(parameter);
		this.type = (Type) getAST(type);
		this.vardefinition = this.<VarDefinition>getAstFromContexts(vardefinition);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, parameter, type, vardefinition, sentence);
	}

	public FunctionDefinition(Object name, Object parameter, Object vardefinition, Object sentence) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.parameter = this.<Parameter>getAstFromContexts(parameter);
		this.type = null;
		this.vardefinition = this.<VarDefinition>getAstFromContexts(vardefinition);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Parameter> getParameter() {
		return parameter;
	}
	public void setParameter(List<Parameter> parameter) {
		this.parameter = parameter;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public List<VarDefinition> getVardefinition() {
		return vardefinition;
	}
	public void setVardefinition(List<VarDefinition> vardefinition) {
		this.vardefinition = vardefinition;
	}

	public List<Sentence> getSentence() {
		return sentence;
	}
	public void setSentence(List<Sentence> sentence) {
		this.sentence = sentence;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<Parameter> parameter;
	private Type type;
	private List<VarDefinition> vardefinition;
	private List<Sentence> sentence;

	public String toString() {
       return "{name:" + getName() + ", parameter:" + getParameter() + ", type:" + getType() + ", vardefinition:" + getVardefinition() + ", sentence:" + getSentence() + "}";
   }
}
