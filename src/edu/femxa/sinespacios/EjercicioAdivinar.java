package edu.femxa.sinespacios;

/**
 * 
 * @author Val
 *
 *El c�digo de esta clase, es un poco misterioso. Alg�n programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qu� narices hace este c�digo, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del m�todo adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al m�todo y a la clase
 *3) Idear un m�todo equivalente, pero distinto. Es decir, crear un m�todo 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: S�lo si resolviste los puntos anteriores, implementa una versi�n recursiva
 *
 */

public class EjercicioAdivinar {
	/**
	 * metodo donde se comparan caracteres para ver si son iguales o no "palindromo"
	 * devuelve un boolean
	 */
		
		private static boolean esPalindromo (String cad)
		{
			boolean bd = true;
			
			int i = 0;
			int j = cad.length()-1;
			
			while ((i<=j)&&(bd))
			{
				bd = cad.charAt(i)==cad.charAt(j);
				i++;
				j--;
			}
			
			
			return bd;
		}
		
		public static void main(String[] args) {
			
			if (siPalindromo("poop"))
			{
				System.out.println("VERDADERO");
			} else 
				{
					System.out.println("FALSO");
				}
		}

		private static boolean siPalindromo (String cad)
		{
			boolean palindromo = false;
			int inicio = 0;
			int fin = cad.length()-1;
			
			if((inicio<fin)&&(!palindromo))
			{
				
				if(cad.charAt(inicio) == cad.charAt(fin))
				{
					inicio++;
					fin--;
					
				}else palindromo = true;
					
				}
			return palindromo;
		}
		
}
