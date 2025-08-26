package chapter19;

//익명 크래스
public class AnonymousMain {
	public static void main(String[] args) {
		// Hello의 익명클래스 생성하고 hello() 호출
		Hello hello = new Hello() {
			@Override
			public void hello() {
				System.out.println("H E L L o");
			}// hello()
		};// new Hello()

		hello.hello();
	}// main()
}// AnnonymousMain