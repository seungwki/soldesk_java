package chapter15;

public class Wrapper01 {
	public static void main(String[] args) {
		// Auto-Boxing
		Integer obj1 = 100;
		System.out.println("obj1 >> " + obj1);

		// Auto-Unboxing
		int var1 = obj1;
		System.out.println("var1 >> " + var1);
		// Auto-Unboxing
		int var2 = obj1 + 100;
		System.out.println("var2 >> " + var2);
	}
}