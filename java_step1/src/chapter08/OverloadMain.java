package chapter08;

public class OverloadMain {
	public static void main(String[] args) {
		Overload obj1 = new Overload();
		Overload obj2 = new Overload(15,156f);
		Overload obj3 = new Overload("초음",16,155f);
		obj1.showInfo();
		obj2.showInfo();
		obj3.showInfo();
	}
}