package chapter06;

public class MethodTest04 {
	public static void main(String[] args) {
		double result1 = add(35.2, 37.4);
		int result2 = add(35, 34);
		System.out.println("double : "+result1);
		System.out.println("integer : "+result2);
	}

	public static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

	//매개변수 시그니쳐 (순서, 종류, 타입 등이 중요하지 메서드의 이름은 문제 없다)
	//오버로딩(이름이 겹칠 경우 하는 말)
	public static double add(double num1, double num2) {
		double result;
		result = num1 + num2;
		return result;
	}
}