package chapter10;

public class SmartPhone extends Phone {
	String channel;

	public SmartPhone(String model, String color, String channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnYTB() {
		System.out.println("Turn On Youtube.");
	}

	void changeYTB(String channel) {
		this.channel = channel;
		System.out.println("Change Youtube >> " + channel);
	}
}