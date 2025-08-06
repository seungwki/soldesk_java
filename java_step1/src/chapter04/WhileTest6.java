package chapter04;

//while문
public class WhileTest6 {
	public static void main(String[] args) {
		int num, sum;
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		} while (num<=10);
		System.out.println("sum of 1 to 10 : " +sum);
	}
}