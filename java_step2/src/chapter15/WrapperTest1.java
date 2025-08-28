package chapter15;

public class WrapperTest1 {
	public static void main(String[] args) {
		System.out.println("------ Q1 ------");
		Integer num1 = 5; //오토 박싱
		Integer num2 = 10; //오토 박싱
		System.out.println(num1 + num2); //오토 언박싱
		
		System.out.println("------ Q2 ------");
		Integer num3 = 5; //오토 박싱
		int num4 = num3; //오토 언박싱
		System.out.println(num4);
		
		System.out.println("------ Q3 ------");
		int num5 = 20; //ㄴㄴ
		Integer num6 = num5; //오토박싱
		System.out.println(num6);
		
		System.out.println("------ Q4 ------");
		Integer num7 = 25; //오토 박싱
		int num8 = num7; //오토 언박싱

		System.out.println("------ Q5 ------");
		Integer num9 = Integer.valueOf(300); //우항에서 박싱(오토 아님)
		int num10 = num9.intValue(); //언박싱(오토 아님)
	}
}