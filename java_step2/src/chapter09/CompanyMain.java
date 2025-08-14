package chapter09;

public class CompanyMain {
	public static void main(String[] args) {
//		Company comp1 = new Company();
//		Company comp2 = new Company();
//		System.out.println(comp1);
//		System.out.println(comp2);
		
		System.out.println("------Singleton--------");
		Company comp3 = Company.getInstance();
		Company comp4 = Company.getInstance();
		System.out.println(comp3);
		System.out.println(comp4);
	}
}