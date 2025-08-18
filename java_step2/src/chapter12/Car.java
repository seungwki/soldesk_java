package chapter12;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void turnOn() {
		System.out.println("Turn On");
	}

	public void turnOff() {
		System.out.println("Turn Off");
	}
	
	//템플릿 메소드(재정의 안 되게 구현)
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
