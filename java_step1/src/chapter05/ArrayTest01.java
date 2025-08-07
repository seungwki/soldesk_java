package chapter05;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 배열 선언
		int[] numArr1;
		numArr1 = new int[10];
//		int numArr2[];
//		numArr2 = new int[10];
//		int[] numArr3 = new int[] { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2 };
//		int[] numArr3 = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2 };//new int[]는 생략 가능
		int sum;
		sum = 0;
		for (int i = 0; i < numArr1.length; i++) {
			numArr1[i] = (int) (Math.random() * 6) + 1;
			sum += numArr1[i];
		}
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i]+" ");
		}
		System.out.println("\nsum >> "+sum);
		System.out.println("avg >> "+(1.0*sum/numArr1.length));
	}
}