package curs2;

import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {
		
		/**
		 * Pe baza unui punctaj vom atribui o nota.
		 * Punctajul este de la 0 la 100
		 * Daca obtii <=90, punctajul este B
		 * Daca obtii <=80, punctajul este C
		 * Daca obtii <=70, punctajul este D
		 * Daca obtii <=60, punctajul este E
		 * Else obtii A
		 * Punctajul il aflam de la user.
		 * Printam nota
		  */
		
		System.out.println("te rog sa imi spui ce punctaj ai obtinut : ");
		Scanner scan = new Scanner(System.in);
		double punctaj = scan.nextDouble();
		scan.close();
		
		char nota;
		
		if(punctaj <=60) {
			nota ='E';
		}
		else if(punctaj <=70) {
			nota = 'D';
		}
		else if(punctaj <=80) {
			nota = 'C';
		}
		else if(punctaj <=90) {
			nota = 'B';
		}	
		else {
			nota = 'A';
		}
		System.out.println("Nota obtinuta de tine este :" + nota);
	}

}
