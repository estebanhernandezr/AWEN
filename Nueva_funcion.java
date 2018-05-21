package Lexer;

import java.util.ArrayList;

public class Nueva_funcion {

	ArrayList<String>nombres;
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public Nueva_funcion() {}
	
//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList<ArrayList<String>> crear_funciones(ArrayList<String> diferente) {
		
		String newfuntion = "newFunction ";
		
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<ArrayList<String>> funciones = new ArrayList<ArrayList<String>>();
				
		for(int i = 0; i < diferente.size() ; i++) {
		
			ArrayList<String> instrucciones_internas = new ArrayList<String>();
			
			String linea = diferente.get(i);
					
			String palabraReservada;
			palabraReservada = "";
					
			for(int u = 0 ; u < newfuntion.length() ; u++) {
						
				palabraReservada += linea.charAt(u);
						
			}
					
			if(palabraReservada.equals(newfuntion)) {
						
				String nombre = "";
						
				for(int k = newfuntion.length() ; k < linea.length() ; k++) {
							
					char letra;
					letra = linea.charAt(k);
							
					if(letra != ':') {
								
						nombre += letra;
								
					}else {
						
						nombres.add(nombre);
						break;
								
					}
				}
						
				String nombre_completo = newfuntion + nombre;
						
				String interno = "";
						
				for(int l = nombre_completo.length() ; l < linea.length() ; l++) {
							
					char letrica = linea.charAt(l);	
							
					if(letrica != ':' && letrica != ',') {
									
						interno += letrica;
									
					} else {
									
						instrucciones_internas.add(interno);
						interno = "";
									
					}
				}			
			}
			
			funciones.add(instrucciones_internas);
			
		}
		
		this.nombres = nombres;
		return funciones;
		
	}

//--------------------------------------------------------------------------------------------------------------------------------//	
	
	public ArrayList get_nombres() {
		
		return this.nombres;
		
	}
	
}
