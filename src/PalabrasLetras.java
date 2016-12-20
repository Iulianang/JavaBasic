import sun.applet.Main;

public class PalabrasLetras {

	
	/*
	 * metodo que reciba una palabra y muestre en cada linea todas las letras de esa palabra
	 */
//	public boolean siLetraEnPalabra (String palabra, char letra)
//		{
//		
//		boolean b_dev = false;	
//		return b_dev;
//		
//		
//		}
	public static void main(String[] args) {
		
		String cat = "Lunes";
		char letrita = 'l';
		int longi = cat.length();
		int indice = 0;
		char comparaLetrita;
		boolean compara = false;
		
		
		while (indice<longi)
		{
			System.out.println(cat.charAt(indice));
			comparaLetrita = cat.charAt (indice);
			
			if(comparaLetrita == letrita)
				{ compara = true;
				}
				
			indice++;
		}
			
		if (compara = true){
			System.out.println("Se encontro la letra dentro de la palabra");
		}else
			System.out.println("No se ha encontrado la letra dentro de la palabra");
		}
	
}