package chapter12;

public class BeginnerLevel extends PlayLevel {

	@Override
	public void run() {
		System.out.println("slowly run");
	}

	@Override
	public void jump() {
		System.out.println("can't jump");
	}

	@Override
	public void turn() {
		System.out.println("can't turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Beginner Level");
	}

}