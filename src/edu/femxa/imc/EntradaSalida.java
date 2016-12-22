package edu.femxa.imc;

import java.util.Scanner;

public class EntradaSalida {

		public static double obtenerPeso () 
		{
			double peso = 0;
			Scanner scanner = null;
			
				System.out.println("Introduce peso en (kg): ");
				scanner = new Scanner(System.in); //scaner despues de syso para mejor lectura de memoria
				peso = scanner.nextDouble();
				
			return peso;
		}
		
		public static double obtenerAltura ()
		{
			double altura = 0;
			Scanner scanner = null;
				
				System.out.println("Introduce altura en (m): ");
				scanner = new Scanner(System.in); 
				altura = scanner.nextDouble();
				
			return altura;
		}
		
		public static void mostrarIMC (double imc)
		{
			System.out.println("Su IMC es : " + imc);
		}
		
		
		
}
