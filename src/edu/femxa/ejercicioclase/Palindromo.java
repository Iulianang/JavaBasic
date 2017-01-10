package edu.femxa.ejercicioclase;

import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {
		
		
		String palabra = null;
			Scanner scan = null;
			scan = new Scanner (System.in);
		
			System.out.println("Introduce una palabra: ");
		
			palabra = scan.nextLine();
			
			esPalindromo(palabra);
		
	}
		/*
		 * metodo para comparar palabras e indicar si son palindromo mediante un while
		 * donde se recorre la palabra y se compara con un if cada letra
		 */
		public static boolean esPalindromo (String cadena)
		{
			int inicio = 0;
			int fin = (cadena.length()-1);
			Boolean palindromo = false;
			
			while((inicio<fin)&&(!palindromo))
			{
				if(cadena.charAt(inicio) == cadena.charAt(fin))
				{
					inicio++;
					fin--;
					
				}else palindromo = true;
					
			}
		if(!palindromo)
		{
			System.out.println("La palabra es palindromo");
		}else
			System.out.println("La palabra no es palindromo");
		
		return palindromo;
	}
	

}
