package chapter02;

public class Example01 {
	public static void main(String[] args) {
//		q1) 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동형변환 코드 2가지를 작성
		short num1;
		int num2;
		long num3;
		num1 = 120;
		num2 = num1;
		num3 = num2;
		System.out.println("num1 : " + num1 + ", type : " + ((Object) num1).getClass().getSimpleName());
		System.out.println("num2 : " + num2 + ", type : " + ((Object) num2).getClass().getSimpleName());
		System.out.println("num3 : " + num3 + ", type : " + ((Object) num3).getClass().getSimpleName());
		System.out.println("────────────────────────────────────────────");
//		q2) 실수를 정수형 변수에 대입하는 경우, 소수점 이하 부분이 없어지는 형변환 코드를 작성
		double q2num1;
		int q2num2;
		q2num1 = 10.5;
		q2num2 = (int)q2num1;
		System.out.println("num 1 : "+q2num1);
		System.out.println("num 2 : "+q2num2);
		System.out.println("────────────────────────────────────────────");
//		q3) 더 많은 실수를 표현하기 위해 가수부와 지수부로 비트를 나누어 표현한 방식
		double q3num1;
		float q3num2;
		q3num1 = 10.552;
		q3num2 = 10.553f;
		System.out.println("double : "+q3num1);
		System.out.println("float : "+q3num2);
		System.out.println("────────────────────────────────────────────");
//		q4) 변수 2개를 선언하고 10과 2.5를 대입한 후, 사칙 연산 결과를 정수로만 출력
		int q4num1;double q4num2;
		q4num1 = 10;q4num2 = 2.5;
		System.out.println("+ : "+(int)(q4num1+q4num2));
		System.out.println("- : "+(int)(q4num1-q4num2));
		System.out.println("* : "+(int)(q4num1*q4num2));
		System.out.println("/ : "+(int)(q4num1/q4num2));
		System.out.println("────────────────────────────────────────────");
//		q5) '글"이라는 한글 문자의 유니코드 값을 찾아 char 형으로 선언한 변수에 대입 한 뒤 해당 변수에 출력.
		char q5a;
		q5a = '\uae00';
		System.out.println("int of '글' : "+(int)q5a);
		System.out.println("hex of '글' : "+Integer.toHexString(44544));
		System.out.println("글 유니코드 : \\uae00");
		System.out.println("출력 결과 : "+q5a);
	}
}
