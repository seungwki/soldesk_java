package chapter12;

public abstract class Shape {
	
	//메서드에 abstract가 붙은, 추상메서드가 1개 이상 존재해야 한다. 구현된게 있어도 됨.
	abstract double calcArea();// <<<추상 메서드 작성 끝! { } <<< 없음
	
	void display() {
		System.out.println("Display shape");
	}
}