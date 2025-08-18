package chapter13;

/*
 * Flyable, Animal 인터페이스를 각각 정의하라.
 * Flyable은 takeOff(), land()를 갖는다. Animal은 eat(), sleep()을 갖는다.
 * Airplane, Bird2 클래스를 작성하되, Airplane은 Flyable, Bird2는 Flyable과 Animal을 모두 구현하라.
 * 위의 작성한 것들을 AnimalMain에서 실행하라. 다중상속의 처리를 확인하라.
 * AnimalMain을 제출하시오.
 * */
public class AnimalMain {
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		Bird2 bird = new Bird2();
		System.out.println("========airplane========");
		upDown(airplane);
		System.out.println("========animal bird========");
		bird.eat();
		bird.sleep();
		upDown(bird);
	}

	static void upDown(Flyable fly) {
		fly.takeOff();
		fly.land();
	}
}
