package HW4;

public class Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
	
	public static String nume(String brand) {
		return brand;
		
	}
	
	public static String motorizare(String vitezaMedie) {
		return vitezaMedie;
		
	}

	public static void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina Dacia este 5 si viteza medie atinsa este de 180 km/h");
		
	}

}
