package edu.femxa.registro;

import java.io.IOException;

public class MainMenu {
	
	public static void main(String[] args) throws IOException {
		String nombre = null;
		String contrase�a= null;
		nombre = new Registro().rNombre(nombre);
		contrase�a=  new Registro().rContrase�a(contrase�a);
		Acceso.leerNombre(nombre);
		Acceso.leerContrase�a(contrase�a);
		
	}

}
