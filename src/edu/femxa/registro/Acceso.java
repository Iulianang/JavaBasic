package edu.femxa.registro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Acceso {

	public static void leerNombre(String nombre) throws IOException {
		
		File fichero = new File ("nombre_usuario");
		FileReader leerFichero = new FileReader(fichero);
		Scanner scan = null;
			scan = new Scanner (System.in);
			System.out.println("Introduzca su nombre de usuario: ");
			nombre = scan.nextLine();
			if (nombre.equals(GestionFicheros.nombre_usuario(nombre)))
				{
					System.out.println("Nombre correcto.");
				}else
				{
					System.out.println("Error pruebe de nuevo.");
				}
		leerFichero.close();
	}
	
	public static void leerContraseņa(String contraseņa) throws IOException {
		
		File fichero = new File ("contraseņa");
		FileReader leerFichero = new FileReader(fichero);
		Scanner scan = null;
			scan = new Scanner (System.in);
			System.out.println("Introduzca su nombre de usuario: ");
			contraseņa = scan.nextLine();
			String contraseņa_cifrada = GestionFicheros.codifica(contraseņa);
				
			if (contraseņa.equals(contraseņa_cifrada))
			{
				System.out.println("Contraseņa correcta.");
			}else
			{
				System.out.println("Error pruebe de nuevo.");
			}
		leerFichero.close();
	
	}
	
}

