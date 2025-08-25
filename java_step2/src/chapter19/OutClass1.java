package chapter19;

public class OutClass1 {
	// static nested class 만들어보쇼 이름은 NestedClass
	static class NestedClass {
		public void hello() {
			System.out.println("NestedClass.hello()");
		}
	}
}