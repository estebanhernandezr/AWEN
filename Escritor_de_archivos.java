package Lexer;

import java.io.FileWriter;
import java.util.ArrayList;

public class Escritor_de_archivos {

//--------------------------------------------------------------------------------------------------------------------------------------------//	
	
	public Escritor_de_archivos() {}

//--------------------------------------------------------------------------------------------------------------------------------------------//	
	
	public void escribir_archivo(ArrayList<String> palabras) {
		
		
		String path = "C:/Users/prestamour/Desktop/Elementos/";
		String archivo = "texto_2.txt";		
		
		String elemento = path + archivo;
		
		String salto = "\r\n";
				
		try {
					
		FileWriter escritor = new FileWriter(elemento);
					
		for(int i = 0 ; i < palabras.size() ; i++) {
						
			escritor.write(palabras.get(i));
			escritor.write(salto);
						
		}
					
		escritor.close();
					
		}catch(Exception error) {
					
			
					
		}
		
	}

	
	
}
