package chapter04;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		//Scanner 사용
		//몇 명 성적을 입력 받을지 정수로 학생수를 입력
		//총점, 평균을 실수로 출력
		int std, sum;
		sum = 0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요(1~) : ");
		std= sc.nextInt();
		if(std>=1) {
			for (int i = 0; i < std; i++) {
				System.out.print("점수를 입력하세요("+i+") : ");
				sum += sc.nextInt();
			}
		}
		else {
			System.out.println("수행 할 수 없습니다.");
		}
		
		sc.close();
		avg = 1.0*sum/std;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f",avg);
	}
}
