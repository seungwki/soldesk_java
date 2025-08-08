package chapter06;

public class Example02 {
	/*
	 * 덧셈(add) 뺄셈(substract) 구현하되, 정수와 실수에 대해 오버로딩 하시요 
	 * */
	public static void main(String[] args) {
		int int1, int2;
		double dbl1, dbl2;
		int1 = 24;
		int2 = 14;
		dbl1 = 3.5;
		dbl2 = 2.8;
		System.out.println(add(int1, int2));
		System.out.println(add(dbl1, dbl2));
		System.out.println(substract(int1, int2));
		System.out.println(substract(dbl1, dbl2));
	}
	public static int add(int num1, int num2)					{int result;	result = num1 + num2;	return result;}
	public static double add(double num1, double num2)			{double result;	result = num1 + num2;	return result;}
	public static int substract(int num1, int num2)				{int result;	result = num1 - num2;	return result;}
	public static double substract(double num1, double num2)	{double result;	result = num1 - num2;	return result;}
}
