package edu.femxa.simulador;

public class Principal {

	public static void main(String[] args) {
		
		//int numP = 0;
		System.out.println("Introduce el numero: ");
		PedirNumero num_aleatorio = new PedirNumero();
		int numP = num_aleatorio.pedirNumero();
		int x = (int) (100*Math.random()+1);
		int contador = 0;	
		boolean acierto = false;
		int constante = 5;
		
		do 
		{
			if (numP<x)
			{
				System.out.println("El numero indicado es menor, pruebe de nuevo:");
				numP = num_aleatorio.pedirNumero();
			}
				else if (numP>x)
					{
						System.out.println("El numero indicado es mayor, pruebe de nuevo:");
						numP = num_aleatorio.pedirNumero();
					}
					else if (numP == x)
						{
							acierto = true;
							System.out.println("Ha acertado el numero, felicidades");
						}
			
			contador++;
			}while (contador<constante && !acierto); 
			
				if (contador == constante && !acierto)
				{
					System.out.println("Ha gastado todos sus intentos, looser");
				}
				System.out.println("El numero a adivinar era: " + x);		
				
		}
		
		
	
}
