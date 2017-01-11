package edu.femxa.sinespacios;

import java.io.File;

public class MetodoIterativo {
	
	public static void main(String[] args) 
	{
		File fichero = null;
		fichero = new File("C:\\administrator");
		boolean esDir = fichero.isDirectory();
			String [] lista = null;
			lista = fichero.list();
			
		if (esDir)
			{
				for (int i = 0; i < lista.length; i++) 
				{
					System.out.println("La lista de ficheros es "+lista[i]);
				}
			}
				else
					
					{
						fichero = new File("C:\\administrator\\*");
						System.out.println("Los archivos de cada directorio son "+ fichero);
					}
				
				
					
				
		
			}
				
	
}
