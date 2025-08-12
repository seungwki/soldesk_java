package chapter08;

public class ColorMain {
	public static void main(String[] args) {
		Color c1 = new Color(159);
		Color c2 = new Color(23, 159, 55);
		System.out.println("c1 Red >> " + c1.red);
		System.out.println("c1 Green >> " + c1.green);
		System.out.println("c1 Blue >> " + c1.blue);
		System.out.println("========================");
		System.out.println("c2 Red >> " + c2.red);
		System.out.println("c2 Green >> " + c2.green);
		System.out.println("c2 Blue >> " + c2.blue);
	}
}