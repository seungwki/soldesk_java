package chapter12;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new ManualCar();
		Car car2 = new AiCar();
		car1.run();
		System.out.println("----------------");
		car2.run();
	}
}
