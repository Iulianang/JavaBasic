package edu.femxa.ficheros;

import java.util.Scanner;

public class AdivinarDNI {

	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void main(String[] args) {
		
		Scanner scan = null;
		scan = new Scanner (System.in);
		System.out.println("Introduce los numeros del DNI para adivinar la letra: ");
			int dni = scan.nextInt();
			int calculo = (dni%23);
			char letra = caracteresDNI.charAt(calculo);
		System.out.println(letra);
		
	}
}
		
		
	

		
	
	
	
