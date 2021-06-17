package curs3;

public class RectangleEncapsulation {
	
	private double length;
	private double width;
	
	public RectangleEncapsulation() {
	}
	
	public RectangleEncapsulation(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	public double setLength(double length) {
		return this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public double setWidth(double width) {
		return this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

	public double calculeazaPerimetru() {
		return (2*length) + (2*width);
	}
	
	public double calculeazaAria() {
		return (length*width);
	}
}

