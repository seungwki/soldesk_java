package chapter04;

public class Example01 {
	public static void main(String[] args) {
		// 1~100 사이 3의 배수의 합 계산
		int sum;
		sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("Answer : " + sum);
	}
}