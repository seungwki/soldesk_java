package chapter05;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[] numArr;
		numArr = new int[5];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i * 10;
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.printf("%d 번째 요소 >> %d \n", i, numArr[i]);
		}
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		System.out.println(numArr[2]);
		System.out.println(numArr[3]);
		System.out.println(numArr[4]);
	}
}