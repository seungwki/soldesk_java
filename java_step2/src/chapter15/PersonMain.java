package chapter15;

public class PersonMain {
	public static void main(String[] args) throws Exception{
		Person person = new Person();
		Class pClass1 = person.getClass();
		Class pClass2 = Person.class;
		Class pClass3 = Class.forName("chapter15.Person");
		System.out.println(pClass1.getName());
		System.out.println(pClass2.getName());
		System.out.println(pClass3.getName());
	}
}
