package edu.femxa.simulador;

public class Principal {

	public static void main(String[] args) {
		
		int numP = 0;
		System.out.println("Introduce el numero: ");
		numP = PedirNumero.pedirNumero();
		int x = (int) (100*Math.random()+1);
		int contador = 0;	
		boolean correcto = false;
		
		do 
		{
			if (numP<x)
			{
				System.out.println("El numero indicado es menor, pruebe de nuevo:");
				numP = PedirNumero.pedirNumero();
			}
				else if (numP>x)
					{
						System.out.println("El numero indicado es mayor, pruebe de nuevo:");
						numP = PedirNumero.pedirNumero();
					}
					else if (numP == x)
						{
							correcto = true;
							System.out.println("Ha acertado el numero, felicidades");
						}
			
			contador++;
			}while (contador<5 && !correcto); 
			
				if (contador == 5 && !correcto)
				{
					System.out.println("Ha gastado todos sus intentos, looser");
				}
				System.out.println("El numero a adivinar era: " + x);		
				
		}
		
		
	
}
