package chapter15;

public class Example01 {
	public static void main(String[] args) {
		/*
		String str = "";
		 * for (int i = 0; i <=100; i++) { str += i; }//this is 메모리 박살 //
		 */
		// 위 코드를 더 효과적으로 만드시오.
		// StringBuilder와 StringBuffer의 가장 큰 차이는 thread Safety이며, 성능 상의 큰 차이는 없다. Buffer 사용을 권장한다.
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(sb);//toString 사용을 권장한다.
	}
}