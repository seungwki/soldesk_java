package chapter11;

public class DriverMain {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(new Bus());

	}
}