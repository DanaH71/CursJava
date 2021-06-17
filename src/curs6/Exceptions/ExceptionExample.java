package curs6.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class ExceptionExample {

	public static void main(String[] args) {

		//divideNr();
		
		
		System.out.println("Introdu 2 numere :");
		Scanner scan = new Scanner(System.in);
		scan.close();

		try {
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
		
		}catch(InputMismatchException e) {
			
			System.out.println("Ai folosit alt data type la zero. Nu este permis!");
			e.printStackTrace();	
			
		}catch(ArithmeticException e) {
			
			System.out.println("Ai impartit la zero. Nu este permis!");
			e.printStackTrace();
			
		}catch(Exception e) {
			
			System.out.println("Ai facut ceva gresit!");
			e.printStackTrace();	
			
		}

		
		
		
		//System.out.println("Ajunge aici !!!!");
	}
	
	public static void divideNr() {
		
		System.out.println("Introdu 2 numere :");
		Scanner scan = new Scanner(System.in);
		scan.close();


			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
		
	
			
			System.out.println("Ai impartit la zero. Nu este permis!");
			
		}
		
	}

