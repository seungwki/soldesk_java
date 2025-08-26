package chapter19;

public class OutClass2 {
	// Inner Class 내부 클래스 만들고 hello 메서드 만들기
	class Inner {
		public void hello() {
			System.out.println("Out2.Inner.hello()");
		}
	}
}