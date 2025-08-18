package chapter12;

public class PhoneMain02 {
	public static void main(String[] args) {
		IPhone ph1 = new IPhone();
		SamsungPhone ph2 = new SamsungPhone();

		ph1.turnon();
		ph2.turnon();
		System.out.println("===============");
		ph1.charge();
		ph2.charge();
		System.out.println("===============");
		ph1.takepic();
		ph2.pay();
		System.out.println("===============");
		ph1.turnoff();
		ph2.turnoff();
	}
}
