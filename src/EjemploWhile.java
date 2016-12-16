

import java.util.Scanner;

public class EjemploWhile {
	
	public static int pedirNumero ()
	{
		
		int nLeido = 0;
		Scanner scanner = null;
			scanner = new Scanner (System.in);//Leer entrada estandard del teclado "System.In"
			nLeido = scanner.nextInt(); //instruccion nextInt, return de un nº entero
		return nLeido;
	}
	
	
	
	public static void main(String[] args)
	{
		
		int n_pares_quiere = 0; //numeros solicitados por teclado
		int n_pares_aparecidos = 0; //cuenta los numeros de pares
		int contador = 0; //para ir contando los numeros hasta donde se indique
		
		//Pedir numero al usuario
		System.out.println("Indicar los numeros pares que necesita:");
		
		n_pares_quiere = pedirNumero ();
		//fin de pedirNumero
		
		//Imprimir pares solicitados de 0 a n
		
		while (n_pares_aparecidos<n_pares_quiere)
		{
			if (contador%2 == 0)
			{
				System.out.println(contador);	
				n_pares_aparecidos++;
			}
			contador ++;//es igual a contador = contador + 1
		
		}
		System.out.println("Han aparecido " +n_pares_aparecidos);
	}
	
}
