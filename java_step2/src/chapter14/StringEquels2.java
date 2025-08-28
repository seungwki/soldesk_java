package chapter14;

public class StringEquels2 {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = "test";
		// 물리적 동일성
		if (str1 == str2) {
			System.out.println("str1 == str2");
		} else {
			System.out.println("str1 != str2");
		}
		// 논리적 동일성
		if (str1.equals(str2)) {
			System.out.println("str1 equels str2");
		} else {
			System.out.println("str1 not equels str2");
		}

	}
}