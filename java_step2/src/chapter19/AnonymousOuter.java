package chapter19;

//익명 크래스
public class AnonymousOuter {
	private int outInstanceVar = 3;

	public void process(int paramVar) {
		int localVar = 1;
		Printer printer = new Printer() {// 생성과 동시에 구현.
			// 인터페이스를 구현하였지만 이름이 없기에 익명클래스이다.
			int var = 14;

			@Override
			public void print() {
				System.out.println(var);
				System.out.println(localVar);
				System.out.println(paramVar);
				System.out.println(outInstanceVar);
			}
		};// Printer interface의 구현
		printer.print();
		System.out.println("printer.class >> " + printer.getClass());
	}// process()의 종료

	public static void main(String[] args) {
		new AnonymousOuter().process(142);
	}
}

/*
 * 익명클래스
 * 특정 부모클래스(인터페이스)를 상속 받고 바로 쓰고 버릴 때.
 * 여러번 쓸거같으면 익명으로 안 만들죠
 * 이게 나중에 람다로 이어집니다.
 */