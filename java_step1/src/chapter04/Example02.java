package chapter04;

import java.util.Scanner;

public class Example02 {
	// Scanner 사용
	// 입력받은 정수부터 100까지의 합을 출력.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer, start;
		answer = 0;
		System.out.print("정수 입력하기 : ");
		start = sc.nextInt();
		if (start > 100) {
			for (int i = start; i >= 100; i--) {
				answer += i;
			}
		} else {
			for (int i = start; i <= 100; i++) {
				answer += i;
			}
		}
		sc.close();
		System.out.println("Answer : " + answer);
	}
}
