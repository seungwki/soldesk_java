package chapter12;

public class Circle extends Shape {
	private double radius;
//	final double pi = 3.141592;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	double calcArea() {
//		return pi * radius * radius;
		return Math.PI * radius * radius;
	}

	public double getR() {
		return radius;
	}

	public void setR(int r) {
		this.radius = r;
	}

}