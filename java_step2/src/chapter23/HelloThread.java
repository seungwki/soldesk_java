package chapter23;

public class HelloThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : run()");// return Thread Object.
	}
}