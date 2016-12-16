

import java.util.Scanner;

public class Principal {
	
	/**
	 * Pido un numero por teclado al usuario
	 * @return el numero introducido por el usuario
	 */
	public static double pedirNumeroDouble ()
	{
		
		double numleido = 0;
		
			Scanner scanner = new Scanner (System.in); //Declaro un objeto scanner para leer del teclado
			numleido = scanner.nextDouble(); //Leo de teclado y asigno el valor a numleido
			
		return numleido;
		
	
		
	}
	
	public static float pedirNumeroFloat()
	{
		float numleido = 0;
			Scanner scanner = new Scanner (System.in);
			numleido = scanner.nextFloat();
			
			return numleido;
			
		
	}
	
	/*
	 *Informa al usuario de su imc cualitativo
	 *@param imc: Valor numerico o cuantitativo del imc
	 */
	
	public static float calculoIMC (float peso, float altura)
	{
		float imc = 0;
		imc = peso / (altura * altura);
		return imc;		
	}
	
	
	public static void mostrarResultadoIMC (float imc)
	{
		System.out.println("Su indice de masa corporal es:");
		
		System.out.println(imc);
		
		if (imc<16)
		{
			System.out.println("Estas desnutrido");
		}
	
		else if ((imc>=16) && (imc<18.5))
		{
			System.out.println("Tienes bajo peso");
		}
	
		else if ((imc>=18.5) && (imc<25))
		{
			System.out.println("Estas normal");
		}
	
		else if ((imc>=25) && (imc<31))
		{
			System.out.println("Sobrepeso");
		}
	
		else //if (imc>=31)
		{
			System.out.println("Obeso");
		}
	
	
	
		
	}
	
	public static void main (String[] args)

	{
		
		//Pedir peso
		//Pedir altura
		//Calcular IMC = peso / altura * altura
		//Mostrar IMC
		float peso = 0;
			System.out.println("Introduzca su peso en kg");
		peso = pedirNumeroFloat();

		float altura = 0;
			System.out.println("Introduzca altura en metros");
		altura = pedirNumeroFloat();
		
		
		//float imc = peso / (altura * altura);
		float imc = calculoIMC (peso, altura); //calculo imc
		
				mostrarResultadoIMC(imc); // informo resultado
	
	}
	
	
}
