package chapter08;

class Person2 {
	String name;
	int age;

	public Person2() {
		this("김", 4);
	}

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Person2 returnSelf() {
		return this;
	}
}

public class CallAnotherConstructor {
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1);
		System.out.println(p1.returnSelf());
		Person2 p2 = new Person2();
		System.out.println(p2);
		Person2 p3 = p1.returnSelf();
		System.out.println(p3);
		
	}
}
