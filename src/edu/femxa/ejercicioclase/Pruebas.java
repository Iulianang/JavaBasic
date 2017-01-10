package edu.femxa.ejercicioclase;

import edu.femxa.imc.Persona;

public class Pruebas {
	
	public static final int num_personas=5;
	
	public int buscarPersonaPos (String nombre)
	{
		int pos_encontrado = -5;
		int pos = 0;
		Persona persona_busq = null;
		boolean encontrado = false;
		Persona persona_aux = null;
		
		while (!encontrado && pos< num_personas){
			persona_aux = this.lista_personas[pos];
			
			if (persona_aux.getNombre().equals(nombre))
			{
				encontrado = true;
				pos_encontrado = pos;
				System.out.println("La posicion de la persona es: "+ pos_encontrado);
				
			}
			else pos++;
			
		}
		
		return pos_encontrado;
	}
	
	public Persona obtenerPersona (int pos)
	{
		Persona persona_pos = null;
		
			persona_pos = this.lista_persona[pos];
		
		return persona_pos;
	}

}
