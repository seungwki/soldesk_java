package chapter12;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("This is desktop display()");
	}

	@Override
	public void typing() {
		System.out.println("This is desktop typing()");
	}

}
