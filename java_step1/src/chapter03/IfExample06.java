package chapter03;

import java.util.Scanner;

public class IfExample06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("1. 첫번째 수 : ");
		num1 = Double.parseDouble(sc.nextLine());
		System.out.println("입력받은 수 : "+num1);
		
		System.out.print("2. 두번째 수 : ");
		num2 = Double.parseDouble(sc.nextLine());
		System.out.println("입력받은 수 : "+num2);
		sc.close();
		
		if(num2 != 0) {
			System.out.println("나눈 값 : "+(num1/num2));
		}else {
			System.out.println("Div-0-Error!");
		}
	}
}