package chapter02;

import java.util.Scanner;

public class BitTest02 {
	public static void main(String[] args) {
		int num1, num2, result, resultAnd, resultOr, resultXor;
		Scanner sc = new Scanner(System.in);
		System.out.print("input num1 : ");
		num1 = sc.nextInt();
		System.out.println("num1 : " + num1);
		System.out.print("input num2 : ");
		num2 = sc.nextInt();
		System.out.println("num2 : " + num2);
		sc.close();
		result = num1 + num2;
		resultAnd = num1 & num2;
		resultOr = num1 | num2;
		resultXor = num1 ^ num2;
		System.out.println("binary num1 : " + Integer.toBinaryString(num1));
		System.out.println("binary num1 : " + Integer.toBinaryString(num2));
		System.out.println("reslut : " + result);
		System.out.println("reslutAnd : " + resultAnd);
		System.out.println("reslutOr : " + resultOr);
		System.out.println("reslutXor : " + resultXor);
	}
}