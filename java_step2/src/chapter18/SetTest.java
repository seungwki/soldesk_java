package chapter18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//중복값을 제거하고 값을 출력하쇼
//{30,20,20,10,10}
public class SetTest {
	public static void main(String[] args) {
		int[] arr = { 30, 20, 20, 10, 10 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}