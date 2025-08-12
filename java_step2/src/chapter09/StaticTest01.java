package chapter09;

public class StaticTest01 {
	String str1 = "일반 회원 변수";
	static String str2 = "static 회원 변수";
	public static String getStatic() {
		return str2;
	}
}