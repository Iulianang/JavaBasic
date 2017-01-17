package edu.femxa.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Array2FicherosTest {
	
	
	public static void main(String[] args) {
		String cadenaFicheros[] = new String[3];
		try 
		{
			FileReader fileReader = new FileReader("ficheros\\archivo1");
			FileWriter fileWriter = new FileWriter("ficheros\\archivo2");
			BufferedReader bufRead=new BufferedReader(fileReader);
			BufferedWriter bufWrite=new BufferedWriter(fileWriter);
			
			cadenaFicheros = fromFichero2Array(bufRead,cadenaFicheros);
			fromArray2Fichero(cadenaFicheros,bufWrite);
			
		} catch (IOException e)
		
		{
			System.out.println("Se ha generado un error");
			e.printStackTrace();
		}
	}
	
	
	public static String[] fromFichero2Array (BufferedReader bufRead, String[] lista_cadena) throws IOException
	{
		
		int contador = 0;
		String linea = bufRead.readLine();
		
		while(linea  != null)
		{
			lista_cadena[contador] = linea;
			linea = bufRead.readLine();
			contador++;
		}
		
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena, BufferedWriter bufWrite) throws IOException
	{
		boolean ok = true;
		for(int i = 0; i<lista_cadena.length;i++)
		{
			try 
			{
				bufWrite.write(lista_cadena[i]);
				bufWrite.newLine();
				System.out.println(lista_cadena[i]);
			} catch (IOException e) 
			{
				e.printStackTrace();
				ok = false;
			}
		}
			
		return ok;	
		
		
	}
	
	
}