package chapter15;

public class Wrapper03 {
	public static void main(String[] args) {
		// Boxing
		Integer num1 = new Integer(100);
		Integer num2 = new Integer(200);// 이렇게 쓰지 마시고
		Integer num3 = Integer.valueOf(300);// 이렇게 쓰십시오

		Integer total1 = num1 + num2;// auto-unboxing->auto-boxing.
		Integer total2 = num2 + num3;// auto-unboxing->auto-boxing.
		// num1, num2는 주소값이다. 하지만 내용물을 자동으로 꺼내서 계산해서, 그 결과를 다시 Integer로 담아준다.

		System.out.println(total1);
		System.out.println(total2);

		//Unboxing : intValue()
		int value1 = num1.intValue();
		int value2 = num2.intValue();
		int value3 = num3.intValue();

		Integer total3 = value1 + value2;
		Integer total4 = value2 + value3;
		System.out.println(total3);
		System.out.println(total4);
	}
}