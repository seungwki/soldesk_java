package chapter15;

/*
 * subString() 사용, Hello와 .txt 분리 할 것
 * */
public class StringTest01 {
	public static void main(String[] args) {
		String str= "hello.txt";
		System.out.println(str.substring(0,5));
		System.out.println(str.substring(5,str.length()));
	}
}