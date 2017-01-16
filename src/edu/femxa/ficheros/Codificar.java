package edu.femxa.ficheros;

import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

import sun.security.krb5.internal.crypto.DesCbcCrcEType;

/**
 * Haced el cuerpo de los métodos
 * y un pequeño main para probarse
 * de forma que luego podamos
 * usar esta clase para codificar
 * decodificar ficheros
 * 
 * Un método codifica el mensaje
 * y llamando al método decodifica,
 * recuperaría el mensaje origina
 * 
 * @author Administrador
 *
 */
public class Codificar {
	
	public static String codifica (String cadena)
	{
		String cadena_cifrada = "";
			int num_aux= 0;
			char caracter_aux= 0;
			
			for (int pos = 0; pos < cadena.length(); pos++) 
			{
				
				num_aux= (int) cadena.charAt(pos);
				caracter_aux = (char) (num_aux+3);
				cadena_cifrada= cadena_cifrada+ caracter_aux;
			}
		
		return cadena_cifrada;
	}
	
	public static String decodifica (String cadena)
	{
		String mensaje_descifrado= "";
		int num_aux= 0;
		char caracter_aux= 0;
		
		for (int pos = 0; pos < cadena.length(); pos++) 
		{
			
			num_aux= (int) cadena.charAt(pos);
			caracter_aux = (char) (num_aux-3);
			mensaje_descifrado= mensaje_descifrado+ caracter_aux;
		}
			return mensaje_descifrado;
	}

	
	public static void main(String[] args) {
		
		String mensaje = "Esto es un mensaje cifrado";
		int codigo = 3;
		
		mensaje = codifica(mensaje);
		System.out.println(mensaje);
		
		mensaje = decodifica(mensaje);
		System.out.println(mensaje);
		
	}
}

