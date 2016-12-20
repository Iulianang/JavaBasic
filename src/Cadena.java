
public class Cadena {

	
	public static void main(String[] argumentos) //String con [] son varios string, args es una lista de palabras
	{
		/*System.out.println("Palabra 1 = "+argumentos [0]);
		System.out.println("Palabra 2 = "+argumentos [1]);
		System.out.println("Palabra 3 = "+argumentos [2]);
		*/
		
		for (int i=0; i<argumentos.length; i++)
		{
				System.out.println("La palabra "+i+" es " + argumentos[i]);
		}
	}
	
}