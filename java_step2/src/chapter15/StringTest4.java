package chapter15;

/*
 * split()을 사용, email의 Id와 domain을 분리.
 * */
public class StringTest4 {
	public static void main(String[] args) {
		String str = "Hello@example.com";
		String[] strArr = str.split("@");
		System.out.println("ID >> " + strArr[0]);
		System.out.println("Domain >> " + strArr[1]);
	}
}