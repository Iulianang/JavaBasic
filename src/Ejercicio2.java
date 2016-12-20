import java.util.Scanner;

public class Ejercicio2 {


		public static void main (String [] args){
			String cadena;
			int valor;
			System.out.println("Introduce palabra");
				cadena = pedirCadena();
			System.out.println("Introduce numero");
				valor = pedirNumero();
			cadenaNumero(cadena,valor);
			
		}
		
		public static String pedirCadena(){
				
		String palabra;
			Scanner scanner = null;
			scanner = new Scanner (System.in);
			palabra = scanner.next();
		return palabra;
		
		}
		
		public static int pedirNumero(){
			
			int numero;
				Scanner scanner = null;
				scanner = new Scanner (System.in);
				numero = scanner.nextInt();
			return numero;
			
			}

		public static void cadenaNumero (String palabra, int num){
			char local;
			int i=0;
			do {
				local = palabra.charAt(i);
				System.out.println(palabra.charAt(i));
				i++;
			}while (i<num && i<palabra.length());
		}
	
}
