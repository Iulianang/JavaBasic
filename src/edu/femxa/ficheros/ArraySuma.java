package edu.femxa.ficheros;

public class ArraySuma {
		
		private int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
		
		public static void main(String[] args) {
			/**
			 * HACED EL CUERPO DEL MAIN
			 * PARA QUE DEVUELVA LA NOTA
			 * MEDIA 
			 * 
			 * Ojo con los tipos
			 * la media será real (float)
			 * 
			 */
			int[] notas = new ArraySuma().array_notas;
			int notas_longitud = notas.length;
			float nota_media = 0;
			float media = 0;
			
				for(int i = 0;i<notas_longitud;i++){
					media = media + notas[i];
					
				}
				
				nota_media = media / notas_longitud;
				System.out.println(nota_media);
		}

	}


