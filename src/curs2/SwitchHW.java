package curs2;

import java.util.Scanner;

public class SwitchHW {

	public static void main(String[] args) {
			/**
			 	* Scriem un program care intreaba utilizatorul un numar.
				* Avem un switch care pentru fiecare numar de la 1 la 7 atribuie o valoare reprezentand una din zilele saptamanii unei variabile care se numeste ziuaSaptamanii.
				* Daca utilizatorul introduce orice numar peste 7 va primi mesajul “Te rugam sa introduci un numar intre 1 si 7”
				* Daca a fost introdus un numar valid se va printa : "Ziua saptamanaii este <ziua afenera nr introdus>"			
			 */
		System.out.println("Introdu te rog un numar :");
		
		Scanner scan = new Scanner(System.in);
		String ziuaSaptamanii = scan.next();
		scan.close();
		
		switch(ziuaSaptamanii) {
		
		case "1" :
			System.out.println("Luni");
			break;
		case "2" :
			System.out.println("Marti");
			break;
		case "3" :
			System.out.println("Miercuri");
			break;
		case "4" :
			System.out.println("Joi");
			break;
		case "5" :
			System.out.println("Vineri");
			break;	
		case "6" :
			System.out.println("Sambata");
			break;
		case "7" :
			System.out.println("Duminica");
			break;
		default:
			System.out.println("Te rugam sa introduci un numar intre 1 si 7");
			break;
						
		}	
		System.out.println("Ziua saptamanii este : " + ziuaSaptamanii);
		
		

	}

}
