package curs2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		/**
		 * Un program care intreaba utilizatorul ce nota a obtinut.
		 * Pe baza notei ii intoarce un mesaj.
		 * Daca nota este A - Felicitari
		 * Daca nota este B - Destul de bine
		 * Daca nota este C - Suficient
		 * Daca nota este D - Insuficient
		 * Daca nu introduce niciuna din notele de mai sus - Te rugam introdu o nota valida
		  */
		
		System.out.println("Introdu te rog nota primita :");
		
		Scanner scan = new Scanner(System.in);
		String nota = scan.next();
		scan.close();
		
		switch(nota) {
		
		case "A" :
			System.out.println("Felicitari");
			break;
		case "B" :
			System.out.println("Destul de bine");
			break;
		case "C" :
			System.out.println("Suficient");
			break;
		case "D" :
			System.out.println("Insuficient");
			break;
		default:
			System.out.println("Te rugam sa introduci o nota valida !");
			break;
						
		}
		
	}

}
