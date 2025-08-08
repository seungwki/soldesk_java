package chapter06;

public class MethodTest06 {
	public static void main(String[] args) {
		String str1, str2, str3;
		str1 = "펭은 언제 상향해주냐";
		str2 = "딜캐도 약하고 시동기도 구리고";
		str3 = "하단 막고 딜캐만 해줘도 할거 없는데";
		System.out.println(getStringLength(str1));
		System.out.println(getStringLength(str2));
		System.out.println(getStringLength(str3));
	}

	public static int getStringLength(String str) {
		return str.length();
	}
}