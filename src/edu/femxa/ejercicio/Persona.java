package edu.femxa.ejercicio;


public class Persona {

	
	private int edad;
	private String Nombre;
	
	public Persona()
	{
		//Constructor por defecto
	}
	
	
	
	public Persona (String nombre, int edad)
	{
		this.edad=edad;
		this.Nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}