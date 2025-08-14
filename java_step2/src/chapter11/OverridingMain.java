package chapter11;

public class OverridingMain {
	public static void main(String[] args) {
		Child3 ch1 = new Child3();
		System.out.println("Child -> Child");
		System.out.println("Value = "+ch1.value);
		ch1.method();
		System.out.println("-------------------------------");
		//Parent 변수가 Parent 인스턴스 참조
		Parent3 pa1 = new Parent3();
		System.out.println("Parent -> Parent");
		System.out.println("Value = "+pa1.value);
		pa1.method();
		System.out.println("-------------------------------");
		//Parent 변수가 Child 인스턴스 참조(다형적 참조)
		Parent3 pa2 = new Child3();
		System.out.println("Parent -> Child");
		System.out.println("Value = "+pa2.value); // 변수는 오버라이딩(재정의) 되지 않는다.
		pa2.method();//메서드는 오버라이딩 된걸 우선.
		System.out.println("-------------------------------");
		//Child 변수가 Parent 인스턴스 참조
		/*
		Child3 ch2 = (Child3) new Parent3();//컴파일 에러가 없어도, 여기서 막힘
		System.out.println("Child -> Parent");
		System.out.println("Value = "+ch2.value);
		ch2.method();
//		*/
	}
}
