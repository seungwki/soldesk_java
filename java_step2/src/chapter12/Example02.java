package chapter12;

public class Example02 {
	// 도서 클래스 Book과, 상속받은 Novel 클래스를 구현할 것.
	// Book 클래스는 String title, abstract read()를 포함.
	// Novel 클래스는 extends Book, read() -> 소설을 읽는 동작을 출력.
}

abstract class Book {
	String title;

	abstract void read();
}

class Novel extends Book {
	@Override
	void read() {
		System.out.println("now reading novel : " + title);
	}
}