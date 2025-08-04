package chapter02;

public class crementOperator01 {
	public static void main(String[] args) {
		int num1,num2;
		num1=10;
		num2=20;
		System.out.println("num1 : "+num1);
		System.out.println("num1++ : "+num1++);
		System.out.println("num1 : "+num1);
		System.out.println("──────────────────────────────");
		System.out.println("num2 : "+num2);
		System.out.println("++num2 : "+ ++num2);
		System.out.println("num2 : "+num2);
		System.out.println("──────────────────────────────");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num1++ + ++num2 : "+(num1++ + ++num2));
	}
}