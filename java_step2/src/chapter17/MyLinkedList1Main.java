package chapter17;

public class MyLinkedList1Main {
	public static void main(String[] args) {
		MyLinkedList1 ls = new MyLinkedList1();
		System.out.println(ls);
		System.out.println("----------------------");
		ls.add("a");
		ls.add("b");
		ls.add("C");
		ls.add("Q");
		ls.add("A");
		ls.add("EE");
		System.out.println(ls);
		System.out.println("----------------------");
		System.out.println("size >> "+ls.size());
		System.out.println("first >> "+ls.get(1));
		System.out.println("index of C >> "+ls.indexOf("C"));
		System.out.println("index of c >> "+ls.indexOf("c"));
		System.out.println("set 2 z >> "+ls.set(2, 'z'));
		System.out.println(ls);
		System.out.println("-----Dynamic Creation----");
		ls.add('d');
		ls.add("DD");
		ls.add(1412312);
		System.out.println(ls);
		
	
	}
}