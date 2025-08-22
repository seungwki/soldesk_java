package chapter14;

public class ObjectMain2 {
	public static void main(String[] args) {
		Child c = new Child();
		c.childMethod();
		c.parentMethod();
		String str = c.toString();
		System.out.println(str);
		System.out.println(c.hashCode());//얘를 16진법으로 변환해서 기본 toString에서 보여준다.
//		c.notify();
//		c.notifyAll();
	}
}