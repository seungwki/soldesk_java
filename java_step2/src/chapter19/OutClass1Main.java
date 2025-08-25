package chapter19;

public class OutClass1Main {
	public static void main(String[] args) {
		OutClass1.NestedClass oc = new OutClass1.NestedClass();
		oc.hello();
//		Object obj = new OutClass1.NestedClass();
		new OutClass1.NestedClass().hello();
//		oc.NestedClass().hello();//안됨
	}
}