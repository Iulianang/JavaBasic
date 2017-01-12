package edu.femxa.ficheros;

import java.io.File;
import java.util.Scanner;

public class CrearFichero {
	
	public static void main(String[] args) {
		
		Scanner scan = null;
		scan = new Scanner(System.in);
		System.out.println("Introduzca el numero del fichero: ");
			String nombre = scan.nextLine();
		
		crear(nombre);
		
	}

	public static boolean crear (String cad)
	{
		boolean creado = false;
		File fichero = null;
		fichero = new File("fichero");
		
		if(!creado)
			{
			//TODO
				boolean crearArchivo = fichero.createNewFile();
				System.out.println("El fichero se ha creado.");
				
			}else
			{
				System.out.println("El fichero no se ha creado.");
			}
		
		return creado;
		
	}
}
