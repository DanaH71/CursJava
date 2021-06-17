package HW5;

import java.util.HashMap;
import java.util.Map;

public class ColorMap {
	
		public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<>();
		
		boolean verificaMap = mapa.isEmpty();
		System.out.println("Verifica daca mapa este goala sau nu: " + verificaMap);
		
		mapa.put(1, "Verde");
		mapa.put(2, "Rosu");
		
		boolean verificaMap2 = mapa.isEmpty();
		System.out.println("Verifica daca mapa este goala sau nu: " + verificaMap2);
		
		boolean verificaValoare = mapa.containsValue("Verde");
		System.out.println(verificaValoare);
	
		int verificaDimensiune = mapa.size();
		System.out.println(verificaDimensiune);
		
		String obtineElement2 = mapa.get(2);
		System.out.println(obtineElement2);
		
		
		
		Map<Integer, String> mapa2 = new HashMap<>();
		
		mapa2.put(1, "Albastru");
		mapa2.put(2,  "Negru");
		mapa2.put(3,  "Portocaliu");
		
		mapa.putAll(mapa2);
		
		System.out.println("Mapa finala contine: " + mapa.size());
		
	}

}
