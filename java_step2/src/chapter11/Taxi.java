package chapter11;

public class Taxi extends Vehicle {
	private int taxiNum = 1005;

	@Override
	public void run() {
		System.out.println("No." + taxiNum + " taxi running.");
	}
}