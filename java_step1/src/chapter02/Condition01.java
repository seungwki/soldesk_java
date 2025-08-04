package chapter02;

public class Condition01 {
	public static void main(String[] args) {
		int num1, num2;
		boolean bool1;
		num1 = 10;
		num2 = 15;
		bool1 = num1 >= num2 ? true : false;
		System.out.println("bool1 : " + bool1);
		num1 = 10;
		num2 = 20;
		char chr1;
		chr1 = (++num1 == num2) ? 'Y' : 'N';
		System.out.println("chr1 : " + chr1);
	}
}