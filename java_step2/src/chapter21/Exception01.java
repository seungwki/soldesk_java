package chapter21;

public class Exception01 {
	public static void main(String[] args) {
		try {//1

			try {//2 // 예외 발생 가능성이 있는 코드

			} catch (Exception e) {// 예외가 발생했을 때 실행되는 코드

			}//catch
		} catch (Exception e) {
			try {

			} catch (Exception e2) {

			}
		}
	}
}
