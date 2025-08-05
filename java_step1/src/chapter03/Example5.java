package chapter03;

import java.util.Scanner;

public class Example5 {
	/*
	 * Scanner 사용 사용자로부터 등급을 입력 받아 해당 등급에 따른 고객 출력 A, a -> 최우수 고객 B, b -> 우수 고객 나머지
	 * -> 일반 고객
	 */
	public static void main(String[] args) {
		String user, input;
		Scanner sc = new Scanner(System.in);
		System.out.println("등급을 입력하세요(A(a), B(b), etc)");
		input = sc.nextLine();
		switch (input.toLowerCase().charAt(0)) {
		case 'a':
//		case 'A':
			user = "최우수 고객";
			break;
		case 'b':
//		case 'B':
			user = "우수 고객";
			break;
		default:
			user = "일반 고객";
			break;
		}
		sc.close();
		System.out.println(input + "에 해당하는 고객 : " + user);
	}
}
