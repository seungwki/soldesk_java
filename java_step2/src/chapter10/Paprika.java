package chapter10;

public class Paprika extends Vegetable {
	String color;
	String price;
	String name;

	void set2(String color, String price, String name) {
		this.color = color;
		this.price = price;
		this.name = name;
	}

	void display1() {
		System.out.println("sort >> " + sort);
		System.out.println("season >> " + season);
		System.out.println("name(super) >> " + super.name);
	}

	void display2() {
		System.out.println("color >> " + color);
		System.out.println("price >> " + price);
		System.out.println("name >> " + name);
	}
}