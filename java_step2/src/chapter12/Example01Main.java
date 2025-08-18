package chapter12;

/*
 * class food를 생성
 * 추상 메서드 void의 eat(), cook() 생성
 * food의 구현체(Pizza)를 만들어 임의의 출력문 만들 것.  
 * */
public class Example01Main {
	public static void main(String[] args) {
		Example01Abstract pizza = new Example01();
		pizza.cook();
		pizza.eat();
		System.out.println("----------------------");
		exMethod1(new Example01());
		exMethod2(new Example01());
	}

	public static void exMethod1(Example01Abstract food) {
		food.cook();
	}

	public static void exMethod2(Example01Abstract food) {
		food.eat();
	}
}
