package chapter05;

public class Example01 {
	public static void main(String[] args) {
		// 배열을 순회하며 최대값을 찾아 출력하시오
		int[] numArr;
		numArr = new int[] { 1, 6, 9, 2, 35, 178, 234, 4, 5, 11 };
		int max;
		max = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i])
				max = numArr[i];
		}
		System.out.println("max >> "+max);
	}
}