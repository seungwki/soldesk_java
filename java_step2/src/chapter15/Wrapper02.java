package chapter15;

public class Wrapper02 {
	public static void main(String[] args) {
		// Boxing
		Integer num1 = new Integer(5);
		Integer num2 = new Integer(3);
		// 이렇게 안 써도 되니까 권장하지 않고 있는 것이다. 컴파일 에러까진 아니고 IDE에서 제공하는 컴파일 경고 쯤 되겠다.

		// Unboxing
		int int1 = num1.intValue();
		int int2 = num2.intValue();
		
		Integer result1 = num1+num2;//오토언박싱->오토박싱
		System.out.println(result1);
		
		Integer result2 = int1-int2;//오토박싱
		System.out.println(result2);
		
		int result3 = int1*int2;//num1 오토언박싱
		System.out.println(result3);
	}
}