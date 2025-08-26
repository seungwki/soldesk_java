package chapter20;

public interface StringConcatorMain {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("--- Making Instance ---");
		StringConcatorImplements con1 = new StringConcatorImplements();
		con1.makeString(s1, s2);
		System.out.println("--- Using Lambda ---");
		StringConcator con2 = (str1, str2) -> System.out.println(str1 + ", " + str2);//매개변수 타입도 생략. 반환이 없으니 중괄호도 생략.
		con2.makeString(s1, s2);
		System.out.println("--- anon inner class ---");
		StringConcator con3 = new StringConcator() {//nameless class
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		con3.makeString(s1, s2);
	}
}