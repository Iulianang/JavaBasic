package edu.femxa.sinespacios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Introducir una frase:");
		String frase = null;
		String sFrase = null;
		Scanner scan = null;
			scan = new Scanner(System.in);
			frase = scan.nextLine();
		
		sFrase = sinEspacio(frase);
		
		System.out.println("Frase sin espacios:"+ sFrase);
		
		File fichero = new File ("ficheros\\archivo1");
		FileReader leerFichero = new FileReader(fichero);
	}
	
	/**
	 * metodo que recorre un string caracter por caracter
	 * @param normal 
	 * @return un string donde los espacios entre palabras ha sido omitido
	 */
	
	public static String sinEspacio (String normal)
	{
		String sEspacio = "";
		char aux = 0;
			for (int i = 0; i < normal.length(); i++) 
			{
				aux = normal.charAt(i);
				
				if(aux != ' ')
				{
					sEspacio = sEspacio + aux;
				}
			}
		
		return sEspacio;
	}

	
}
