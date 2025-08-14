package chapter11;

public class PolymophMain01 {
	public static void main(String[] args) {
		// 부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent01 p1 = new Parent01();
		p1.parentMethod();
		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> Child");
		Child01 c1 = new Child01();
		c1.parentMethod();
		c1.childMethod();
	// 이 밑으론 다형적 참조
		// 부모 변수가 자식 인스턴스 참조
		System.out.println("Parent-> Child");
		Parent01 p2 = new Child01();
		p2.parentMethod();
		//p2.ChildMethod(); //안된다
		System.out.println(p2.getClass());
		System.out.println(p2 instanceof Child01);
		System.out.println(p2 instanceof Parent01);
		// 자식 변수가 부모 인스턴스 참조
		System.out.println("Child-> Parent");
//		Child c2 = new Parent01(); //안된다
		System.out.println("안된다");
	}
}