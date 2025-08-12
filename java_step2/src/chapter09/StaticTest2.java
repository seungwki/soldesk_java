package chapter09;

class test{
	int num1;
	static int num2;
}

public class StaticTest2 {
	public static void main(String[] args) {
		test obj1 = new test();
		test obj2 = new test();
		obj1.num1 = 10;
		obj2.num2 = 20;
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
	}
}