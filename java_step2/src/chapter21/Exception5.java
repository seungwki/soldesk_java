package chapter21;

public class Exception5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(3/0);//엄;
			System.out.println(4);//실행 안 됨
		} catch (Exception e) {
			System.out.println(5);//준식
		}
		System.out.println(6);
	}
}
