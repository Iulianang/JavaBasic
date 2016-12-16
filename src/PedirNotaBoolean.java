

import java.util.Scanner;

/**
 * Hacer un programa que pida una nota hasta que sea aprobado > 5
 * @author Administrador
 *
 */
public class PedirNotaBoolean {
	
	
	public static boolean suspenso (int nota)
	{
		boolean bul = false;
		if (nota<5)
		{
			bul = true;
			System.out.println("Suspenso");
		}	else
			{
				bul = false;
			}
		
		return bul;
	}
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
	   /*do{
		   notaIntroducida = pedirNota ();
		   if (suspenso(notaIntroducida))
			   System.out.println("Suspenso");
	   
	   }while (notaIntroducida <5);		
	   */
	   do{ 
		   System.out.println("Dame nota: ");
		   notaIntroducida = pedirNota ();
		     
	   }while (suspenso(notaIntroducida));
	   
	   System.out.println("Aprobado");
}

}

