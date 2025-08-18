package chapter13;

public class InterfaceTestMain {
	public static void main(String[] args) {
//		InterfaceTest iti = new InterfaceTest();//불가능
		InterfaceTest01Implementation Iti = new InterfaceTest01Implementation();
		System.out.println(Iti.getA());
	}
}
