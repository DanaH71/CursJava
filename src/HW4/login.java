package HW4;

import java.util.Scanner;

public class login {
	static int username = 123;
	static int parola = 12345;
	
	public login(int username, int parola) {
		
		System.out.println("Introdu te rog userul");
		Scanner scan = new Scanner(System.in);
		int user = scan.nextInt();
		//scan.close;
		
		System.out.println("Introdu te rog parola");
		Scanner scan2 = new Scanner(System.in);
		int pw = scan2.nextInt();
		//scan2.close;
		
		while ((user != username) && (pw != parola)) {
			System.out.println("Login error");
		}	
		 System.out.println("Login successful");
	
}
	
public static void main(String[] args) {
		
		login credentials = new login(123, 12345);
		
		credentials.login();
			
		}

	}

