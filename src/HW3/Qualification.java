package HW3;

import java.util.Scanner;

public class Qualification extends Teacher {

	/**
	 * Scriem un program care verifica daca un profesor se califica sa predea la o scoala.
	 * Daca se califica, atunci printeaza ”You qualify to teach at this school!”
	 * Daca nu se califica, atunci printeaza “You do not qualify!”
	 */
	
	public Qualification(int experienceYears, String course, String schedule) {
		setCourse(course);
		setExperienceYears(experienceYears);
		setSchedule(schedule);
	}
	
	
		public void verify() {
			
	if(getExperienceYears() >3 && getCourse().equals("Java") && getSchedule().equals ("Afternoon")) {
				System.out.println("You qualify to teach at this school!");
			}
			else {
				System.out.println("You do not qualify!");	
		}
}
		
	


}
