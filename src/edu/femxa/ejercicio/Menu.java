package edu.femxa.ejercicio;

import java.util.Scanner;

	public class Menu {
		/*
		 * Metodo para definir las opciones que se quieran aplicar mediante un while mientras no se elija la opcion 5 que es la de salir del menu.
		 */
		
		public Persona[] mostrarMenu (Persona listaPersona[])//Persona listaPersona[] es el array que se utilizara para las distintas acciones del menu
		{
			Scanner scan = null;
			scan = new Scanner(System.in);
			int numeroMenu = 0;
			InsertarPersona insert = new InsertarPersona();
			BuscarPersona busca = new BuscarPersona();
			ListarPersona lista = new ListarPersona();
			BorrarPersona eliminar = new BorrarPersona();
			
				System.out.println("Elija una de las siguientes opciones:");
			
				while (numeroMenu !=5){
					System.out.println("1.Insertar una persona");
					System.out.println("2.Listar personas");
					System.out.println("3.Buscar personas por nombre");
					System.out.println("4.Borrar una persona");
					System.out.println("5.Salir(cerrar menu)");
					
					numeroMenu = scan.nextInt();
					
					switch (numeroMenu) {
					case 1:
						 	listaPersona = insert.rellenarArrayPersona(listaPersona);
						break;
					case 2:
					 		lista.listarPersona(listaPersona);
						break;
					case 3:
							busca.buscarPersonas(listaPersona);
						break;
					case 4:
				 			eliminar.borrarPersona(listaPersona);
					break;
						case 5:
							System.out.println("Adios.");
						break;
					default:
							System.out.println("Se ha introducido un numero erroneo, prueba otra vez");
						break;
					}
					
				}
			
				
			return listaPersona;
			
			
		}

		

	
}