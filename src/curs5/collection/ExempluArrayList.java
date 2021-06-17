package curs5.collection;

import java.util.ArrayList;

public class ExempluArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Rosu");
		obj.add("Verde");
		obj.add("Albastru");
		obj.add("Negru");
		obj.add("Tara");
		
		//orintam marimea ArrayList
		
		System.out.println("Marimea array list este: " +obj.size());
		
		System.out.println("ArrayList contine :");

		
		//printam continutul ArrayList
		for(String str : obj) {
			System.out.println(str);
			}
		
		//adaugam un element nou la un index dat
				obj.add(0, "Alb");
				System.out.println("Noul ArrayList contine :");
				
		
				
				//stergem un element
				
				obj.remove("Tara");
				
				//printam iar  continutul ArrayList
				for(String str : obj) {
					System.out.println(str);
					}
		}
		
	}


