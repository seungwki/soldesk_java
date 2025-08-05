package chapter03;

import java.util.Scanner;

public class Example01 {
	// 정처기 과목(전체 5과목) 별 정답 갯수를 int로 받으시오(Scanner 클래스 사용 할 것)
	// 소프트웨어 설계, 소프트웨어 개발, 데이터베이스, 프로그래밍 언어, 운영체제(soft1, soft2, db, pro, os)
	// 한 과목이라도 8개 미만이거나, 전체 갯수가 60개 미만일 경우 "불합격" 출력
	// 그렇지 않을 경우 "합격"출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soft1, soft2, db, pro, os, sum;

		System.out.print("정답 갯수 입력(소프트웨어 설계) : ");
		soft1 = Integer.parseInt(sc.nextLine());
		System.out.print("정답 갯수 입력(소프트웨어 개발) : ");
		soft2 = Integer.parseInt(sc.nextLine());
		System.out.print("정답 갯수 입력(데이터베이스) : ");
		db = Integer.parseInt(sc.nextLine());
		System.out.print("정답 갯수 입력(프로그래밍 언어) : ");
		pro = Integer.parseInt(sc.nextLine());
		System.out.print("정답 갯수 입력(정보시스템) : ");
		os = Integer.parseInt(sc.nextLine());
 
		// 최종 결과 판정
		sum = soft1 + soft2 + db + os + pro;
		System.out.println("최종 점수 : " + sum);
		if ((soft1 >= 8 && soft2 >= 8 && db >= 8 && pro >= 8 && os >= 8) && sum >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		sc.close();
	}
}