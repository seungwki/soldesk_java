package chapter10;

public class ClassB extends ClassA{
	
	public ClassB(int num1) {
		super();
		System.out.println("Class B Constructor. >> "+num1);
	}
	public ClassB(int num1, int num2) {
		super();
		System.out.println("Class B Constructor. num1 >> "+num1+" num2 >> "+num2);
	}
}