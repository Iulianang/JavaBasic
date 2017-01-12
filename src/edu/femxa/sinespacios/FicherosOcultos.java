package edu.femxa.sinespacios;

import java.io.File;

public class FicherosOcultos {

	public static void main(String[] args) {
		
		File fichero = null;
		fichero = new File("ficheros");
			File lista[] = fichero.listFiles();
			
	        for (int i = 0; i < lista.length; i++) 
	        {
	      	  if(lista[i].isHidden())
	      	  {
	      		  System.out.println(lista[i].getAbsolutePath());
	      	  }else
	      	  {
	      		  System.out.println("No encontrado");
	      	  }
	        }
		
	}		
}