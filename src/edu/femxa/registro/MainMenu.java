package edu.femxa.registro;

import java.io.IOException;

public class MainMenu {
	
	public static void main(String[] args) throws IOException {
		String nombre = null;
		String contraseņa= null;
		nombre = new Registro().rNombre(nombre);
		contraseņa=  new Registro().rContraseņa(contraseņa);
		Acceso.leerNombre(nombre);
		Acceso.leerContraseņa(contraseņa);
		
	}

}
