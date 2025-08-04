package chapter01;

public class OperationCasting1 {
	public static void main(String[] args) {
		short num1;
		byte num2;
		int num3;
		num1 = 10; num2=20;num3=num1+num2;
		System.out.println("num3 : "+num3);
		System.out.println("sum : "+num1+num2);
		System.out.println("sum : "+(num1+num2));
	}
}