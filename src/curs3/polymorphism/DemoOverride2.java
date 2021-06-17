package curs3.polymorphism;

public class DemoOverride2 {

	public static void main(String[] args) {
		Angajat angajat = new Angajat();
		angajat.work();
		
		Angajat tester = new Tester();
		tester.work();
		((Tester) tester).scrieTestCases();
		
		
		tester = new Developer();
		tester.work();
		
		
		
		
		
	}

}
