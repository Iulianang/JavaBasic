package edu.femxa.ejercicioclase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ListaPersonas listaP = new ListaPersonas();
		String nombre = null;
		int edad = 0;
			Scanner scan = null;
			scan = new Scanner(System.in);
		
		int persona_buscar = listaP.buscarPersonaPos("pepa");
		System.out.println("Inserten dos personas: ");
		
		for (int i = 0; i < ListaPersonas.TAMANIO_LISTA; i++) 
		{
			nombre = scan.next();
			edad = scan.nextInt();
			Persona persona = new Persona(nombre,edad);
			listaP.insertarPersona(persona);
		}
		
		
		if (persona_buscar == -5)
		{
			System.out.println("La persona buscada no esta.");
			
		}else
			System.out.println("La persona buscada esta en la posicion" + persona_buscar);
		
	}
}
