

import java.util.Scanner;

public class NumerosPares {
	
	/*public static int pedirNumero () 
	{
		int pedirNumero = 0;
			Scanner scanner = null;
			scanner = new Scanner (System.in); 
			pedirNumero = scanner.nextInt(); 
		
		return pedirNumero;
		
		
	
	}*/
	
	public static void main(String[] args) {
		
			
		/*for (int i=0; i<100; i = i + 2)
		{
			
		System.out.println("Los 50 primeros numeros pares son:" +i);
		
		}*/
		
		int resto = 0;
		int num_veces_imprimo = 0;
			System.out.println("Indicar los números de pares:");
		int numUsuario = 0;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
		numUsuario = scanner.nextInt(); 
		
		
		for( int i = 0; i <=100; i++)//i++ = (i = i + 1)
		{
			resto = i%2;
			
			if ((resto == 0)&&(num_veces_imprimo<numUsuario))
			{
				System.out.println("Numero par " +i);
				num_veces_imprimo = num_veces_imprimo + 1;
			}
	}
}		

	
	
}
