package HW5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CarsSet {

	public static void main(String[] args) {
		
		Set<String> cars = new HashSet<String>();
		
		cars.add("Opel");
		cars.add("Ford");
		cars.add("Dacia");
		cars.add("Volkswagen");
		cars.add("Volvo");
		cars.add("Kia");
		
		
		boolean verificaSet = cars.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet);
				
		System.out.println(cars);
		
		System.out.println("Nr masini in set este :" + cars.size());
		
		cars.remove("Dacia");
		
		System.out.println("Nr actualizat de masini in set :" + cars.size());
		
		Iterator<String> it = cars.iterator();
		while(it.hasNext()){
		System.out.println(it.next());
		}
	}

}
