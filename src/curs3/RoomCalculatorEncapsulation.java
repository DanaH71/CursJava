package curs3;

public class RoomCalculatorEncapsulation {

	public static void main(String[] args) {
		
		
		// obiect 1 - constructor cu parametri
		RectangleEncapsulation room1 = new RectangleEncapsulation(22, 34);
		System.out.println("Perimetrul camerei este :" + room1.calculeazaPerimetru());
		
		
		//obiect 2 - cu default constructor
		RectangleEncapsulation room2 = new RectangleEncapsulation(12, 25);
		//room2.setWidth(12);
		//room2.setLength(25);
		System.out.println("Perimetrul camerei nr 2 este :" + room2.calculeazaPerimetru());
		
		double perimetruTotal = room1.calculeazaPerimetru() + room2.calculeazaPerimetru();
		System.out.println("Perimetrul total este :" +perimetruTotal);
			
	}
}

