package chapter09;

public class FamilyMain {
	public static void main(String[] args) {
//		Family fam1 = new Family();
		Family fam1 = Family.getInstance();
		Family fam2 = Family.getInstance();
		Family fam3 = Family.getInstance();
		System.out.println(fam1);
		System.out.println(fam2);
		System.out.println(fam3);
	}
}