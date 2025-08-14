package chapter10;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone smp = new SmartPhone("플립7", "검정", "daddyking");
		//phone Field
		System.out.println("model >> "+smp.model);
		System.out.println("color >> "+smp.color);
		//S-phone Field
		System.out.println("channel >> "+smp.channel);
		//phone Method
		smp.powerOn();
		smp.powerOff();
		smp.bell();
		smp.sendVoice("Hello");
		smp.receiveVoice("asdasdads");
		smp.hangUp();
		//S-phone Method
		smp.turnOnYTB();
		smp.changeYTB("nasdqwe chan");
		System.out.println("channel >> "+smp.channel);
	}
}