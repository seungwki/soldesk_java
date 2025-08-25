package chapter19;

public class InnerOuter {
	private static int outClassValue;
	private int outInstanceValue;

	// 내부 클래스 : 인스턴스 변수와 비슷하게 생각하면 된다
	class Inner {
		private int innerInstanceValue = 1;

		public void print() {
			System.out.println(innerInstanceValue);// 접근 가능
			System.out.println(outInstanceValue);// 접근 가능
			System.out.println(outClassValue);// 접근 가능
		}
	}

	void print(){
		System.out.println(new Inner().innerInstanceValue);
	}
}