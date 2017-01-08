package edu.femxa.ejercicio;


public class PrincipalPersona {
	
	/*
	 * metodo principal, donde se define el array y se inicia el menu
	 */

	public static final int NUM_PERSONAS=5;//constante de personas
	
	public static void main(String[] args) {
		
		Persona []array_persona=null; //Persona array_persona[];
		array_persona=new Persona [NUM_PERSONAS]; 
		
		Menu menu =new Menu();
		array_persona = menu.mostrarMenu(array_persona);
		
		
		
		
		
	}
	
	 
}