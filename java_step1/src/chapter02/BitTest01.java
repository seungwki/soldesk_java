package chapter02;

public class BitTest01 {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 5; // 101
		num2 = 10; // 1010
		result = num1 | num2;// 1111 == 15
		System.out.println(result);
		result = num1 & num2;// 0000 == 0
		System.out.println(result);
		result = num1 ^ num2;// XOR. 다르면 1. 1111 == 15
		System.out.println(result);
	}
}