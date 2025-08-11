package chapter07;

public class StudentInfoMain {
	public static void main(String[] args) {
		StudentInfo studentKim = new StudentInfo();
		studentKim.studentId = 1004;
		studentKim.grade = 3;
		studentKim.address= "서울시 종로구";
		studentKim.setStudentName("엄자바");
		System.out.println(studentKim.getStudentName());
	}
}