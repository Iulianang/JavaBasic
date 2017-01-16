package edu.femxa.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Haced el cuerpo de los m�todos
 * y un peque�o main para probarse
 * de forma que luego podamos
 * usar esta clase para codificar
 * decodificar ficheros
 * 
 * Un m�todo codifica el mensaje
 * y llamando al m�todo decodifica,
 * recuperar�a el mensaje origina
 * 
 * @author Administrador
 *
 */

public class Codificar {
	
	public static final int CODIFICACION=3;
	public static String codifica (String cadena)
	{
		String mensaje_cifrado = "";
			int num_aux= 0;
			char caracter_aux= 0;
			
			for (int pos = 0; pos < cadena.length(); pos++) 
			{
				num_aux= (int) cadena.charAt(pos);
				caracter_aux = (char) (num_aux+CODIFICACION);
				mensaje_cifrado= mensaje_cifrado+ caracter_aux;
			}
		
		return mensaje_cifrado;
	}
	
	public static String decodifica (String cadena)
	{
		String mensaje_descifrado= "";
		int num_aux= 0;
		char caracter_aux= 0;
		
		for (int pos = 0; pos < cadena.length(); pos++) 
		{
			num_aux= (int) cadena.charAt(pos);
			caracter_aux = (char) (num_aux-CODIFICACION);
			mensaje_descifrado= mensaje_descifrado+ caracter_aux;
		}
			return mensaje_descifrado;
	}

	
	public static void main(String[] args) throws FileNotFoundException {
		
		String mensaje = "Esto es un mensaje cifrado";
		
		mensaje = codifica(mensaje);
		System.out.println(mensaje);
		
		mensaje = decodifica(mensaje);
		System.out.println(mensaje);
 		
	}
}

