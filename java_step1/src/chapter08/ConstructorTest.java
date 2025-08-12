package chapter08;

public class ConstructorTest {
	// 멤버변수 == 필드
	private int num1;
	private int num2;
	
	// 생성자
	public ConstructorTest() {}
	public ConstructorTest(int num1, int num2) {this.num1 = num1;this.num2 = num2;}
	
	public static void main(String[] args) {
		ConstructorTest ct1 = new ConstructorTest();
		ct1.num1 = 124;
		ct1.num2 = 455;
		System.out.println(ct1.num1);
		System.out.println(ct1.num2);
		System.out.println("-------------------");
		ConstructorTest ct2 = new ConstructorTest(13,31);
		System.out.println(ct2.num1);
		System.out.println(ct2.num2);
	}
}