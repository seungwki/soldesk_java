package chapter02;

public class LogicTest01 {
	public static void main(String[] args) {
		char chr1, chr2;
		boolean bool1;
		chr1 = 'A';
		chr2 = 'B';
		bool1 = (true || true) && false;
		System.out.println("bool1 : " + bool1);
		bool1 = chr1 < chr2 && (chr1 == chr2);
		System.out.println("bool1 : " + bool1);
		bool1 = chr1 < chr2 || (chr1 == chr2);
		System.out.println("bool1 : " + bool1);
	}
}
