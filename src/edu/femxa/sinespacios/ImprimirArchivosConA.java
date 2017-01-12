package edu.femxa.sinespacios;

import java.io.File;

public class ImprimirArchivosConA {
	
	public static void main(String[] args) 
	{
		File fichero = null;
		fichero = new File("C:\\administrator");
		contieneA(fichero);
		
	}
	public static void contieneA (File ruta)
	{
		File lista [] = ruta.listFiles();
		String nombre = null;	

		
		for (int i = 0; i < lista.length; i++) 
			{
			
				nombre = lista[i].getName();
				
				if(nombre.indexOf("A") !=-1 || nombre.indexOf("a")!=-1)
				{
					System.out.println("La lista con letra a es: "+ nombre);
				}
			}
	}
			
}
