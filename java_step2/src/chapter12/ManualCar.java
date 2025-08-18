package chapter12;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("Manual Car Drive");
	}

	@Override
	public void stop() {
		System.out.println("Manual Car Stop");
	}

}
