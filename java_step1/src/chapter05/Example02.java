package chapter05;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		///*
		int[] numArr;
		numArr = new int[] { 10, 3, 2, 1, 4, 8, 7, 9, 5, 6 };
		// 숫자를 입력 받아 해당 숫자의 인덱스를 출력하기.
		// 인덱스를 찾을 수 없을 경우 "찾을 수 없음"을 출력
		int i;
		String target;
		System.out.print("탐색 대상을 입력하시오(1~10) >> ");
		target = sc.nextLine();
		sc.close();
		for (i = 0; i < numArr.length; i++) {
			if (target.equals("" + numArr[i])) {
				System.out.println("Index >> " + i);
				break;
			}
		}
		if (i == numArr.length) {
			System.out.println("찾을 수 없음");
		}
		//*/
	}
}