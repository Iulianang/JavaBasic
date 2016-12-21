package edu.femxa.cadena;

public class Cesar {
	
	public void mostrarCodChars (String cadena)
	{
//		int longi = cadena.length(); //para optimizar el codigo, damos un nombre a cadena.lenght
//		int numero_carac = 0;
//		char caracter = 0;
		int  j =81;
		char c= (char)j;
		System.out.println(c);
//			for (int pos = 0; pos < longi; pos++)
//			{
//				caracter = cadena.charAt(pos); //variable cadena, y el metodo charAt y devuelva un char de la posicion pos
//				numero_carac = (int) caracter;
//				//System.out.println(cadena.charAt(pos));
//				System.out.println(caracter + "=" + numero_carac);
//			}
		
	}
	
	public static void main(String[] args) 
	{
		Cesar cesar = null; //defines una nueva variable de la case Cesar, para indicar a main su localizacion dentro de la clase y poder acceder a ese metodo
		cesar = new Cesar();
		cesar.mostrarCodChars("LOLIPOP");
	}

}
