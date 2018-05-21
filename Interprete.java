package Lexer;

import java.util.ArrayList;

public class Interprete {
	
//---------------------------------------------------------------------------------------------------------------------------------//
	
	public Interprete() {}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> interpretar(ArrayList<String> indiferente) {
		
		ArrayList<String> instrucciones = new ArrayList<String>();
		
		for(int i = 0 ; i < indiferente.size() ; i+=1) {
		
			String instruccion = "";
		
			for(int o = 0 ; o < indiferente.get(i).length() - 3 ; o++) {
			
				char letrica = indiferente.get(i).charAt(o);
			
				instruccion += letrica;					
			
			}
			
			
			char ultimo = indiferente.get(i).charAt(indiferente.get(i).length() - 2);
				
			int numero = (int)ultimo;
				
			if(numero == 49 || numero == 50  || numero == 51  || numero == 52  || numero == 53  || numero == 54  || numero == 55  || numero == 56  || numero == 57) {
					
				String palabra = "";
					
				for(int u = 0 ; u < indiferente.get(i).length() - 2 ; u++) {
						
					char letra = indiferente.get(i).charAt(u);
						
					palabra += letra;
						
				}
					
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
					
				for(int x = 0 ; x < number ; x++) {
						
				instrucciones.add(palabra);
					
				}
			}		
		}
		
		return instrucciones;
		
	}
}
