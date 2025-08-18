package chapter12;

public abstract class Phone {
	String owner;

	public Phone() {}

	public Phone(String owner) {
		this.owner = owner;
	}

	abstract void charge();

	abstract void turnOn();

	abstract void turnOff();

	abstract void turnon();

	abstract void turnoff();

	void internetSearch() {
		System.out.println("Internet Search");
	}
}
