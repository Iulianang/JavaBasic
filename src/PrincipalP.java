

public class PrincipalP 
{
		public static void main (String[] args)
		{
			Persona persona1 = null; //declaro variable null y la inicializo
			
			persona1 = new Persona ("Pepe", 22); //metodo constructor de persona
			
			Persona persona2 = null;
			
			persona2 = new Persona ("Toni", 33);
			
			System.out.println(persona1.nombre + persona1.edad); //impresion de nombre y edad de persona1
			
			System.out.println(persona2.nombre + persona2.edad);
			
			
			
			
		}
	
		
}
