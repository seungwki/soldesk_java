package chapter12;

//추상클래스 phone을 상속받아 (중략) 3개의 클래스 구현
public class SamsungPhone extends Phone {

	public SamsungPhone() {
	}

	public SamsungPhone(String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("Samsung Turn On");
	}

	@Override
	void turnOff() {
		System.out.println("Samsung Turn Off");

	}

	@Override
	void charge() {
		System.out.println("Samsung charge");
	}

	@Override
	void turnon() {
		System.out.println("Samsung Turn On");
	}

	@Override
	void turnoff() {
		System.out.println("Samsung Turn Off");
	}

	void pay() {
		System.out.println("Samsung Pay");
	}

}
