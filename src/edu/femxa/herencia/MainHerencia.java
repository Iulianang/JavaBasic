package edu.femxa.herencia;

public class MainHerencia {
	
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		alumno.setNombre("Manolo");
		alumno.setEdad(22);
		alumno.mostrarPersona();
		alumno.setNota(5);
		alumno2.setNombre("Aroa");
		alumno2.setEdad(38);
		alumno2.setNota(4);
		//alumno=alumno2; //si defines (alumno=alumno2) y haces el if seran iguales
		alumno.equals(alumno2);
		if (alumno == alumno2)
		{
			System.out.println("Alumno y Alumno2 son iguales"); //si defines (alumno=alumno2) y haces if(alumno.equals(alumno2)); son iguales
		}else System.out.println("Alumno y Alumno2 no son iguales");//nunca seran iguales ya que nunca tienen el mismo espacio de memoria(por defecto)
		
		System.out.println("HASCODE: "+ alumno.hashCode());//mustra la posicion de memoria
		System.out.println("HASCODE: "+ alumno.toString());//objeto de la clase alumno que esta en la direccion hexadecimal...
	
		
		
		if (alumno instanceof Persona)
		{
			System.out.println("El alumno es una instancia de Persona");
		}
		if (alumno instanceof Alumno)
		{
			System.out.println("El alumno es una instancia de Alumno");
		}
		if (alumno instanceof Object)
		{
			System.out.println("El alumno es una instancia de Object");
		}
	}
}

