package chapter17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest4 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		System.out.println("size >> "+intList.size());
		intList.add(100);
		intList.add(200);
		intList.add(37);
		intList.add(48);
		intList.add(59);
		intList.add(61);
		System.out.println("size >> "+intList.size());
		System.out.println("get 0 >> "+intList.get(0));
		System.out.println("get 1 >> "+intList.get(1));
		System.out.println(">>>>>>>>>>>>>전체 출력(for)<<<<<<<<<<<<");
		for (Integer i : intList) {
			System.out.println(i);
		}
		System.out.println(">>>>>>>>>>>>>전체 출력(iter)<<<<<<<<<<<<");
		Iterator<Integer> iter = intList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}