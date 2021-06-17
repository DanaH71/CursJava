package curs3;

public class RoomCalculator {

	public static void main(String[] args) {
		
		// obiect 1
		
		Rectangle room1 = new Rectangle();
		room1.name = "Bucatarie";
		room1.length = 25;
		room1.width = 12;
		System.out.println("Perimetrul " + room1.name + " este : " + room1.calculeazaPerimetru());
		
		// obiect 2
		
		Rectangle room2 = new Rectangle();
		room2.name = "Baie";
		room2.length = 8;
		room2.width = 3;
		System.out.println("Perimetrul " + room2.name + " este : " + room2.calculeazaPerimetru());
		

	}

}
