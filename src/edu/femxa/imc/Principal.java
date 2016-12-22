package edu.femxa.imc;

public class Principal {

		public static void main(String[] args) {
			
			/*
			 * obtener peso
			 * obtener altura
			 * obtener imc
			 * mostrar resultado
			 * persona
			 * IMC5
			 */
			
			double peso = EntradaSalida.obtenerPeso();
			double altura = EntradaSalida.obtenerAltura();
			Persona persona = new Persona(peso, altura);
			persona.setAltura(altura);
			persona.setPeso(peso);
			double imc = IMC.calcula(persona);
			EntradaSalida.mostrarIMC(imc);
		}
		
		//programacion de IMC orientado a objetos
}
