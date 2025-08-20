package chapter15;

public class StringInfoMain {
	public static void main(String[] args) {
		String str = "Hello, java!";
		System.out.println("length >>> "+str.length());
		System.out.println("is Emplty >>> "+str.isEmpty());
		System.out.println("is isBlank>>> "+str.isBlank());
		System.out.println("is isBlank>>> "+"        ".isBlank());
	}
}