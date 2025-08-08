package chapter06;

public class Rectangle {
//사각형 넓이를 계산하는 메서드 calcArea를 오버로딩하여, 가로+세로 길이 또는 한 변의 길이만 받아 계산하시오.
//타입은 double, 객체 이름은 rectangle로 하시오.
	double width;
	double height;
	double area;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
		calcArea(width, this.height);
	}

	public void setHeight(double height) {
		this.height = height;
		calcArea(this.width, height);
	}

	double calcArea(double width) {
		this.area = width * width;
		return width * width;
	}

	double calcArea(double width, double height) {
		this.area = width * height;
		return width * height;
	}

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		calcArea(width, height);
	}

	public Rectangle(double width) {
		this.width = width;
		this.height = width;
		calcArea(width);
	}

}
