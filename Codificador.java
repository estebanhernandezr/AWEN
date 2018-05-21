package Lexer;

import java.util.ArrayList;

public class Codificador {

//---------------------------------------------------------------------------------------------------------------------------------//	
	
	public Codificador() {}

//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> codificar(ArrayList<String> lista_de_instrucciones) {
		
		final String arriba = "arriba";
		final String izquierda = "izquierda";
		final String derecha = "derecha";
		final String abajo = "abajo";
		
		ArrayList<String> palabras = new ArrayList<String>();
		
		for(int i = 0 ; i < lista_de_instrucciones.size() ; i++) {
			
			String instruccion = lista_de_instrucciones.get(i);
			
			if(instruccion.equals("goFront")) palabras.add(arriba);
			else if(instruccion.equals("goLeft")) palabras.add(izquierda);
			else if(instruccion.equals("goRight")) palabras.add(derecha);
			else if(instruccion.equals("goBack")) palabras.add(abajo);
			else if(instruccion.equals("goFront ")) palabras.add(arriba);
			else if(instruccion.equals("goLeft ")) palabras.add(izquierda);
			else if(instruccion.equals("goRight ")) palabras.add(derecha);
			else if(instruccion.equals("goBack ")) palabras.add(abajo);
		
		}
	
		return palabras;
		
	}
	
}
