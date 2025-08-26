package chapter20;

public class MyNumberMain {
	public static void main(String[] args) {
		System.out.println("----- Using lambda -----");
		int a, b;
		a = 10;
		b = 20;
		MyNumber max1 = (x, y) -> (x >= y ? x : y);// 인터페이스에 추상메서드가 1개만 있어서 람다로 처리 가능
		System.out.println(max1.getMax(a, b));//자동으로 매핑이 된 모습이다
		System.out.println("----- Using anon class -----");
		MyNumber max2 = new MyNumber() {
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		max2.getMax(a, b);
		System.out.println("----- Using lambda -----");
		System.out.println("----- Using lambda -----");
	}
}