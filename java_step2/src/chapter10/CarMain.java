package chapter10;

public class CarMain {
	public static void main(String[] args) {

		ElectricCar ec = new ElectricCar();
		ec.move();
		ec.charger();
		GasCar gc = new GasCar();
		gc.move();
		gc.fillUp();
	}
}