package edu.femxa.registro;

import java.util.Scanner;

import edu.femxa.ejercicio.Persona;

public class Registro {

	
	public static String rNombre (String nombre)
	{
		System.out.println("Introduce tu nombre de usuario: ");
		Scanner scan = null;
		scan = new Scanner (System.in);
		nombre = scan.nextLine();
		
		
		return nombre;
	}
	
	public static String rContrase�a (String contrase�a)
	{
		System.out.println("Introduce tu contrase�a: ");
		Scanner scan = null;
		scan = new Scanner (System.in);
		contrase�a = scan.nextLine();
		
		
		return contrase�a;
	}
}
