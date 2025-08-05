package chapter03;

import java.util.Scanner;

public class SwitchCase02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month, day;
		System.out.println("월?(1~12) : ");
		month = sc.nextInt();

		switch (month) {
		case 1 :case 3:case 5 :case 7 :case 8 :case 10 :case 12:
			System.out.println("일?(1~31) : ");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("일?(1~30) : ");
			break;
		default:
			System.out.println("일?(1~28) : ");
		}
		day = sc.nextInt();
		sc.close();
		System.out.println("Date : " + month + "월" + day + "일");

	}
}
