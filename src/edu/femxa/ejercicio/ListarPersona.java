package edu.femxa.ejercicio;

public class ListarPersona {

	/*
	 * Metodo donde listamos las personas insertadas mediante un for para recorrer el array
	 */
	
	public void listarPersona(Persona listaPersona[])
	{
			Persona persona_aux =null;
			String nombre_aux =null;
			int edad_aux =0;
		
		for (int i = 0; i < listaPersona.length; i++) 
		{
			persona_aux = listaPersona [i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();
		
			System.out.println("Nombre = "+ nombre_aux);
			System.out.println("Edad = "+ edad_aux);
		
		}
	}
}
