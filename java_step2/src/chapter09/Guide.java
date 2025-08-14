package chapter09;

import java.util.Scanner;
public class Guide {
	public static String point = "호주";

	public Guest[] makeGuestArr(int len) {
		Guest[] gArr = new Guest[len];
		for (int i = 0; i < gArr.length; i++) {
			gArr[i] = new Guest();
		}
		return gArr;
	}

	public void start(Scanner sc) {
		int len;
		String selection;
		boolean run;
		run = true;
		System.out.print("관광객 수 : ");
		len = Integer.parseInt(sc.nextLine());
		System.out.println("관광객 등록");
		Guest[] gArr = makeGuestArr(len);
		for (int i = 0; i < gArr.length; i++) {
			System.out.print((i + 1) + ". 이름 : ");
			gArr[i].setName(sc.nextLine());
			System.out.print((i + 1) + ". 성별 : ");
			gArr[i].setGender(sc.nextLine());
			System.out.println("--------------------------");
		}
		System.out.println();
		while (run) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			selection = sc.nextLine();
			switch (selection) {
			case "1":
				showGuestList(gArr);
				break;
			case "2":
				System.out.print("어디로 변경하시겠습니까? ");
				point = sc.nextLine();
				System.out.println(Guide.point+"로 목적지 변경");
				System.out.println("-----------------------------");
				break;
			case "3":
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("잘못 된 입력입니다. 1 ~ 3의 값을 입력하세요.");
				break;
			}
		}
	}

	private void showGuestList(Guest[] gArr) {
		for (int i = 0; i < gArr.length; i++) {
			System.out.println((i + 1) + ". 이름 : " + gArr[i].getName());
			System.out.println((i + 1) + ". 성별 : " + gArr[i].getGender());
			System.out.println((i + 2) + ". 장소 : " + gArr[i].getPoint());
			System.out.println("--------------------------");
		}
	}
}