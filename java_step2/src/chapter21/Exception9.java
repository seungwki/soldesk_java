package chapter21;

public class Exception9 {
	public static void main(String[] args) throws Exception{//Object로 던진다
		method1();
	}

	private static void method1() throws Exception{method2();}//main으로 던진다
	private static void method2() throws Exception{throw new Exception();}//method1로 던진다
}