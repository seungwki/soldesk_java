package chapter12;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("smart phone turn on");
	}

	@Override
	void turnOff() {
		System.out.println("smart phone turn off");
	}

	@Override
	void charge() {
		System.out.println("charge");
	}

	@Override
	void turnon() {
	}

	@Override
	void turnoff() {
	}

}