package chapter04;

public class ForTest04 {
	public static void main(String[] args) {
		int num, total;
		total = 0;
		for (num = 0; num < 101; num++) {
			if (num % 2 != 0)
				total += num;
		}
		System.out.println("0~100까지 홀수값의 합 : " + total);
		System.out.println("-------------------------------------");
		System.out.println("0~100까지 홀수");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			if (i % 20 == 19) {
				System.out.println();
			}
		}
	}
}