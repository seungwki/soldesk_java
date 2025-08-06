package chapter04;

import java.util.Scanner;

public class Example08 {
	/*
	 * 조건 1) Scanner로 입력 받을 것 2) ---------------------- 1. 예금 | 2. 출금 | 3. 잔고 | 4.
	 * 종료 ---------------------- 잔고 0 예금 5000 잔고 5000 출금 1000 잔고 4000 출금 10000 잔고 변경
	 * 없을 것(예외처리 ㄴㄴ)(할 수 있다면 해도 됨) 종료 > 프로그램 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run;
		int num1, num2, save, money;
		run = true;
		save = 0;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			num1 = sc.nextInt();
			if (num1 == 1) {
				System.out.println("예금 selected");
				System.out.println("현재 잔고 > " + save);
				System.out.print("input 입금 액수 > ");
				money = sc.nextInt();
				if (money > 0) {
					save += money;
					System.out.println("예금 success. (잔고 " + save + ")");
				} else {
					System.out.println("잘못 된 입력(예금)");
				}
			} else if (num1 == 2) {
				if (save <= 0) {
					System.out.println("출금이 불가능합니다.");
				} else {
					System.out.println("출금 selected");
					System.out.println("현재 잔고 > " + save);
					System.out.print("input 입금 액수 > ");
					money = sc.nextInt();
					if (save <= 0 || save < money) {
						System.out.println("비정상적 입력입니다.");
					} else {
						System.out.println("출금에 성공했습니다.");
						save -= money;
					}
				}
			} else if (num1 == 3) {
				System.out.println("잔고 selected");
				System.out.println("현재 잔고 > " + save);
			} else if (num1 == 4) {
				System.out.println("종료 selected");
				run = false;
				break;
			} else {
				System.out.println("잘못 된 입력입니다.");
			}
			System.out.println("1. 초기 메뉴 2. 종료");
			num2 = sc.nextInt();
			if (num2 == 2) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}