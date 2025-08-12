package chapter08;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car("검정색", 3000);
		System.out.println(car.getColor());
		System.out.println(car.getCc());
		car.setColor("안검정색");
		car.setCc(33);
		System.out.println(car.getColor());
		System.out.println(car.getCc());
	}
}
