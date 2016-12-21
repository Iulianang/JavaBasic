
public class Ejercicio4 {
	

	public int calcularLetraRepetida(String palabra,char letra){
		int contador = 0;
		char letraComparada;
		int i = 0;
		
		while( i<palabra.length()){
			
			letraComparada = palabra.charAt(i);
			
			if(letraComparada == letra){
				contador ++;
			}
			i ++;	
		}		
		return contador;
	}
	}
