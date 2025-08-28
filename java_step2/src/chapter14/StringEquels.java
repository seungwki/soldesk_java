package chapter14;

public class StringEquels {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		// 내용비교 x,물리적 동일성(==인스턴스의 메모리 주소가 같은지) 체크함)
		System.out.println(str1 == str2);
		// 내용 비교 o == 인스턴스의 논리적 동일성을 체크함.
		System.out.println(str1.equals(str2));
		String str3 = "test";
		String str4 = "test";
		System.out.println(str3 == str4);// 물리적으로 같다.
		System.out.println(str1 == str3);// 물리적으로 다르다.
		System.out.println(str2 == str3);// 물리적으로 다르다.
		System.out.println("=====================");
		System.out.println(str3.equals(str1));// 논리적으로 같다.
		System.out.println(str3.equals(str2));// 논리적으로 같다.
		System.out.println(str3.equals(str4));// 논리적으로 같다.

		// equels는 "논리적 동일성"을 체크한다.
		// 사용자는 클래스를 정의하면서 이 동일성을 도출하는 "논리"를 Overriding 할 수 있다.
		// 현재 사용하는 equels의 논리는 Java에서 자동으로 정의 한 String 클래스의 equels를 사용하고 있는 것이다. 
	}
}