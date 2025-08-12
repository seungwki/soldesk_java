package chapter08;

public class Overload {
	private String name;
	private int age;
	private float height;

	public Overload() {
		this.name = "익명";
		this.age = 52;
		this.height = 13.5f;
	}

	public Overload(int age, float height) {
		this.name = "익명";
		this.age = age;
		this.height = height;
	}

	public Overload(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void showInfo() {
		System.out.printf("이름 >>> %s\t나이 >>> %d\t키 >>> %.2f\n",name,age,height);
	}
}