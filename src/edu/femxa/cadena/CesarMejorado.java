package edu.femxa.cadena;

public class CesarMejorado {
	
	public static void main(String[] args) {
		ResueltoCesar cesar = null; 
		cesar = new ResueltoCesar();
		String resultado = cesar.cifradoCesar("La lista de la compra es", 3);
		System.out.println(resultado);
//			for (int toni=0; toni<pos; pos++)
//			{
//				palabra = 
//			
//			}
	}
	// TODO
	public String cifradoCesar (String palabra, int clave)
	{
		int longi = palabra.length();
		String palabra_cifrada = null;
		char caracter_actual = 0;
		//int numero_caracter = 0;
		//char caracter_cifrado = 0;
		palabra_cifrada = new String();
		
			for(int pos=0; pos<longi; pos++){
				caracter_actual = palabra.charAt(pos);
				
				
			}
		return palabra_cifrada;
		
				
	}
	
	public char traduceCharCesar (char c, int k)
	{
		char cifrado = 0;
		int char_n = 0;
			char_n = (int) c + k;
			cifrado = (char) char_n;
			if (c == ' ')
			{
				cifrado = ' ';
			}
			else
			{
				char_n = (int) c + k;
				cifrado = (char) char_n ;
			}
		
	
		
		return cifrado;
		
	}
	

}