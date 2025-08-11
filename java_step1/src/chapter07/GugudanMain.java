package chapter07;

import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Gugudan ggd = new Gugudan();
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("단(2 이상) >> ");
		num1 = sc.nextInt();
		System.out.print("반복(1 이상) >> ");
		num2 = sc.nextInt();
		ggd.show_ggd(num1,num2);
		sc.close();
	}
}