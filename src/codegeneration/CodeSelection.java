/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package codegeneration;

import java.io.*;

import ast.*;
import visitor.*;

enum CodeFunction {
	ADDRESS, VALUE
}

public class CodeSelection extends DefaultVisitor {

	public CodeSelection(Writer writer, String sourceFile) {
		this.writer = new PrintWriter(writer);
		this.sourceFile = sourceFile;
	}

	 public Object visit(Program node, Object param) {
	 out("#source \"" + sourceFile + "\"");
	 out("call main");
	 out("halt");
	
	 super.visit(node, param); // Recorrer los hijos
	 return null;
	 }

	// # ----------------------------------------------------------
	// Métodos auxiliares recomendados (opcionales) -------------

	// Imprime una línea en el fichero de salida
	private void out(String instruction) {
		writer.println(instruction);
	}

	private void out(String instruccion, Type tipo) {
		out(instruccion + tipo.getSuffix());
	}

	private void line(AST node) {
		line(node.getEnd());
	}

	private void line(Position pos) {
		if (pos != null)
			out("\n#line " + pos.getLine());
		else
			System.out.println("#line no generado. Se ha pasado una Position null. Falta información en el AST");
	}

	private PrintWriter writer;
	private String sourceFile;
}
