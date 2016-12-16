

import java.util.Scanner;

public class Bucle {

	
	
	
		public static int pedirNumero () 
		{
			int pedirNumero = 0;
				Scanner scanner = null;
				scanner = new Scanner (System.in); 
				pedirNumero = scanner.nextInt(); //metodo de la clase escaner que lee un numero por teclado
			
			return pedirNumero;
			
			
		
		}

		public static void main (String[] args) 
		{
			int numeroLeido = 0;
			int numMayor = 0;
			
			for (int i = 1; i <= 10 ;i = i + 1) //(inicializacion; condicion de terminacion; interacion/repeticion)
			{
				System.out.println("El numero leido es:" +numeroLeido); //concatenacion
				numeroLeido = pedirNumero();
			
			if 		(numeroLeido > numMayor)
					numMayor = numeroLeido;
		
			
			System.out.println("El mayor es" +numMayor);
			}
			System.out.println("Ha pedido los 10 números.");
			
		
			
		}
	}