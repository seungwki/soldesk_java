package chapter06;

public class MethodTest02 {
	public static void main(String[] args) {
		String name = "엄";
		greet(name);
	}
	public static void greet(String name) {
		System.out.println("Welcome, "+name+"!");
	}
}