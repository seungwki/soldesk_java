package chapter02;

import java.util.Scanner;

public class Example03 {
	/*
	 * 문제 : 스캐너 사용할 것. 한 자릿수 숫자를 입력받아 숫자가 짝수인지 홀수인지 출력 하는 프로그램을 조건연산자 사용하여 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.print("1자리 숫자를 입력하시오.");
		while (true) {
			try {
				input = sc.nextInt();
				if (input < 10 && input > -10)
					break;
			} catch (Exception e) {
				sc.next();
			}
			System.out.print("1자리 숫자를 입력하시오.");
		}
		String result;
		result = input % 2 == 1 ? "Odd" : "Even";
		System.out.println("The number is... " + result);
		sc.close();
	}
}
