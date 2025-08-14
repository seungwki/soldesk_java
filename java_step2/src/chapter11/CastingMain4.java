package chapter11;

public class CastingMain4 {
	static void call(Parent01 p) {
		p.parentMethod();
		if(p instanceof Child01) { //instance 타입을 화인하는 용도.
			System.out.println("Child의 인스턴스 맞음");
			Child01 c1 = (Child01) p;
			c1.childMethod();
		}
	}
	public static void main(String[] args) {
		Parent01 p1 = new Parent01();
		System.out.println("Parent 01 호출");
		call(p1);
		System.out.println("--------------------");
		Parent01 p2 = new Child01();
		System.out.println("Parent 02 호출");
		call(p2);
		
	}
}