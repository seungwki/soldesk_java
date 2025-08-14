package chapter10;

//shape 클래스를 상속받는 Circle, Square를 만들고
//draw 메서드 오버라이딩
//그림을 그립니ㄴ다/원을 그립니다 / 네모를 그립니다
public class Example01Main {
	public static void main(String[] args) {
		Shape obj1 = new Shape();
		Circle obj2 = new Circle();
		Square obj3 = new Square();
		obj1.draw();
		obj2.draw();
		obj3.draw();
	}
}
