package chapter15;

/*
 * java를 jvm으로 변경
 * */
public class StringTest3 {
	public static void main(String[] args) {
		String input = "hello java spring jpa java";
		System.out.println(input.replace("java","jvm"));
	}
}