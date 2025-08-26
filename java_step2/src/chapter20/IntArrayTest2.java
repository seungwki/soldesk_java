package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntArrayTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// 배열 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 스트림을 활용하여 forEach로 출력
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		System.out.println();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Iterator<Integer> iter = list.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println(sum);
		System.out.println("===================");
		sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("========== stream =========");
		//mapToInt() : 요소를 가져와 Int로 변환. IntStream처럼 만든다
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);

	}
}