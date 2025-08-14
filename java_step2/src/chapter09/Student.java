package chapter09;

public class Student {
	public static int serialNum = 10000;
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	
}
