package chapter03;

import java.util.Scanner;

public class Example03 {
	/*
	 * Scanner로 세 개의 정수를 받아, 각 정수를 변의 길이로 하는 삼각형을 만들 수 있는지 판별 하시오.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("side length 1 : ");
		num1 = sc.nextInt();
		max = num1;
		System.out.print("side length 2 : ");
		num2 = sc.nextInt();
		if (max < num2) {
			max = num2;
		}
		System.out.print("side length 3 : ");
		num3 = sc.nextInt();
		if (max < num3) {
			max = num3;
		}

		if (num1 + num2 + num3 - max <= max) {
			System.out.println("It is impossible");
		} else {
			System.out.println("It is possible");
		}
		sc.close();
	}
}