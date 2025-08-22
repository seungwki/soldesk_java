package chapter14;

public class Dog2 {
	private String name;
	private int age;

	public Dog2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog2 [name=" + name + ", age=" + age + "]";
	}
}
