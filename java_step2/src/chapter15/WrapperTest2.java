package chapter15;

//문자로 주어진 변수들의 합을 구하시오.
// 실행 결과는 밑과 같다.
// 두 수의 합 : 30
public class WrapperTest2 {
	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";

		System.out.println("두 수의 합 : " + (Integer.parseInt(str1) + Integer.parseInt(str2)));
	}
}