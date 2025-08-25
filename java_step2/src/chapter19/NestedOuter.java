package chapter19;

public class NestedOuter {
	private static int outClassValue = 3;
	private int outInstanceValue = 2;

	static class NestedUm {
//		private int nestedInstanceValue = 1;
		public int nestedInstanceValue = 1;
 		public void print() {
			System.out.println(nestedInstanceValue);
			//자기 멤버 접근 가능
			//바깥 클래스의 인스턴스 멤버 접근 불가능
//			System.out.println(outInstanceValue);//안됨
			//바깥 클래스의 클래스 멤버(static)에는 접근 가능
			System.out.println(outClassValue);//안됨
		}
	}
}