package chapter06;

public class MethodTest05 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 48;
		num2 = 7;
		System.out.println(add(num1, num2));
		System.out.println(substract(num1, num2));
		System.out.println(multiply(num1, num2));
		System.out.println(divide(num1, num2));
	}

	public static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

	public static int substract(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}

	public static int multiply(int num1, int num2) {
		int result;
		result = num1 * num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		double result;
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			return 0;
		}
		return result;
	}
}