package edu.femxa.sinespacios;

import java.util.Scanner;

public class Main {

	public Main() {
		String frase = null;
		String sFrase = null;
		Scanner scan = null;
			scan = new Scanner(System.in);
			frase = scan.next();
			
		sFrase = sinEspacio(frase);
		
		System.out.println("Frase originar: " + frase);
		System.out.println("Frase sin espacios: "+ sFrase);
	}
	
	
	public String sinEspacio (String normal)
	{
		String sEspacio = null;
		char aux = 0;
			for (int i = 0; i < normal.length(); i++) 
			{
				aux = normal.charAt(i);
				
				if(aux != ' ')
					
					sEspacio= sEspacio + aux;
					
			}
		
		return sEspacio;
	}

	
}
