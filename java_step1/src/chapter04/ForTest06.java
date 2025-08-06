package chapter04;

import java.util.Scanner;

public class ForTest06 {
	public static void main(String[] args) {
		//이중for문 예시
		/*
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			if(i!=9)System.out.println("-----------");
		}
		*/ 
		// Scanner로 사용자에게 입력 받아 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("단 입력 : ");
		num = sc.nextInt();
		for (int i = 2; i < 10; i++) {
			System.out.println(num+"*"+i+"="+i*num);
		}
		
		sc.close();
	}
}