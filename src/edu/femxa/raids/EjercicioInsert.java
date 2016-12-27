package edu.femxa.raids;

import java.util.Scanner;

public class EjercicioInsert {
	
	public static void main(String[] args) {
		int a_ent_a [] = new int [3];
		int num_usuario = pedirNumero();
		int posN = 0;
		//TODO 
		
			for (int i = 0; i<a_ent_a.length; i++)
				{
					a_ent_a[i]= pedirNumero();
					
					if(posN == a_ent_a[i])
					{
						
					}
					
					//if(a_ent_a[i].)
					System.out.println(posN + a_ent_a[i]);
				}
		
			
	}
	
	public static int pedirNumero ()
	{
		int pedirNumero = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in); 
		pedirNumero = scanner.nextInt();
		return pedirNumero;
	}
	
	
	public static int posNumero()
	{
		int posN = 0;
		
			for(posN = 0;posN)
			{
				
			}
		
		return posN;
	}
	

}
