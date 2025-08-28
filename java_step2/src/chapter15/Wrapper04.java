package chapter15;

public class Wrapper04 {
	public static void main(String[] args) {
		Integer num1 = 100; // Boxed state.
		int num2 = num1.intValue();// Unboxed state.

		int jNum = 200;
		int sum = jNum + num2;
		System.out.println(sum);

		int total1 = num1 + jNum;// 오토언박싱
		System.out.println(total1);

		Integer i = jNum;// 오토박싱
		System.out.println(i);
	}
}