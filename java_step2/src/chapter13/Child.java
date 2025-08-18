package chapter13;

public class Child implements InterfaceA, InterfaceB {
	@Override
	public void methodB() {
		System.out.println("Method B of Child Class");
	}
	@Override
	public void methodA() {
		System.out.println("Method A of Child Class");
	}
	@Override
	public void methodCommon() {
		System.out.println("Method Common of Child Class");
	}

}