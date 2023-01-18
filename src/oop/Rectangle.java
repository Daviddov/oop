package oop;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getPramiterRec() {
		return (width + height) * 2;
	}
	
	public double getSorfaceRec() {
		return width * height;
	}
	
}
