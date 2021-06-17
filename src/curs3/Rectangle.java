package curs3;

public class Rectangle {
	
	double length;
	double width;
	String name;

	double calculeazaPerimetru() {
		return (2*length) + (2*width);
	}
	
	double calculeazaAria() {
		return (length*width);
	}
}
