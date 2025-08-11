package chapter07;

public class User {
	// 멤버변수==필드
	public String name;
	public int age;

	// 생성자
	public User(String name) {
		this.name = name;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메서드
	public void printInfo() {
		System.out.printf("user name : %s, user age : %d\n", name, age);
	}

}