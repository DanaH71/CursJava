package curs5.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		//cream un obiect generic de tip set

		Set<String> se = new HashSet<String>();
		
		boolean verificaSet = se.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet);
		
		se.add("Laser");
		
		boolean verificaSet2 = se.isEmpty();
		System.out.println("Verifica daca setul este gol sau nu: " + verificaSet2);
		
		System.out.println("Nr elemente in set :" + se.size());
		
		se.add("laser");
		
		System.out.println(se);
		
		System.out.println("Noul nr elemente in set :" + se.size());
		
		se.remove("laser");
		
		System.out.println("Si mai noul nr elemente in set :" + se.size());
	
		System.out.println(se);
	}

}
