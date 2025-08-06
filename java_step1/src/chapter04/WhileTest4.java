package chapter04;

import java.util.Scanner;

//while문
public class WhileTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count, sum;
		count = 0;
		sum = 0;
		// 0을 입력하면 종료하면서 사용자가 입력한 수의 갯수, 합계, 평균을 출력하라.
		while (true) {
			System.out.print("수를 입력하십시오 : ");
			num = sc.nextInt(); 
			if (num == 0) {
				break;
			}
			count++;
			sum += num;
		}
		sc.close();
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
		if (count != 0)
			System.out.printf("avg : %.3f", 1.0 * sum / count);
		else
			System.out.printf("avg : 0");
	}
}