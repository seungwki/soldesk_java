package chapter18;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
//		Object obj;
		Stack<Object> st = new Stack<>();

		if (st.empty()) {
			for (int i = 0; i < 5; i++) {
				st.push(new String("Hi"+i));
				System.out.println((i + 1) + "th Input >> " + st.peek());
			}
		}
		//stack에 데이터를 추가하는 메서드는 push이다.
		//peek은 가장 먼저 나올 데이터를 제거하지 않고 반환하는 메서드이다.
		//pop은 가장 먼저 나올 데이터를 제거하고 반환하는 메서드이다.
		//이름보다는 stack이란 자료구조에서 요구하는 기능을 기억하는 것이 중요하다.
		//이름들은 관습적으로 쓰이는 것들이다.
		st.pop();
		System.out.println("poped!");
		System.out.println("show peek() >> "+st.peek());
		st.pop();
		System.out.println("poped!");
		System.out.println("show peek() >> "+st.peek());
		st.push(new String("Happy"));
		System.out.println("show peek() >> "+st.peek());
		st.push(new String("Good"));
		System.out.println("show peek() >> "+st.peek());
	}
}