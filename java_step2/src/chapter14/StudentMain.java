package chapter14;

//필드 "학번"이 같으면 같다고 판정해보자.
public class StudentMain {
	public static void main(String[] args) {
		Student stdPark1 = new Student(100, "박정민");
		Student stdPark2 = stdPark1;
		Student stdPark3 = new Student(100, "박정민");

		System.out.println("Compare two instances with same memory address");
		System.out.println(stdPark1 == stdPark2);
		System.out.println(stdPark1.equals(stdPark2));

		System.out.println("Compare two instances with diffrent memory address but logically same.");
		System.out.println(stdPark1 == stdPark3);
		System.out.println(stdPark1.equals(stdPark3));

		System.out.println("Check .HashCode()");
		System.out.println("1 : " + stdPark1.hashCode());// 520232556 -> 131
		System.out.println("2 : " + stdPark2.hashCode());// 520232556 -> 131
		System.out.println("3 : " + stdPark3.hashCode());// 1988859660 -> 131

		System.out.println("Check Physical Memory Address"); 
		
		System.out.println("1 : " + System.identityHashCode(stdPark1));//1902260856
		System.out.println("2 : " + System.identityHashCode(stdPark2));//1902260856
		System.out.println("3 : " + System.identityHashCode(stdPark3));//1988859660

		System.out.println("Compare memory address");
		System.out.println(System.identityHashCode(stdPark1) == System.identityHashCode(stdPark2));//true
		System.out.println(System.identityHashCode(stdPark2) == System.identityHashCode(stdPark3));//false
		System.out.println(System.identityHashCode(stdPark3) == System.identityHashCode(stdPark1));//false

	}
}
