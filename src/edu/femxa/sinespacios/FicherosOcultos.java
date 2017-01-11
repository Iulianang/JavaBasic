package edu.femxa.sinespacios;

import java.io.File;

public class FicherosOcultos {

	public static void main(String[] args) {
		
		File fichero = null;
		fichero = new File("ficheros");
			
			boolean oculto = false;
//			boolean oculto = fichero.isHidden();
			
			
			if(oculto)
			{
				System.out.println("Los archivos ocultos del directorio son: "+ oculto);
			}
			
}
}