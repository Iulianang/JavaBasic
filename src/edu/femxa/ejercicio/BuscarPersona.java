package edu.femxa.ejercicio;

import java.util.Scanner;

public class BuscarPersona {
	
	/*
	 * Metodo para buscar una persona mediante un for para recorrer el array y un if para comprar el nombre indicado
	 * con los nombre del array y luego imprimir todos los datos de esa persona
	 */

	public void buscarPersonas(Persona [] lista)
	{
		Scanner scan = null;
			scan = new Scanner (System.in);
			String nombre_buscar = null;
		int cont = 0;
		
		System.out.println("Introduzca el nombre de la persona que quiere buscar:");
		nombre_buscar = scan.next();
		
		for(int i = 0; i < lista.length; i++)
		{
			if(lista[i].getNombre().equalsIgnoreCase(nombre_buscar))
			{
				System.out.println("Persona " + (i + 1) + (":"));
				System.out.println("Nombre: " + lista[i].getNombre());
				System.out.println("Edad: " + lista[i].getEdad());
			}
			else 
			{
				cont++;
			}
		}
		
	
	}
	
}
