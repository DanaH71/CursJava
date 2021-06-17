package curs2;

import java.util.Scanner;

public class WhileHW {

	public static void main(String[] args) {
		/**
		 * Scriem un program care printeaza valoarea de mijloc dintre doua numere
		* Programul are doua variabile de tip int.
		* Prima are valoarea 20 iar a doua are valoarea 45
		* Trebuie sa gasim valoarea de mijloc intre aceste 2 numere. Adica 30
		 */
		int NrMax = 45;
		int NrMin = 20;
		
		System.out.println("Care este valoarea medie intre NrMin si NrMax ?");
		Scanner scan = new Scanner(System.in);
		double numar = scan.nextDouble();
		
		while (numar > NrMax) {
			System.out.println("Numarul introdus NU este corect. Te rog introdu un numar intre 20 si 45.");
			numar = scan.nextInt();
		}
		scan.close();
		
		int medie = (NrMin + NrMax)/2;
		System.out.println("Media este :" + medie);

	}
	}


