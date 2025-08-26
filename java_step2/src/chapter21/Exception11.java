package chapter21;

public class Exception11 {
	public static void main(String[] args) {
		method1();
		System.out.println("수행 끝");
	}// main

	static void method1() {
		try {
			System.out.println("Method 1 출동!");
			return;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			//예외의 발생과 상관없이 실행된다.
			//try와 catch 모두를 실행하고 무조건 실행된다.
			System.out.println("method1()의 finally 블럭 실행");
		}
	}// method1
}