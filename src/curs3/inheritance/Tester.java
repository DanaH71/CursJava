package curs3.inheritance;

public class Tester extends Angajat {
	
	private String department;
	private String seniority;
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}
	public String getDepartment() {
		return department;
	}
	public String getSeniority() {
		return seniority;
	}
}

