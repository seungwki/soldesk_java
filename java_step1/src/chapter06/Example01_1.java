package chapter06;

public class Example01_1 {
	// 문제
	//두 정수를 입력 받아(매개 변수 사용 할 것)
	//그 합을 계산하여 반환하는 메서드를 구현
	//계산 결과를 출력 할 것
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 36;
		num2 = 27;
		//static이 없어진 경우
		Example01_1 ex = new Example01_1();
		result = ex.add(num1, num2);
		System.out.println(result);
	}
	public int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
}
