package chapter10;

public class Strawberry extends Berry{
	private String color;
	private String price;
	public void set3(String a, String b) {
		color=a;
		price=b;
	}
	public void display3() {
		System.out.println("색: "+color);
		System.out.println("가격 : "+price);
	}
}
