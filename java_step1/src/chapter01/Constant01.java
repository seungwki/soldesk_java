package chapter01;

public class Constant01 {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		final double PI = 3.14;
		MIN_NUM = 10; //최초 초기화는 가능
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(PI);
//		MIN_NUM = 20; //에러 발생
		System.out.println(MIN_NUM);
	}
}