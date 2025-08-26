package chapter20;

@FunctionalInterface
interface Printer {
	void print();
}

public class LambdaEx1 {
	public static void main(String[] args) {
		Printer print = () -> System.out.println("hello, world!");
		print.print();
	}
}