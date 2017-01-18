package edu.femxa.registro;

import java.io.IOException;

public class MainMenu {
	
	public static void main(String[] args) throws IOException {
		String nombre = null;
		String contraseña= null;
		nombre = new Registro().rNombre(nombre);
		contraseña=  new Registro().rContraseña(contraseña);
		Acceso.leerNombre(nombre);
		Acceso.leerContraseña(contraseña);
		
	}

}
