package chapter13;

public class Airplane implements Flyable{

	@Override
	public void takeOff() {
		System.out.println("Airplane takes off");
	}

	@Override
	public void land() {
		System.out.println("Airplane lands");
	}

}
