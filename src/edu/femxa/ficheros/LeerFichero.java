package edu.femxa.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		File fichero = new File ("ficheros\\archivo1");
		FileReader leerFichero = new FileReader(fichero);
		int a = 0; //casting de un int a una letra
		int sumaCaracteres =0;

		while(-1!= (a = leerFichero.read()))
		{	
			char c = (char) a;
				System.out.print(c);
			sumaCaracteres = sumaCaracteres+a;
		}
			System.out.print("\nLa suma de los caracteres es: "+sumaCaracteres);
			
		leerFichero.close();
	}
}
