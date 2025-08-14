package chapter10;

public class Phone {
	String model;
	String color;

	void powerOn() {
		System.out.println("Power on");
	}

	void powerOff() {
		System.out.println("Power off");
	}

	void bell() {
		System.out.println("Power off");
	}

	void sendVoice(String voice) {
		System.out.println("Message >> " + voice);
	}

	void receiveVoice(String voice) {
		System.out.println("Message << " + voice);
	}

	void hangUp() {
		System.out.println("Connect off");
	}
}
