package chapter01;

import java.math.BigInteger;

public class OperationCasting2 {
	public static void main(String[] args) {
		int num1;
//		num1 = 12345678900;
		long num2, num3;
		num2 = 12345678900l;
		num3 = 1000; // 내부에선 리터럴1000을 int로 해석하고있다.
		System.out.println("num2 : " + num2);
		System.out.println("num2+3 : " + (num2 + num3));
		BigInteger bigNum1, bigNum2, bigResult;
		bigNum1 = new BigInteger("1234567890123456");
		bigNum2 = new BigInteger("32165498776543200");
		bigResult = bigNum1.add(bigNum2);
		System.out.println("Oh, Big! : "
				+ ""
				+ ""
				+ ""+bigResult);
	}
}