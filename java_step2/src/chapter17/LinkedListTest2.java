package chapter17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {
	public static void main(String[] args) {
		List<String> ls1 = new ArrayList<>();
		List<String> ls2 = new LinkedList<>();
		long startTime;
		long endTime;
		long al, ll;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			ls1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		al = endTime - startTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			ls2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		ll = endTime - startTime;

		System.out.println("Array List >> " + al);
		System.out.println("Linked List >> " + ll);
		System.out.println("Ratio >> " + ((double)ll/al)*100);
	}
}
