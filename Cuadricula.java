package Entorno;

import acm.program.*;
import acm.graphics.*;

public class Cuadricula extends GraphicsProgram {

	public void run() {
		 LineasHorizontales();
		 LineasVerticales();
		
					
		
		
	}
	
	public void LineasHorizontales() {
		 
		double y = getHeight()/10;
		for(int i = 0 ; i < 10 ; i++) {
			
			GLine linea = new GLine(0,y,getWidth(),y);
			add(linea);
			y += getHeight()/10;
			
		}
	}
	
	public void LineasVerticales() {
		
		double x = getWidth()/10;
		for(int i = 0 ; i < 10 ; i++) {
			
			GLine linea = new GLine(x,0,x,getHeight());
			add(linea);
			x += getWidth()/10;
		
			}
	}
	
	
	
	
	
	
	
	
	
	
	
}
