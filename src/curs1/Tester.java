package curs1;

public class Tester{
	private String nume;
	private int ratePerHour;
	private int age;
	
	public Tester() {
	}
	public void setNume(String oarecare) {
		this.nume = oarecare; //this se refera la variabila la nivel de clasa
	}
	public String getNume () {
		return nume;
	}	
	
	public void setRatePerHour(int unnumar) {	
		this.ratePerHour = unnumar;
	}	

	public int getratePerHour () {
	return ratePerHour;
	}

	public void setage(int unnumar) {	
		this.age = unnumar;
	}	

	public int getage () {
	return age;
	}

}


