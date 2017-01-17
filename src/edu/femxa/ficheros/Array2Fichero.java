package edu.femxa.ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Array2Fichero {
	
	public static void main(String[] args)    
	{
		String [] array = new String[5];
		File fichero = new File(".\\ficheros\\archivo1");
		try {
			array =	fromFichero2Array(fichero);
			fromArray2Fichero(array);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String cad : array)
		{
		System.out.println(cad);
		}
	}
	
	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		
		FileReader leerFichero= null;
		int n_lineas = contarLineas(file);
		String []lista_cadena= new String [n_lineas];
		int contador = 0;
		
		try
		{
			leerFichero = new FileReader(".\\ficheros\\archivo1");
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
			System.out.println("Error al abrir fichero.");
			e.printStackTrace();
		}
		leerFichero.close();
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena) throws IOException
	{
		boolean ok = true;
		File fichero = new File(".\\ficheros\\archivo2");
		FileWriter escribirFichero  = new FileWriter (fichero);
		BufferedWriter bufWrite=new BufferedWriter(escribirFichero);
		
			for (int i = 0; i < lista_cadena.length; i++) 
				{
					
					try {
						bufWrite.write(lista_cadena[i]);
						bufWrite.newLine();
					} catch (IOException e) {
						ok = false;
						e.printStackTrace();
						
					}
					
				}
			bufWrite.close();
			escribirFichero.close();
		return ok;
		
		
	}
	private static int contarLineas (File file) throws IOException{
		int nlineas = 0;
		FileReader fileReader = null;
		BufferedReader br = null;
			fileReader = new FileReader(file);
			br=new BufferedReader(fileReader);
		
		while(br.readLine() != null){
			
			nlineas++;
		}
		br.close();
		fileReader.close();
		return nlineas;
	}
	
	

	
}