package edu.femxa.simulador;

import java.util.Scanner;

public class PedirNumero {
	
	
	public static int pedirNumero ()
	{
		int pedirNumero = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in); 
		pedirNumero = scanner.nextInt();
		
			
		return pedirNumero;
	}
	
	public static void main(String[] args) {
		
		int numP = 0;
		System.out.println("Introduce el numero: ");
		numP = pedirNumero ();
		int x = (int) (100*Math.random()+1);
		int contador = 0;	
		boolean correcto = false;
		
		do 
		{
			if (numP<x)
			{
				System.out.println("El numero indicado es menor, pruebe de nuevo:");
				numP = pedirNumero();
			}
				else if (numP>x)
					{
						System.out.println("El numero indicado es mayor, pruebe de nuevo:");
						numP = pedirNumero();
					}
					else if (numP == x)
						{
							correcto = true;
							System.out.println("Ha acertado el numero, felicidades");
						}
							
			
			
			contador++;
			}while (contador<5 && !correcto); 
			System.out.println(x);
				
		}
		
		
	}
	
	
		
	
		
	


