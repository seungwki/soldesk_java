package chapter17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(200);
		Iterator<Integer> intIter = intList.iterator();
		System.out.println(intIter.hasNext());
		System.out.println(intIter.next());
		System.out.println(intIter.hasNext());
		System.out.println(intIter.next());
		intList.add(30); // 왜 안되지?
		System.out.println(intIter.next());
//		System.out.println(intIter.hasNext());
//		System.out.println(intIter.next());
//		System.out.println(intIter.hasNext());
//		System.out.println(intIter.next());
	}
}