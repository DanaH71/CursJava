package curs3.inheritance;

public class TesterInheritance {

	public static void main(String[] args) {
		
		TesterAutomat tester1 = new TesterAutomat();
		
		tester1.setLimbajProgramare("Java");
		tester1.setSeniority("Junior");
		tester1.setDepartment("QA");
		tester1.setName("Oana");
		tester1.setEmail("oana@rer.fr");
		
		System.out.println("Numele angajatului este "  + tester1.getName()  + " lucreaza in departamentul de "  + tester1.getDepartment() + " este de nivel " +tester1.getSeniority());
		
		
	}

}
