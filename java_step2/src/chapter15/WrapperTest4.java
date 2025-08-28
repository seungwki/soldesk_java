package chapter15;

/*
 * 주어진 String 변수로 다음과 같은 과정을 거치시오. 
String -> Integer로 변환해서 출력
Integer -> int로 변환해서 출력
int -> Integer로 변환해서 출력
변환 과정에서 오토박싱, 오토언박싱은 사용하지 마시오.

실행 결과
integer1 = 100
intValue = 100
integer2 = 100
*/

public class WrapperTest4 {
	public static void main(String[] args) {
		String str = "100";
		// String -> Integer로 변환해서 출력
		Integer integer1 = Integer.parseInt(str);
		System.out.println("integer1 = " + integer1);
		// Integer -> int로 변환해서 출력
//		int intValue = Integer.valueOf(integer1);//Integer를 반환한다.
		int intValue = integer1.intValue();//int를 반환한다.
		System.out.println("intValue = " + intValue);
		// int -> Integer로 변환해서 출력
		Integer integer2 = Integer.valueOf(intValue);
		System.out.println("integer2 = " + integer2);

	}
}