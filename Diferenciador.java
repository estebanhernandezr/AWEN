package Lexer;

import java.util.ArrayList;

public class Diferenciador {
	
	ArrayList<String> lista_nuevas;

//---------------------------------------------------------------------------------------------------------------------------------//	
	
	public Diferenciador() {}
	
//---------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> diferenciar(ArrayList<String> lectura) {
		
		ArrayList<String> lista_nuevas = new ArrayList<String>();
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0 ; i < lectura.size() ; i += 1) {
			
			String linea = lectura.get(i);
			
			if(linea.length() > 11) {
			
				lista_nuevas.add(linea);
				
			}else {
				
				lista.add(linea);
				
			}
			
		}
		
		this.lista_nuevas = lista_nuevas;
		return lista;
		
	}
	
//---------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<String> get_lista_nuevas(){
		
		return this.lista_nuevas;
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
}
