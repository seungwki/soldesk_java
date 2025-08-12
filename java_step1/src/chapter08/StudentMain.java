package chapter08;

public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.setName("김");
		std1.setAge(1);
		std1.setAge(-19);
		
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
	}
}