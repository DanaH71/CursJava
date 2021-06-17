package curs1;

public class BugsCalculator {
	
	int oreLucrate = 40;
	int age = 35;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj = new Tester();
		obj.setNume("Ana ");
		obj.setRatePerHour(20);
		obj.setage(35);
		//System.out.println(obj.getNume());
		//System.out.println("Salariul lui " + obj.getNume() + " este : " + objCalc.calculateSalary(obj.getratePerHour()) +"€");
		
		System.out.println(obj.getNume() + " are " + obj.getage() + " ani.");
	
	}

	//BugsCalculator objCalc = new BugsCalculator ();
	//public int calculateSalary(int plataPeOra) {
		//int salariu = oreLucrate * plataPeOra;
		//return salariu;
	}

