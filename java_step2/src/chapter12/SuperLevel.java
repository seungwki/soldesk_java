package chapter12;

public class SuperLevel extends PlayLevel {
	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void jump() {
		System.out.println("jump");
	}

	@Override
	public void turn() {
		System.out.println("turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("Super Level");
	}
}