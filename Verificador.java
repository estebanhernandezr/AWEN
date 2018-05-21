package Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import acm.program.*;

public class Verificador extends ConsoleProgram {
	
//---------------------------------------------------------------------------------------------------------------------------------//	
	
	public Verificador() {}

//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> verificar(ArrayList<String> instrucciones) {
		
		ArrayList<String> lista_de_instrucciones = new ArrayList<String>();
		
		String goFront,goBack,goLeft,goRight;
		
		goFront = "goFront ";
		goBack = "goBack ";
		goLeft = "goLeft ";
		goRight = "goRight ";
		
		for(int i = 0 ; i < instrucciones.size() ; i += 1) {
			
			String instruccion = instrucciones.get(i);
		
			if(instruccion.equals(goFront) || instruccion.equals(goBack) || instruccion.equals(goLeft) || instruccion.equals(goRight)) {
				
				lista_de_instrucciones.add(instruccion);
				
			}else {
				
				String path = "C:/Users/prestamour/Desktop/Elementos/";
				
				String instruccion_1 = "";
				
				for(int n = 0 ; n < instruccion.length() - 1 ; n++) {
					
					instruccion_1 += instruccion.charAt(n);
					
				}		
						
				String archivo = instruccion_1 + ".txt";
				
				String elemento = path + archivo;
				
				try {
					
					FileReader objeto = new FileReader(elemento);
					
					BufferedReader lector = new BufferedReader(objeto);
					
					String linea = lector.readLine();
						
					while(linea != null) {	
						
						char ultimo = linea.charAt(linea.length() - 1);
						
						int numero = (int)ultimo;
						
						int number = 0;
						
						switch(numero) {
						
						case 49: number = 1; break;
						case 50: number = 2; break;
						case 51: number = 3; break;
						case 52: number = 4; break;
						case 53: number = 5; break;
						case 54: number = 6; break;
						case 55: number = 7; break;
						case 56: number = 8; break;
						case 57: number = 9; break;
						default:
							
						}
						
						String palabra = "";
						
						for(int m = 0 ; m < linea.length() - 2 ; m++) {
							
							palabra += linea.charAt(m);
							
						}
						
						for(int z = 0; z < number ; z += 1) {
						
							lista_de_instrucciones.add(palabra);
						
						}
						
						linea = lector.readLine();
						
					}			
					
				lector.close();
					
			}catch(Exception error) {
					
					
					
			}	
		}	
	}
		
	return lista_de_instrucciones;
		
}
	
	
}
