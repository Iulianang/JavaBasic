import java.util.Scanner;

public class Ejercicio3 {


		public static void main (String [] args){
			String cadena;
			int valor;
				System.out.println("Introduce palabra");
				cadena = pedirCadena();
				System.out.println("Introduce numero");
				valor = pedirNumero();
			ultimosNumeros(cadena,valor);
			
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

		
		public static void ultimosNumeros (String palabra, int num){
			
//			int ultimosNumeros = (palabra.length()-num);
//			for(int i =0;i<num;i++){
//				System.out.print(palabra.charAt(ultimosNumeros));
//				
//				ultimosNumeros++;
//			
//			}

			int limSuperior = palabra.length()-1;
			int limInferior = palabra.length()-num;
			
			while (limSuperior >= limInferior)
				{ 
				System.out.print(palabra.charAt(limSuperior));
				limSuperior--;
			}
			
		}
			
		
	
}