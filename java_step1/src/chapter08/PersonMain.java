package chapter08;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("엄준식");
		Person p3 = new Person("식준엄",186.2f,95.5f);
		
		p1.name="Sakana 2";
		p1.height=5214.42f;
		p1.weight=512.2f;
		
		p2.height=972.62f;
		p2.weight=51f;
		
		System.out.println("p1.name\t\t>>"+p1.name);
		System.out.println("p1.height\t>>"+p1.height);
		System.out.println("p1.weight\t>>"+p1.weight);
		System.out.println();
		System.out.println("p2.name\t\t>>"+p2.name);
		System.out.println("p2.height\t>>"+p2.height);
		System.out.println("p2.weight\t>>"+p2.weight);
		System.out.println();
		System.out.println("p3.name\t\t>>"+p3.name);
		System.out.println("p3.height\t>>"+p3.height);
		System.out.println("p3.weight\t>>"+p3.weight);
	}
}