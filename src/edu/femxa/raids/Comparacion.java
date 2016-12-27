package edu.femxa.raids;

public class Comparacion {
	
	public static void main(String[] args) {
		
		int a_ent_a [] = new int [10];
			
				for (int i = 0; i<a_ent_a.length; i++)
				{
					a_ent_a[i] = (int) (100*Math.random()+1);
				
					System.out.println("Numero en la posicion " + i +" "+ a_ent_a[i]);
				
				}
	}

}
