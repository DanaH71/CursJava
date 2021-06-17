package curs5.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<Integer, String> mapa = new HashMap<>();
		
		boolean verificaMap = mapa.isEmpty();
		System.out.println("Verifica daca mapa este goala sau nu: " + verificaMap);
		
		mapa.put(200, "Laser");
		
		boolean verificaMap2 = mapa.isEmpty();
		System.out.println("Verifica daca mapa este goala sau nu: " + verificaMap2);
		
		boolean verificaValoare = mapa.containsValue("Laser");
		boolean verificaKey = mapa.containsKey(200);
		System.out.println(verificaKey);
		
		
		
		
	}

}
