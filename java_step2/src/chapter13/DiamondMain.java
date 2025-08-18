package chapter13;

public class DiamondMain {
	public static void main(String[] args) {
		System.out.println("--------A------------");
		//인터페이스 타입으로 구현한 클래스 참조
		InterfaceA Ia = new Child();
		Ia.methodA();
//		Ia.methodB();//안됨
		Ia.methodCommon();
		System.out.println("--------B------------");
		InterfaceB Ib = new Child();
//		Ib.methodA();//안됨
		Ib.methodB();
		Ib.methodCommon();
		System.out.println("--------C------------");
		Child child = new Child();
		child.methodA();
		child.methodB();
		child.methodCommon();
	}
}