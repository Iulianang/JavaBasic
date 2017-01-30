package edu.femxa.ejerciciocmd;

public class Comparador {
	
	public static void main(String[] args) {
		
		int longitud = 0;
		String palabra_mayor = null;
		int num_argumentos = 0;

		for ( String palabra : args){

			if (longitud <  palabra.length()){

				longitud = palabra.length();
				palabra_mayor = palabra;
			}
			num_argumentos++;
		}
		System.out.println("Total palabras introducidas: " +num_argumentos);
		System.out.println("Palabra de mayor longitud:  "+palabra_mayor);

		}
	

}
