package edu.femxa.sinespacios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Introducir una frase:");
		String frase = null;
		String sFrase = null;
		Scanner scan = null;
			scan = new Scanner(System.in);
			frase = scan.nextLine();
		
		sFrase = sinEspacio(frase);
		
		System.out.println("Frase sin espacios:"+ sFrase);
	}
	
	
	public static String sinEspacio (String normal)
	{
		String sEspacio = "";
		char aux = 0;
			for (int i = 0; i < normal.length(); i++) 
			{
				aux = normal.charAt(i);
				
				if(aux != ' ')
				{
					sEspacio = sEspacio + aux;
				}
			}
		
		return sEspacio;
	}

	
}
