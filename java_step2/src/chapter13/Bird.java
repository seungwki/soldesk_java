package chapter13;

public class Bird extends AbstractAnimal implements Fly{

	@Override
	public void fly() {
		System.out.println("Bird flys.");
	}

	@Override
	public void sound() {
		System.out.println("Tweet");
	}
	
}
