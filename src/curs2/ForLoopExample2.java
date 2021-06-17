package curs2;

import java.util.Scanner;

public class ForLoopExample2 {

	public static void main(String[] args) {
		/**
		 * Un program care cere un text de la tastatura 
		 * dupa care verifica daca textul contine o anumita litera, sa zicem A
		 * Daca contine litera A, printeaza : acest text contine litera A
		 * Daca nu contine litera A, printeaza : acest text NU contine litera A
		 */
		
		System.out.println("Te rugam sa introduci un text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();
		
		boolean literaGasita = false;
		
		for(int i=0; i<text.length(); i++) {
			
			char literaCurenta = text.charAt(i);
			if(literaCurenta == 'A' || literaCurenta == 'a') {
				literaGasita = true;
				break;
			}
		}
		if(literaGasita) {
			System.out.println("Acest text contine litera A");
	}
		else
			System.out.println("Acest text NU contine litera A");
	}
}
