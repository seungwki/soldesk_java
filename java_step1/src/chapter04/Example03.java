package chapter04;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		// 정수를 10번 입력 받아 짝수 갯수 출력. 단, 입력이 0일 경우 무시 할 것.
		Scanner sc = new Scanner(System.in);
		int count, input;
		count = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("정수를 입력하세요.(" + i + ") : ");
			input = sc.nextInt();
			if (input % 2 == 0 && input != 0) {
				count++;
			}
		}
		sc.close();
		System.out.println("Answer : " + count);
	}
}
