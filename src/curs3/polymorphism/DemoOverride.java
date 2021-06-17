package curs3.polymorphism;

public class DemoOverride {

	public static void main(String[] args) {
		
		Shape forma = new Shape();
		forma.draw();
		
		Shape cerc = new Circle();
		cerc.draw();
		
		Shape square = new Square();
		square.draw();

	}

}
