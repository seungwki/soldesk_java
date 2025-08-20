package chapter15;

public class StringChangeMain {
	public static void main(String[] args) {
		String str = "Hello Java! Welcome to Java";
		System.out.println("Original >> "+ str);
		System.out.println("Partial String from index 7 >>> "+str.substring(7));
		System.out.println("Partial String from index 7 >>> "+str.substring(7,12));
		System.out.println("Concat >>> "+str.concat("!!"));
		System.out.println("Replace Java → World >>> " + str.replace("Java", "World"));
		System.out.println("Replace 1st Java → World >>> " + str.replaceFirst("Java", "World"));
	}
}