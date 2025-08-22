package chapter14;

public class ObjectMain {
	public static void main(String[] args) {
		ObjectTest v1 = new ObjectTest();
		ObjectTest v2 = new ObjectTest();
		v1.setValue("Test");// Obj가 String의 super class이므로 up casting 발생.
		v2.setValue(1);// wrapper class를 통한 auto boxing(up casting) 발생.
		System.out.println(v1.getValue());
		System.out.println(v2.getValue());

	}
}
