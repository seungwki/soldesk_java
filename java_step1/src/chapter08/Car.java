package chapter08;

public class Car {
//멤버변수==필드
	private String color;
	private int cc;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color, int cc) {
		super();
		this.color = color;
		this.cc = cc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
