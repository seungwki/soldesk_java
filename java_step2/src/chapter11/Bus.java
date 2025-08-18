package chapter11;

public class Bus extends Vehicle{
	private int busNum = 1004;
	@Override
	public void run() {
		System.out.println("No."+busNum + " bus running.");
	}
}