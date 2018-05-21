package Lexer;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Escritor_de_funciones {
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public Escritor_de_funciones() {}

//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public void escribir_funciones(ArrayList<ArrayList<String>> funciones,ArrayList<String> nombres) {
		
		String salto = "\r\n";
		
		for(int i = 0 ; i < funciones.size() && i < nombres.size() ; i += 1) {
			
			String path = "C:/Users/prestamour/Desktop/Elementos/";
			
			String nombre = nombres.get(i);
			ArrayList<String> instrucciones = funciones.get(i);
			
			String elemento = path + nombre + ".txt";
			
			try {
				
				File archivo = new File(elemento);
				
			}catch(Exception error) {
				
				
				
			}
			
			try {
				
				FileWriter escritor = new FileWriter(elemento);
				
				for(int u = 0 ; u < instrucciones.size() ; u++) {
					
					if(!instrucciones.get(u).isEmpty()) {
						
						escritor.write(instrucciones.get(u));
						escritor.write(salto);
					}else {}
					
				}
				
				escritor.close();
				
				
			}catch(Exception error) {
				
					
			}
			
		}
		
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
}
