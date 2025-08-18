package chapter13;

public class Cow implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("Cow sound");
	}

	@Override
	public void move() {
		System.out.println("Cow move");
	}

}