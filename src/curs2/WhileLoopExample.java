package curs2;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		/**
		 * Programul calculeaza un salariu
		 * pe baza numarului de ore lucrat intr-o saptamana (nu mai mult de 40 de ore)
		 * inmultim nr de ore lucrate  cu plata pe ora
		 * Stim salariul pe ora, dar nu stim numarul de ore lucrate
		 * Printam care este salariul.
		 */
		
		int NrMaxOreLucrate = 40;
		int salariuOrar = 25;
		
		System.out.println("Cate ore ai lucrat saptamana aceasta ?");
		Scanner scan = new Scanner(System.in);
		double oreLucrate = scan.nextDouble();
		
		while (oreLucrate > NrMaxOreLucrate) {
			System.out.println("Numarul introdus NU este corect. Te rog introdu un numar intre 1 si 40.");
			oreLucrate = scan .nextDouble();
		}
		scan.close();
		
		double salariu = oreLucrate * salariuOrar;
		System.out.println("Salariul tau este :" +salariu + " EUR");

	}

}
