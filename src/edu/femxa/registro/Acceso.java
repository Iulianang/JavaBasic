package edu.femxa.registro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Acceso {

	public static void leerNombre(String nombre) throws IOException {
		
		File fichero = new File ("nombre_usuario");
		FileReader leerFichero = new FileReader(fichero);
			BufferedReader br = new BufferedReader(leerFichero);
			String linea = br.readLine();
			Scanner scan = null;
			scan = new Scanner (System.in);
			System.out.print("Introduzca su nombre de acceso: ");
			String nombre_acceso = scan.nextLine();
			
			if (linea.equals(nombre_acceso))
				{
					System.out.println("Nombre correcto.");
				}else
				{
					System.out.println("Error pruebe de nuevo.");
				}
		br.close();
		leerFichero.close();
	}
	
	public static void leerContrase�a(String contrase�a) throws IOException {
		
		File fichero = new File ("contrase�a");
		FileReader leerFichero = new FileReader(fichero);
			Scanner scan = null;
			scan = new Scanner (System.in);
			System.out.print("Introduzca su contrase�a: ");
			BufferedReader br = new BufferedReader(leerFichero);
			String linea = br.readLine();
				String contrase�a_acceso = scan.nextLine();
				
				boolean ok = false;
				int contador = 0;
				while(!ok && contador !=2)
				{
					String contrase�a_cifrada = GestionFicheros.codifica(contrase�a_acceso);
					if(linea.equals(contrase�a_cifrada))
					{
						System.out.println("Contrase�a correcta.");
						ok = true;
					}else
					{
						System.out.println("Error pruebe de nuevo.");
						contrase�a_acceso = scan.nextLine();
						contador++;
					}
				
				}
				
		br.close();
		leerFichero.close();
	
	}
	
}

