package edu.femxa.ejercicio;

import java.util.Scanner;

public class InsertarPersona {
	
	/*
	 * Metodo para insertar personas mediante un for, donde se recorre el array y se indica una persona con nombre y edad por cada posicion
	 */
	
	public Persona[] rellenarArrayPersona (Persona listaPersona[])
	{
		Persona persona_aux =null;
		String nombre_aux =null;
		int edad_aux =0;
		Scanner scanner = null;
		scanner = new Scanner (System.in);
		
		persona_aux = new Persona();
		
		for (int j = 0; j<listaPersona.length;j++) 
		{
			nombre_aux = scanner.next();
			edad_aux = scanner.nextInt();
			persona_aux =new Persona(nombre_aux,edad_aux);
			listaPersona[j] = persona_aux;
		}
		
		return listaPersona;
	}

	
}
