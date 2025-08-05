package chapter03;

import java.util.Scanner;

public class Example04 {
/*
 * <Switch 구문의 복습>
 * Scanner 사용
 * 사용자로부터 월을 입력 받아 계절을 출력 할 것.
 * 3~5,6~8,9~11,12~2 : 춘하추동
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String season;
		System.out.println("월을 입력하세요(1~12) : ");
		month = sc.nextInt();
		switch (month) {
		case 12:case 1:case 2:season="겨울";break;
		case 3:case 4:case 5:season="봄";break;
		case 6:case 7:case 8:season="여름";break;
		case 9:case 10:case 11:season="가을";break;
		default:season = "해당 없음";break;}
		System.out.println(month+"월의 계절 : "+season);
		sc.close();
	}
}
