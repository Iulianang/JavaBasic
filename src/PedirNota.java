

import java.util.Scanner;

/**
 * Hacer un programa que pida una nota hasta que sea aprobado >5
 * @author Administrador
 *
 */
public class PedirNota {
	
	
	
	public static int pedirNota ()
	{
		
		int nLeido = 0;
		Scanner scanner = null;
			scanner = new Scanner (System.in);
			nLeido = scanner.nextInt(); 
		return nLeido;
	}
	
   public static void main(String[] args)
   {
	   
	   
	   int notaIntroducida = 0;
	   		System.out.println("Dame nota: ");
	   do{
		   notaIntroducida = pedirNota ();
		   if (notaIntroducida<5)
			   System.out.println("Suspenso");
	   
	   }while (notaIntroducida <5);
	   
	   System.out.println("Aprobado");
}

}
