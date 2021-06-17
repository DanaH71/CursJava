package HW5;

import java.util.Scanner;

public class YearArray {

	public static void main(String[] args) {

		String [] textArray = new String[12];
		
		textArray[0] = "Ianuarie";
		textArray[1] = "Februarie";
		textArray[2] = "Martie";
		textArray[3] = "Aprilie";
		textArray[4] = "Mai";
		textArray[5] = "Iunie";
		textArray[6] = "Iulie";
		textArray[7] = "August";
		textArray[8] = "Septembrie";
		textArray[9] = "Octombrie";
		textArray[10] = "Noiembrie";
		textArray[11] = "Decembrie";
		
		boolean x = true;
		
		while (x) {
		
			System.out.println("Introdu un numar: ");
			Scanner scan = new Scanner(System.in);
			int month = scan.nextInt();
			scan.close();
			
			try {
				System.out.println("Luna aferenta numarului este :" + textArray[month]);
				x = false;
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Ai introdus un numar in afara range-ului!");
			}
				
				
}
		
		
		
	//	for (int i = 0; i<textArray.length; i++) {
	//		System.out.print("Te rog sa introduci o cifra de la 0 la 11: ");
		}

	}

