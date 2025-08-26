package chapter21;

public class Exception8 {
	public static void main(String[] args) {
		//예외처리 강제하지 않음
		throw new RuntimeException();//Runtime Exception이라 굳이 컴파일 단계에서 잡아 줄 필요가 없음
	}
}