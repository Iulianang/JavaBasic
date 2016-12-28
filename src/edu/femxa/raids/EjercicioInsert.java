package edu.femxa.raids;

import java.util.Scanner;

public class EjercicioInsert {
	
	public static final int pos_Inicial=1;
	public static final int pos_Final=5;
	
	public static int pedirNumero ()
	{
		int pedirNumero = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in); 
		pedirNumero = scanner.nextInt();
		return pedirNumero;
	}
	
	
	public static int obtenerPos(int [] ae, int n, int limite) 
	{
		int pos = 0;
		while ((pos< limite) && (ae[pos]<n))
			{
				pos++;
			}
		
		return pos;
		
	}
	
	
	public static void desplazar(int []ae, int pos_Inicial, int pos_Final)  
	{ 	
		int posFinal = pos_Final;
		
		for (int pos = posFinal+1; pos_Inicial<pos; pos--) 
			{	
				if(pos<ae.length)
				{
					ae [pos]=ae[pos-1];
				}
			}
			
		
	}
	public static void mostrarRaid(int ae [])
	{
		for(int i = 0; i < ae.length;i++)	
		{
			System.out.println(ae[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int ae [] = new int [5];
		int num_usuario = 0;
		int posN = 0;
		
		
		for(int i = 0; i < ae.length;i++) 
		{
			System.out.println("Dame numero: "+i);
			num_usuario = pedirNumero();
			
				posN = obtenerPos(ae, num_usuario, i);
				desplazar(ae, posN, i);
				ae[posN] = num_usuario;
			
		}
		//TODO 
		
		
		mostrarRaid(ae);
		
			
	
	}

}
