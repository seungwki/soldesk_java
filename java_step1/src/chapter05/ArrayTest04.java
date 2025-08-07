package chapter05;

public class ArrayTest04 {
	public static void main(String[] args) {
		int[] numArr1;
		numArr1 = new int[8];
		int sum;
		sum = 0;
		for (int i = 0; i < numArr1.length; i++) {
			numArr1[i] = (int) (Math.random() * 6) + 1;
			sum += numArr1[i];
		}
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println("\nsum >> " + sum);
		System.out.println("avg >> " + (1.0 * sum / numArr1.length));
	}
}