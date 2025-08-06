package chapter04;

public class ForTest02 {
	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int i = 0; i < 101; i++) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.println("Sigma(1 to 100) : " + sum);
	}
}