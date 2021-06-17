package curs3.polymorphism;

public class OverloadExample1 {

	public static void main(String[] args) {
		System.out.println(multiply (2.5, 4.0));
		
		System.out.println(multiply (3,3));
	}
	public static int multiply (int a, int b) {
		return a*b;
	}
	public static double multiply (double a, double b) {
		return a*b;
	}
}
