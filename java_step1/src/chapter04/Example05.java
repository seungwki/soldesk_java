package chapter04;

public class Example05 {
	public static void main(String[] args) {
		// 홀수 구구단 출력
		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1)
				System.out.print("[" + i + "단]\t");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					if (j % 2 == 1) {
					System.out.print(j + "*" + i + "=" + i * j + "\t");
				}
			}
			System.out.println();
		}
	}
}
