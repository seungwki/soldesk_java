package chapter21;

public class Exception10 {
	public static void main(String[] args){
		method1();
	}

	private static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Method 1 Exception Handling");
			e.printStackTrace();
		}
	}
}