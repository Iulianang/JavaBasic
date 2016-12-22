package edu.femxa.simulador;

import java.util.Scanner;

public class PedirNumero {
	//TODO
	
	public static int pedirNumero ()
	{
		int pedirNumero = 0;
		Scanner scanner = null;
		
			System.out.println("Introduce el numero: ");
			scanner = new Scanner(System.in); 
			pedirNumero = scanner.nextInt();
			int x = (int) (100*Math.random()+1);
			int contador = 0;	
			
			while (contador<5)
			{
				if (pedirNumero<x)
				{
					System.out.println("El numero indicado es menor, puebe de nuevo:");
				}
					else if (pedirNumero>x)
						{
							System.out.println("El numero indicado es mayor, pruebe de nuevo:");
						}
						else if (pedirNumero == x)
							{
							System.out.println("Ha acertado el numero, felicidades");
							}
							else 
							{
								System.out.println("Ha agotado sus intentos, manco");
							}
			}
		return pedirNumero;
	}
	
	public static void main(String[] args) {
		
			
		
	}
	
	
		
	
		
	

}
