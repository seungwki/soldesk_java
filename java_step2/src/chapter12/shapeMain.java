package chapter12;

public class shapeMain {
	public static void main(String[] args) {
//	Shape shape = new Shape(); // <<<불가능
	Circle circle = new Circle(4.5);
	System.out.println(circle.calcArea());
	}
}