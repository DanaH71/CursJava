package curs2;

import java.util.Scanner;

public class IfElseHW {

	public static void main(String[] args) {
		/**
		 	* Scriem un program care intreaba utilizatorul punctajul unui test.
 			* Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai picat. Mai incearca”
			* Daca utilizatorul introduce o valoare intre mai mare sau egala cu 66 atunci printeaza ”Felicitari, Ai trecut”
		 */
		
		int Punctaj = 66;
		
		
		System.out.println("Te rog sa introduci punctajul luat la test :");
		Scanner sc = new Scanner(System.in);
		
		int PunctajTest = sc.nextInt();
		sc.close();
		
		if(PunctajTest >=Punctaj) {
			System.out.println("Felicitari! Ai trecut.");
		}
		else {
			System.out.println("Ai picat.Mai incearca!");
		}
			
		
	}

}
