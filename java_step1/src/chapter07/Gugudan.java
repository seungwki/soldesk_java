package chapter07;

public class Gugudan {
	// 멤버변수 == 필드
	public int num1;
	public int num2;
	public int result;

	// 생성자

	// 메서드
	public void show_ggd(int num1, int num2) {
		for (int j = 1; j <= num2; j++) {
			for (int i = 2; i <= num1; i++) {
				result = i * j;
				System.out.printf("%d * %d = %d\t", i, j, result);
			}
			System.out.println();
		}
	}

	public void show_ggd() {
		show_ggd(this.num1, this.num2);
	}

	public void standard_ggd() {
		show_ggd(9, 9);
	}
}