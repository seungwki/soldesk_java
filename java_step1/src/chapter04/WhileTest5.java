package chapter04;

import java.util.Scanner;

//while문
public class WhileTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		String input;
		while (true) {
			System.out.print("1. 입력하기 \n 2. 출력하기 \n 3. 삭제하기 \n 4. 끝내기 \n 작업 선택(1~4)");
			input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.println("입력하기");
				break;
			case "2":
				System.out.println("출력하기");
				break;
			case "3":
				System.out.println("삭제하기");
				break;
			case "4":
				System.out.println("끝내기");
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
			if (input.equals("4")) {
				break;
			}
		}
		System.out.println("Good bye !");
		sc.close();
	}
}