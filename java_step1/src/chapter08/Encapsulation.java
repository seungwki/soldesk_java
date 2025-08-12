package chapter08;

public class Encapsulation {
	private int side;
	private int height;
	
	public Encapsulation() {
		side = 0;
		height= 0;
	}
	public int calcArea(int side, int height) {
		this.side = side;
		this.height = height;
		return side*height;
	}
}