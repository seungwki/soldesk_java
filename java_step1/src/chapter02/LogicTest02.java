package chapter02;

public class LogicTest02 {
	public static void main(String[] args) {
		int num1;
		int i;
		boolean bool1;
		num1 = 10;
		i = 2;
		bool1 = (i += 2) < 10 && ((num1 += 2) < 10);
		System.out.println("num1 : " + num1);//4
		System.out.println("i : " + i);//12
		System.out.println("bool1 : " + bool1);
		System.out.println("───────────────────────────────────");
		bool1 = (i += 2) < 10 || ((num1 += 2) < 10);//첫 항이 true라서 그 뒤를 연산하지 않는다. 따라서 num1+=2는 실행조차 되지 않아 num1의 값이 변화하지 않는다.
		System.out.println("num1 : " + num1);
		System.out.println("i : " + i);
		System.out.println("bool1 : " + bool1);
		char a = '─';
		System.out.println((int)a);
//		System.out.println('9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472'+'9472');
	}
}
