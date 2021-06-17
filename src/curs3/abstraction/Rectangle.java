package curs3.abstraction;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (2*length) + (2*width);
	}

	@Override
	public void printStatement() {
		// TODO Auto-generated method stub
		
	}

}
