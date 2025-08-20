package chapter15;

public class StringBasicMain3 {
	public static void main(String[] args) {
		String str1 = new String("candy");
		String str2 = new String("candy");
		String str3 = "candy";
		String str4 = "candy";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
	}
}