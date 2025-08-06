package chapter04;

import java.util.Scanner;

public class Example07 {
	/*
	 * 조건 1) Scanner로 입력 받을 것 2) ---------------------- 1. 예금 | 2. 출금 | 3. 잔고 | 4.
	 * 종료 ---------------------- 잔고 0 예금 5000 잔고 5000 출금 1000 잔고 4000 출금 10000 잔고 변경
	 * 없을 것(예외처리 ㄴㄴ)(할 수 있다면 해도 됨) 종료 > 프로그램 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input, temp;
		int account;
		account = 0;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			input = sc.nextLine();
			switch (input) {
			case "1":
				System.out.print("예금액> ");
				temp = sc.nextLine();
				if (isNumeric(temp) && Integer.parseInt(temp) > 0) {
					account += Integer.parseInt(temp);
					System.out.println("현재 잔고> "+account);
				} else {
					System.out.println("잘못 된 입력입니다.");
				}
				break;
			case "2":
				if(account==0) {
					System.out.println("출금이 불가능 합니다.");
					break;}
				System.out.println("출금 가능 액수> "+account);
				System.out.print("출금액> ");
				temp = sc.nextLine();
				if (isNumeric(temp) && Integer.parseInt(temp) > 0 && account - Integer.parseInt(temp) >= 0) {
					account -= Integer.parseInt(temp);
					System.out.println("현재 잔고> "+account);
				} else {
					System.out.println("잘못 된 입력입니다.");
				}
				break;
			case "3":
				;
				System.out.println("잔고> " + account);
				break;
			case "4":
				System.out.println();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (!input.equals("4"));
		System.out.println("프로그램 종료");
		sc.close();
	}

	static boolean isNumeric(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}