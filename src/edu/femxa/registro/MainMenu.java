package edu.femxa.registro;

import java.io.IOException;
import java.util.Scanner;

import edu.femxa.ejercicio.InsertarPersona;

public class MainMenu {
	
	public static void main(String[] args) throws IOException {
		String nombre = null;
		String contraseña= null;
		int numeroMenu = 0;
		Scanner scan = null;
			scan = new Scanner (System.in);
			
		while (numeroMenu !=2){
			System.out.println("1.Registrarse");
			System.out.println("2.Acceder");
			
			numeroMenu = scan.nextInt();
			
			switch (numeroMenu) {
			case 1:
				nombre = new Registro().rNombre(nombre);
				contraseña=  new Registro().rContraseña(contraseña);
				break;
			case 2:
				Acceso.leerNombre(nombre);
				Acceso.leerContraseña(contraseña);
				break;
			default:
				System.out.println("Se ha introducido un numero erroneo, prueba otra vez");
			break;
		
			}
			
		}
	}

}
