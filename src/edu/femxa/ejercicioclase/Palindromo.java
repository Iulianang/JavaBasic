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
		
		public static boolean esPalindromo (String palabra)
		{
			int inicio = 0;
			int fin = (palabra.length()-1);
			Boolean palindromo = false;
			while((inicio<fin)&&(!palindromo))
			{
				if(palabra.charAt(inicio) == palabra.charAt(fin))
				{
					inicio++;
					fin--;
					
				}else
					palindromo = true;
					
			}
		if(!palindromo)
		{
			System.out.println("La palabra es palindromo");
		}else
			System.out.println("La palabra no es palindromo");
		
		return palindromo;
	}
	

}
