package chapter04;

import java.util.Scanner;

public class Example06 {
	/*
	 * 사용자에게 메세지를 입력 받아 출력하기 no를 입력하면 종료 scanner 사용
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		do {
			System.out.println("메세지를 입력하세요");
			System.out.println("종료하려면 no를 입력하세요.");
			message = sc.nextLine();
			if (!message.equals("no"))
				System.out.println("사용자 : " + message);
		} while (!message.equals("no"));
		System.out.println("Good bye !");
		sc.close();
	}
}