package chapter18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {
	public static void main(String[] args) {
		run(new HashSet<String>());//정렬 엉망
		run(new LinkedHashSet<String>());//입력순
		run(new TreeSet<String>());//정렬 됨
	}

	public static void run(Set<String> set) {
		System.out.println("set >>" + set.getClass());
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("1");
		set.add("3");
		set.add("2");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
}