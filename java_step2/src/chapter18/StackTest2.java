package chapter18;

import java.util.ArrayList;

class MyStack {// Stack을 직접 구현해보자.
	private ArrayList<String> arr = new ArrayList<>();

	public void push(String data) {
		arr.add(data);
	}

	public String pop() {
		int len = arr.size();
		if (len == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
//		return arr.removeLast();
		return arr.remove(len - 1);
	}
}

public class StackTest2 {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("A");
		ms.push("B");
		ms.push("C");
		ms.push("AD");
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}