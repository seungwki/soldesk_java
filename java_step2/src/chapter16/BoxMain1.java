package chapter16;

public class BoxMain1 {
	public static void main(String[] args) {
		IntegerBox integerBox = new IntegerBox();
		integerBox.setValue(10);
		Integer int1 = integerBox.getValue();
		System.out.println(int1);
		System.out.println("-----------------------");
		StringBox stringBox = new StringBox();
		stringBox.setValue("Hello");
		String str = stringBox.getValue();
		System.out.println(str);
	}
}