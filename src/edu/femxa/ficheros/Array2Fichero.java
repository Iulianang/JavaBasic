package edu.femxa.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import edu.femxa.ejercicioclase.Main;
import jdk.jfr.events.FileWriteEvent;

public class Array2Fichero {
	
	public static void main(String[] args) throws IOException {
		String[] lista_cadena= new String[5];
		//TODO
		fromArray2Fichero(lista_cadena);
	}

	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		
		String[] lista_cadena = null;
		FileReader leerFichero;
		int contador = 0;
		try {
			leerFichero = new FileReader("archivo1");
			BufferedReader bufRead = new BufferedReader(leerFichero);
			String linea = bufRead.readLine();
			while (linea != null)
			{
				lista_cadena[contador]= linea;
				linea = bufRead.readLine();
				contador++;
			}
		
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena) throws IOException
	{
		boolean ok = true;
		File fichero = new File("archivo2");
		FileWriter escribirFichero;
			escribirFichero = new FileWriter ("ficheros\\archivo2");
			BufferedWriter bufWrite=new BufferedWriter(escribirFichero);
		
			for (int i = 0; i < lista_cadena.length; i++) 
				{
					bufWrite.write(lista_cadena[i]);
					bufWrite.newLine();
					System.out.println(lista_cadena[i]);
				}
			
		
		escribirFichero.close();
		return ok;
		
		
	}
	
	
}
