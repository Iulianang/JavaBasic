package edu.femxa.registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicheros {
	
	public static String nombre_usuario (String nombre) throws IOException    
	{
		File fichero = new File("nombre_usuario");
		FileWriter escribirFichero  = new FileWriter (fichero);
			BufferedWriter bw=new BufferedWriter(escribirFichero);
				String nombre_recibido = Registro.rNombre(nombre);
				try {
					bw.write(nombre_recibido);
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					bw.close();
					escribirFichero.close();
				}
				return nombre_recibido;
			
	}
	
	public static String contraseņa_usuario (String contraseņa) throws IOException 
	{
		File fichero = new File("contraseņa");
		FileWriter escribirFichero  = new FileWriter (fichero);
			BufferedWriter bw=new BufferedWriter(escribirFichero);
			
			String contraseņa_recibida = Registro.rContraseņa(contraseņa);
			String contraseņa_cifrada = codifica(contraseņa_recibida);
			bw.write(contraseņa_cifrada);
			bw.close();
			escribirFichero.close();
		return contraseņa_cifrada;
	}
	
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
}
