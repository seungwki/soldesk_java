package chapter02;

import java.util.Iterator;

public class OperatorTest02 {
	public static void main(String[] args) {
		int a1, a2;
		a1 = 5;
		a2 = 2;
		double resultList[] = new double[6];
		resultList[0] = (double) a1 + a2;
		resultList[1] = (double) a1 - a2;
		resultList[2] = (double) a1 / a2;
		resultList[3] = (double) a1 * a2;
		resultList[4] = (double) a1 % a2;
		for (int i = 0; i < resultList.length; i++) {
			System.out.println("결과 " + i + " : " + resultList[i]);
		}
	}
}
