package chapter15;

public class StringBasicMain2 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = " java";
		String result1 = str1.concat(str2);
		String result2 = str1+str2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result2==result1);
	}
}
