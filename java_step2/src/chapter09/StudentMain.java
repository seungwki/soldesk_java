package chapter09;

public class StudentMain {
	public static void main(String[] args) {
		Student std = new Student();
		std.setStudentName("qweasd");
		System.out.println(std.getStudentName());
		System.out.println(Student.getSerialNum());
		Student.serialNum++;
		
		Student std2 = new Student();
		std2.setStudentName("akhdjksh");
		System.out.println(std2.getStudentName());
		System.out.println(Student.getSerialNum());
		Student.serialNum++;
		
		Student std3 = new Student();
		std3.setStudentName("kjiohjzkjxvchas");
		System.out.println(std3.getStudentName());
		System.out.println(Student.getSerialNum());
		Student.serialNum++;
	}
}
