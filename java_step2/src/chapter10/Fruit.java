package chapter10;

public class Fruit {
	private String sort;
	private String season;
	public void set1(String a, String b) {
		sort=a;
		season =b;
	}
	public void display() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
	}
}
