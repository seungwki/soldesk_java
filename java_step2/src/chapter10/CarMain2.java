package chapter10;

public class CarMain2 {
	public static void main(String[] args) {

		Car2 ec = new ElectricCar2();
		ec.move();
		ec.charge();
		Car2 gc = new GasCar2();
		gc.move();
		gc.charge();
	}
}