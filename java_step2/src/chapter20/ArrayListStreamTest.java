package chapter20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("snack");
		sList.add("jelly");
		sList.add("quick bread");
		sList.add("cookie");
		sList.add("cream");
		Stream<String> ss = sList.stream();

		ss.forEach(s -> System.out.println(s + " "));

		System.out.println("====== sorted ========");
//		ss = ss.sorted();//stream은 재사용이 안된다.
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		//map() : 데이터를 다른 형식으로 mapping. 기존의 데이터에는 영향을 받지 않는다.
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		// filter
		sList.stream().filter(s -> s.length() >= 6).forEach(s -> System.out.println(s));
	}
}