package chapter11;

public class Vehicle {
	private static final int price = 100;//정적 상수
	public int vehiclePrice() {
		return Vehicle.price;
	}
	
	public void run() {
		System.out.println("Vehicle run");
	}
}