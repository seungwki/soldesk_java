package chapter13;

public class Chicken extends Bird implements Fly {
	@Override
	public void fly() {
		System.out.println("Chicken flys.");
	}

	@Override
	public void sound() {
		System.out.println("doodledoo");
	}

	@Override
	public void move() {
		System.out.println("Chicken moving");
	}
}
