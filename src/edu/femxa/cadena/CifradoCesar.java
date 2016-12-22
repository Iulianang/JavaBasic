package edu.femxa.cadena;

public class CifradoCesar {

	public String cifrarCesar (String palabra, int clave)
	{
		String cadena_dev = null;
		int longitud = palabra.length();
		char caracter = 0;
		char caracter_cifrado = 0;
		int caracter_numero = (int) caracter;
		cadena_dev = new String();
		

			for(int pos=0; pos<longitud; pos++){
				caracter = palabra.charAt(pos);
				if (caracter != ' ')
				{	caracter =palabra.charAt(pos);
					caracter_numero = (int) caracter;
					caracter_numero = caracter_numero + clave;
					caracter_cifrado = (char) caracter_numero;
					cadena_dev = cadena_dev + caracter_cifrado;
				
				}else
					{
					cadena_dev = cadena_dev + caracter;
					}
				}
			return cadena_dev;
			
	}
	
	
	
	public static void main(String[] args) {
		
		CifradoCesar cifrado = null; 
		cifrado = new CifradoCesar();
		String mensaje_cifrado = cifrado.cifrarCesar("La lista de la compra es la siguiente", 3);
		System.out.println(mensaje_cifrado);
	}
}