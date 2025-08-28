package chapter15;

// 문자열-배열의 모든 숫자의 합을 구하시오.
// 배열에는 double이 포함될 수도 있다.
// 실행 결과는 밑과 같다.
// sum = 7.0
public class WrapperTest3 {
	public static void main(String[] args) {
		String[] arr = { "1.5", "2.5", "3.0" };
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Double.parseDouble(arr[i]);
		}
		System.out.printf("sum = %.1f", sum);
	}
}