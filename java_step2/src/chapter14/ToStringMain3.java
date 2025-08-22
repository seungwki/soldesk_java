package chapter14;

public class ToStringMain3 {
	public static void main(String[] args) {
		Car2 car1 = new Car2("car name");
		Dog2 dog1 = new Dog2("Dog name", 313);
		//1. 단순 toString 활용
		System.out.println(car1.toString());
		System.out.println(dog1.toString());
		//2. println 내부에서 toString 활용
		System.out.println(car1);
		System.out.println(dog1);
		//3. Object Polymorphism 활용
		ObjectPrinter.print(car1.toString());
		ObjectPrinter.print(dog1.toString());
	}
}
