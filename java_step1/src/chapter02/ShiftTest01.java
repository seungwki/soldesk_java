package chapter02;

public class ShiftTest01 {
	public static void main(String[] args) {
		int num1;
		num1 = 0B00000101;//5
		System.out.println("num1 : "+num1);
		System.out.println("Binary num1 : "+Integer.toBinaryString(num1));
		System.out.println("num1 << 2 : "+(num1<<2));
		System.out.println("num1 >> 2 : "+(num1>>2));
	}
}