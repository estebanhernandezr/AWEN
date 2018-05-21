package Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import acm.program.*;

public class Lector_de_archivos extends ConsoleProgram {

//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public Lector_de_archivos(){}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> leer(String path, String archivo) {
		
		String elemento = path + archivo;
		
		ArrayList<String> lectura = new ArrayList<String>();
		
		try {
			
			FileReader objeto = new FileReader(elemento);
			
			BufferedReader lector = new BufferedReader(objeto);
			
			String linea = lector.readLine();
			
			while(linea != null) {
				
				lectura.add(linea);
				
				linea = lector.readLine();
				
			}
		
			lector.close();
			
		}catch(Exception error) {
			
			println("No es posible hallar el archivo");
			
		}	
		
		return lectura;
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
}
