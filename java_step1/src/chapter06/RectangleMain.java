package chapter06;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		rect.setHeight(3.4);
		rect.setWidth(3.5);
		double area;
		area = rect.calcArea(rect.width, rect.height);
		System.out.println("Area : "+area);
	}
}