package chapter13;

public class Bird2 implements Flyable, Animal {

	@Override
	public void eat() {
		System.out.println("Bird eats.");
	}

	@Override
	public void sleep() {
		System.out.println("Bird sleeps.");
	}

	@Override
	public void takeOff() {
		System.out.println("Bird takes off.");
	}

	@Override
	public void land() {
		System.out.println("Bird lands.");
	}

}
