package Lexer;

import java.util.ArrayList;
import acm.program.*;

public class Ejecucion extends ConsoleProgram {

	public void run() {
	
		String path;
		String texto_1,texto_2;
		
		path = "C:/Users/prestamour/Desktop/Elementos/";
		texto_1 = "texto_1.txt";
		texto_2 = "texto_2.txt";
		
		Lector_de_archivos lector = new Lector_de_archivos();
		ArrayList<String> lectura = lector.leer(path, texto_1);
		
		Diferenciador diferenciador = new Diferenciador();
		ArrayList<String> indiferente = diferenciador.diferenciar(lectura);
		ArrayList<String> diferente = diferenciador.get_lista_nuevas();
		
		Interprete interprete = new Interprete();
		ArrayList<String> instrucciones = interprete.interpretar(indiferente);
		
		Nueva_funcion nueva_funcion = new Nueva_funcion();
		ArrayList<ArrayList<String>> funciones = nueva_funcion.crear_funciones(diferente);
		ArrayList<String> nombres = nueva_funcion.get_nombres();
		
		Escritor_de_funciones escritor_de_funciones = new Escritor_de_funciones();
		escritor_de_funciones.escribir_funciones(funciones, nombres);
		
		Verificador verificador = new Verificador();
		ArrayList<String> lista_de_instrucciones = verificador.verificar(instrucciones);
		
		Codificador codificador = new Codificador();
		ArrayList<String> palabras = codificador.codificar(lista_de_instrucciones);
		
		Escritor_de_archivos escritor_de_archivos = new Escritor_de_archivos();
		escritor_de_archivos.escribir_archivo(palabras);
		
		for(int i = 0 ; i < palabras.size() ; i++) {
			
			println(palabras.get(i));
			
		}
		
	}
	
}
