package chapter19;

//지역 클래스(지역 변수처럼 쓰인다)
public class LocalOuter2 {
	private int outInstanceVar = 3;

	public void process(int paramVar) {
		// 로칼클래스
		class printer implements Printer {// 로칼클래스의 선언과 동시에 Printer 인터페이스를 구현하고 있다.
			int localVar = 1;

			@Override
			public void print() {
				int value = 88;
				System.out.println("print print " + value);
				System.out.println("print print " + paramVar);
				System.out.println("print print " + localVar);
				System.out.println("print print " + outInstanceVar);
			};
		}
		// 로칼클래스의 인스턴스 생성
		Printer printer = new printer();
		printer.print();
	}

	public static void main(String[] args) {
		new LocalOuter2().process(18942);
	}
}