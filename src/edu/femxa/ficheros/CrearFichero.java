package edu.femxa.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CrearFichero {
	
	public static void main(String[] args) {
		
		Scanner scan = null;
		scan = new Scanner(System.in);
		System.out.println("Introduzca el numero del fichero a crear: ");
			String nombre = scan.nextLine();
		
		crear(nombre);
		System.out.println("Introduzca el nombre del fichero a borrar: ");
		String nombre2 = scan.nextLine();
		borrar(nombre2);
		
	}

	public static void crear (String cad)
	{
		File fichero = null;
		fichero = new File(cad);
		
		try {
			if(fichero.createNewFile())
				{
					System.out.println("El fichero se ha creado.");
					
				}else
				{
					System.out.println("El fichero no se ha creado.");
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void borrar (String cad)
	{
		File fichero = null;
		fichero = new File(cad);
		if (fichero.isFile()){
			
			fichero.delete();
			System.out.println("El fichero se ha borrado.");
		}else{
			System.out.println("El fichero indicado no se puede borrar");
		}
		
	}
}
