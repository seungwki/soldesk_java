package chapter04;

public class ForTest01 {
	public static void main(String[] args) {
		int sum;
//		int i;
//		i = 0;
		sum = 0;
		/*
		 * sum = 1; sum += 2; sum += 3; sum += 4; sum += 5; sum += 6; sum += 7; sum +=
		 * 8; sum += 9; sum += 10; System.out.println(); 이렇게 문제를 푼다면 용진철거에 취직할 수 있다.
		 */
		for (int i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println("Sigma(1 to 10) : " + sum);
		System.out.println("===================");
		for (int i = 0; i < 11; i++) {
			System.out.print(i + "번째 수행 : " + i + ", ");
			if (i % 3 == 2)
				System.out.println();
		}
	}
}