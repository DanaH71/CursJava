package curs4.string;

import java.util.Scanner;

public class StringSample {
	
		public static void main(String[] args) {
		
		//inverseazaUnCuvant("dragos");
		palidrom ("dragos"); {
		}
	}
			
		/**
		 * Metoda care scrie un cuvant invers
		 * @param cuvant
		 * 
		 */
			
	public static void inverseazaUnCuvant(String cuvant) {
			//dragos 
			//sogard
		
			for(int i=cuvant.length()-1; i>=0; i--)
				System.out.println(cuvant.charAt(i));
			
		}
		
}		

//verificat daca un string este palindrom


	/** verifica daca un string este palidrom
	 * @param cuvant
	 */
	
	public static void palindrom(String cuvant) {
	
		String cuvantIntors = "";
		
		for (int i = cuvant.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			}
	if(cuvantIntors.contentEquals(cuvant))
		System.out.println("Cuvantul este palindrom");
	}else {
		System.out.println("Cuvantul nu este palindrom");
	}
	
}

