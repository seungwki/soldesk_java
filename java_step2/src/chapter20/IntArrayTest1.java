package chapter20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		IntStream stream = Arrays.stream(arr);// 배열 -> 스트림으로 변환
		int a = stream.sum();
		System.out.println(a);

		System.out.println(Arrays.stream(arr).sum());
		int count = (int) Arrays.stream(arr).count();// long 반환
		System.out.println(count);

		int count2 = (int) Arrays.stream(arr).count();
		// reduce(초기값, (누적값(accumulate), 현재값) -> 연산)
		// 뭔 말이냐면 현재값 << stream에서 가져옴
		// 누적값 << 진짜 걍 연산을 진행 한 누적값.얘가 return된다.
		int a1 = Arrays.stream(arr).reduce(0, (x, b) -> x + b);
		System.out.println(a1);
	}
}