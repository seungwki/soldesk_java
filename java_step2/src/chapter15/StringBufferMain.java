package chapter15;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Nice Day");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		sb.insert(0,"lenny ");
		System.out.println(sb);
		
		sb.insert(12," qwe qweqw  !!!! ");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
	}
}