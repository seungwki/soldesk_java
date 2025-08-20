package chapter16;

public class ContainerTest {
	public static void main(String[] args) {
		Container<String> stringContainer = new Container<>();
		System.out.println("Empty Check >> " + stringContainer.isEmpty());

		stringContainer.setItem("data1");
		stringContainer.setItem("");
		System.out.println("Data Check >> " + stringContainer.getItem());
		System.out.println("Empty Check2 >> " + stringContainer.isEmpty());

		Container<Integer> integerContainer = new Container<>();
		integerContainer.setItem(10);
		System.out.println("Data Check >> " + integerContainer.getItem());
	}
}