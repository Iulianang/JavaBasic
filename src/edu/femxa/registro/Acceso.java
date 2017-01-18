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
	
	public static void leerContraseña(String contraseña) throws IOException {
		
		File fichero = new File ("contraseña");
		FileReader leerFichero = new FileReader(fichero);
		Scanner scan = null;
			scan = new Scanner (System.in);
			System.out.println("Introduzca su nombre de usuario: ");
			contraseña = scan.nextLine();
			String contraseña_cifrada = GestionFicheros.codifica(contraseña);
				
			if (contraseña.equals(contraseña_cifrada))
			{
				System.out.println("Contraseña correcta.");
			}else
			{
				System.out.println("Error pruebe de nuevo.");
			}
		leerFichero.close();
	
	}
	
}

