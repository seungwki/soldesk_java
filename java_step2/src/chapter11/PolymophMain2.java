package chapter11;

public class PolymophMain2 {
	public static void main(String[] args) {
		Child2 c1 = new Child2();
		c1.method1();
		c1.method2();
		c1.method3();
		System.out.println(c1.getClass());
		System.out.println("--------------");
		Parent2 p1 = c1;
		p1.method1();
		p1.method2();//컴파일 시점의 IDE에서는 parent2의 method2라고 뜬다
		//실행은 child2에서 오버라이드 된 메서드가 실행된다.
		// p1.method3();//안된다

		System.out.println(p1.getClass());

	}
}