package edu.femxa.raids;

public class InsertarOrdenado {

	
	public static int obtenerPos (int [] ae, int n)
	{
		int pos = 0;
		
		
			while ((pos< ae.length) && (ae[pos]<n)) //mientras la posicion sea menor que la array que es de 0 a 4 y el numero sea menor que el del usuario, asi averiguamos donde esta posicionado el numero
			{										//posicion +1
													
				pos++;								
		
			}
		
		return pos;
	}
	
	/**
	 * metodo para desplazar la raid a la derecha
	 * @param ae
	 */
	public static void desplazar(int []ae)  
	{ 
		int posFinal = ae.length;
		int aux = posFinal;
			for (int pos = posFinal; 0<pos; pos--) 
			{	
				ae [pos]=ae[pos-1];
				
			}ae[0]=aux;//guarda la posicion final en la primera posicion que esta vacia
			
		
	}
	
	public static void mostrarRaid(int ae [])
	{
		for(int i = 0; i < ae.length;i++)	
		{
			System.out.println(ae[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		int ae[] = new int [5];
		
		ae[0] = 1;
		ae[1] = 2;
		ae[2] = 5;
		ae[3] = 6;
		ae[4] = 7;
		
		int n_usuario = 3;
		
		int pos = obtenerPos(ae, n_usuario);
		
		//desplazar(ae);
		mostrarRaid(ae);
		
		System.out.println("El numero " + n_usuario + " debe ir en " + pos);
		
			
	}

}
