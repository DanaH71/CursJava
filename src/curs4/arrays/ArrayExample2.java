package curs4.arrays;

import java.util.Random;

public class ArrayExample2 {
	
	private static final int LUNGIME = 7;
	private static final int NUMERE_MAXIME = 14;

	public static void main(String[] args) {
		
		printeazaNumerele(generateNumbers());
		
	
	}
	
	//cautare secventiala in array
	public static boolean cautaNr(int array[], int numarCautat) {
		
		//
		for(int value : array) {
			if(value == numarCautat) {
				return true;
			}
		}
		return false;
	}
	
	
	//genereaza numere random pana la 14 si le tine intr-un array
	
	public static int[] generateNumbers() {
		
		int[] numbers = new int[LUNGIME];
		Random random = new Random();
		
		for(int i = 0; i<LUNGIME; i++) {
			
			int nrRandom;
			
			do {
				nrRandom = random.nextInt(NUMERE_MAXIME);
				
			} while(cautaNr(numbers, nrRandom));
				
				numbers[i] = nrRandom;
			}
		return numbers;
		}
	


	//printeaza numerele
	
	public static void printeazaNumerele(int numbers[]) {
		
		for(int i=0; i<LUNGIME; i++) {
			System.out.print(numbers[i] + " | ");
		}
	}
	
}
