package edu.femxa.ejercicio;

import java.util.Scanner;

public class BorrarPersona {
	/*
	 * Metodo para eliminar una posicion del array mediante un do while para recorrer el array mientras el contador sea menor que el array y eliminado sea true
	 * con un if para encontrar y eliminar el nombre solicitado y un for para borrar la posicion
	 */
	
	public Persona[] borrarPersona (Persona[] listado)
	{
		String nombreBuscar = null;
		Scanner scan = null;
			scan = new Scanner(System.in);
			nombreBuscar = scan.next();
		int contador = 0;
		boolean eliminado = false;
		
		do
			{
			if(nombreBuscar.equals(listado[contador].getNombre()))
			{
				for(int j=contador; j<listado.length-1; j++)
				{
					listado[j] = listado[j+1];
					System.out.println(listado[j].getNombre());
				}
				eliminado = true;
				listado[listado.length-1].setEdad(0);	//esto funciona, pero a medias 
				listado[listado.length-1].setNombre("posicion vacia");
			}contador++;
			
		}while ((contador<listado.length)&&(!eliminado));
	
		
		return listado;
	}
}
