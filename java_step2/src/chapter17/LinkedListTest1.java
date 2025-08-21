package chapter17;

import java.util.LinkedList;

public class LinkedListTest1 {
	public static void main(String[] args) {
		LinkedList<String> ls= new LinkedList<>();
		//추가
		ls.add("A");
		ls.add("B");
		ls.add("C");
		System.out.println(ls);
		ls.add(1, "D");
		System.out.println(ls);
		ls.addFirst("0");
		System.out.println(ls);
		//조회
		System.out.println(ls.get(0));
		System.out.println(ls.get(3));
		//삭제
		System.out.println(ls.removeLast());
		System.out.println(ls);
		//맨 뒤에 G 추가
		ls.addLast("G");
		System.out.println(ls);
	}
}
