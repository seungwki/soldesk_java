package chapter15;

public class StringImmutable1 {
	public static void main(String[] args) {
		String str1 = "hello";
		str1.concat(" java");//걍... 걍 붙였고, 끝임. 대입하지 않음.str1이라는 인스턴스가 concat을 통해 String을 return 했을 뿐.
		System.out.println("str1 >> " + str1); //str1 >> hello
	}
}