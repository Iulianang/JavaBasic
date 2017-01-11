package edu.femxa.ficheros;

import java.io.File;

public class MainFicheros {

	public static void main(String[] args) {
		File fichero = null;
		fichero = new File("ficheros");
		boolean existe = fichero.exists();
		
		
		if (existe)
		{
			System.out.println("El fichero existe");
		}else
		{
			System.out.println("El fichero indicado no esta creado");
		}
		
		String [] lista = null;
		lista = fichero.list();


		for (int i = 0; i < lista.length; i++) {
			
			System.out.println("La lista de ficheros es "+lista[i]);
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Los ficheros ocultos son ");
			
		}
		
	}
	
}
