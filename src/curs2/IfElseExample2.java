package curs2;

import java.util.Scanner;

public class IfElseExample2 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Facem un program care [rinteaza 2 mesaje in functie de o conditie.
		 * Conditia este un nr de buguri.
		 * Daca atinge sau depaseste norma, ii spunem "Felicitari!"
		 * Daca nu atinge norma, ii spunem "Mai incearca!"
		 * Avem un numar de buguri ca si norma, care este egal cu 10.
		 * Dupa care intrebam utilizatorul cate buguri a introdus.
		 * In functie de cate buguri a introdus, printam daca a atins norma sau nu.
		 */
		
		
		int NrBugs = 10;
		
		
		System.out.println("te rog sa introduci numarul de buguri gasit :");
		Scanner sc = new Scanner(System.in);
		
		int BugsFound = sc.nextInt();
		sc.close();
		
		if(BugsFound >= NrBugs) {
			System.out.println("Felicitari!");
		}
		else {
			int missingBugs = NrBugs - BugsFound;
			System.out.println("Mai incearca! Iti lipsesc : " + missingBugs);
		}
	}
}
