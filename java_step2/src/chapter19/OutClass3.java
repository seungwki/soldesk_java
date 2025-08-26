package chapter19;

public class OutClass3 {
	public void myMethod() {
		// 여기에 지역 클래스 LocalClass 만들고 hello 메서드 호출
		class LocalClass {
			void hello() {
				System.out.println("OutClass3.myMethod().LocalClass.hello()");
			}// hello()
		}// class LocalClass

		new LocalClass().hello();
	}// myMethod()
}