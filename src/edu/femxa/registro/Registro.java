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
	
	public static String rContraseņa (String contraseņa)
	{
		System.out.println("Introduce tu contraseņa: ");
		Scanner scan = null;
		scan = new Scanner (System.in);
		contraseņa = scan.nextLine();
		
		
		return contraseņa;
	}
}
