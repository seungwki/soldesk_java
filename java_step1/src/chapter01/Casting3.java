package chapter01;

public class Casting3 {
	public static void main(String[] args) {
		double num1;
		num1 = 1.5;
		int num2, temp;
		num2 = 0;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("------------------");
		temp = (int)num1;
		System.out.println("temp : "+temp);
		System.out.println("------------------");
		double num3, num4, diff;
		num3 = 1.5; num4 = 1.5;
		System.out.println(num3==num4);
//		double diff;
//		diff = num1 - num2;
//		num1 = num2;
//		System.out.println(diff);
//		System.out.println(diff==num1);
	}
}
