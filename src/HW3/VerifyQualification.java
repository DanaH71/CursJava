package HW3;

public class VerifyQualification extends Qualification {

	public VerifyQualification(int experienceYears, String course, String schedule) {
		super(experienceYears, course, schedule);
		
	}

	public static void main(String[] args) {
		
		Qualification qualif = new Qualification(4, "Java", "Afternoon");
		
		//qualif.setCourse("Java");
		//qualif.setExperienceYears(3);
		//qualif.setSchedule("Afternoon");
		
		qualif.verify();
			
		}

	}

