package edu.femxa.cadena;

public class ResueltoCesar {
	
	public static void main(String[] args) {
		ResueltoCesar cesar = null; 
		cesar = new ResueltoCesar();
		String resultado = cesar.cifradoCesar("La lista de la compra es", 3);
		System.out.println(resultado);
	}
	
	public String cifradoCesar (String palabra, int clave)
	{
		int longi = palabra.length();
		String palabra_cifrada = null;
		char caracter_actual = 0;
		int numero_caracter = 0;
		char caracter_cifrado = 0;
		palabra_cifrada = new String();
		
			for(int pos=0; pos<longi; pos++){
				caracter_actual = palabra.charAt(pos);
				if (caracter_actual != ' ')
				{	caracter_actual =palabra.charAt(pos);
					numero_caracter = (int) caracter_actual;
					numero_caracter = numero_caracter + clave;
					caracter_cifrado = (char) numero_caracter;
					palabra_cifrada = palabra_cifrada + caracter_cifrado;
					
				}else
					{
					palabra_cifrada = palabra_cifrada + caracter_actual;
					}
				
			}
		return palabra_cifrada;
		
				
	}
	


}
