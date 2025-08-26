package chapter19;

//지역 클래스(지역 변수처럼 쓰인다)
public class LocalOuter1 {
	private int outInstanceVar = 3;

	private void process(int paramVar) {
		int locVar = 1;
		// 접근제어자 사용 불가능 : 지역변수니까.
		// 로컬 클래스
		class locPrinter {
			int value = 0;

			public void printData() {
				System.out.println("locPrinter >> " + value);
				System.out.println("locVar >> " + locVar);// 외부 클래스 인자에도 접근 가능
				System.out.println("locPrinter >> " + paramVar);// 해당 메서드의 인자에도 접근 가능(현재 속한 메서드의 로컬변수로 작동 중)
			}
		}
		System.out.println("asdasdasd" + locVar);
		new locPrinter().printData();
	}

	public static void main(String[] args) {
		LocalOuter1 lo = new LocalOuter1();
		lo.process(3);
		lo.process(0);
	}
}