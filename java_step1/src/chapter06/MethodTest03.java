package chapter06;

public class MethodTest03 {
	public static void main(String[] args) {
		int result = add(35,37);
		System.out.println((char)result);
	}
	public static int add(int num1, int num2) {
		int result;
		result = num1+num2;
		return result;
	}
}