package edu.femxa.excepciones;

public class CheckvsUncheckExceptions {

	
	public static void main(String[] args) {
		String cadena = null;
		int [] ae = new int[4];
		try {
//			int tamaño = cadena.length();
//			System.out.println(tamaño);
			int longi = ae.length;
			ae[ae.length] = 3;
			System.out.println(longi);
			
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Excepcion Array");
				e.printStackTrace();
		} catch (NullPointerException e) {
				System.out.println("Excepcion Null");
				e.printStackTrace();
		}
		
		  catch (Exception e) {
				System.out.println("Excepcion general");
				e.printStackTrace();
		}
	}
}
