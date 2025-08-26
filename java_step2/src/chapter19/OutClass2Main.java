package chapter19;

public class OutClass2Main {
	public static void main(String[] args) {
		OutClass2.Inner oci = new OutClass2().new Inner();
		oci.hello();
//		Object obj = new OutClass2.Inner();
	}
}
