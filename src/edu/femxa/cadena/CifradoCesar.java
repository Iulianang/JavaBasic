package edu.femxa.cadena;

public class CifradoCesar {

	public void cifrarCesar (String palabra, int clave)
	{
		String cadena_dev = null;
		int longitud = palabra.length();
		char caracter = 0;
		char caracter_cifrado = 0;
		int caracter_numero = (int) caracter;
		
		// TODO	

			for (int pos = 0; pos < longitud; pos++)
				{
					if (caracter_actual != ' ')
					{
						cadena_dev = cadena_dev + " ";
					
					}else
						caracter = palabra.charAt(pos);
						caracter_numero = (int) caracter;
						caracter_cifrado = (char) (caracter_numero + clave);
						System.out.println(caracter_cifrado); 
				}
			return cadena_dev;
			
	}
	
	
	
	public static void main(String[] args) {
		
		CifradoCesar cifrado = null; 
		cifrado = new CifradoCesar();
		cifrado.cifrarCesar("La lista de la compra es la siguiente", 3);
		
	}
}