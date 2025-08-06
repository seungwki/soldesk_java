package chapter04;

import java.util.Scanner;

//while문
public class WhileTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		while (true) {
			System.out.println("점수 입력 : ");
			score = sc.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("탈출");
				break;
			} else if (score >= 60) {
				System.out.println("합격");
				break;
			} else {
				System.out.println("불합격");
				break;
			}
		}
		sc.close();
	}
}