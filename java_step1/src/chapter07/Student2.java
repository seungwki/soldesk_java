package chapter07;

public class Student2 {
	// 멤버변수 == 필드
	int studentId;
	public String studentName;
	int grade;
	String address;

	// 생성자
		//over-loaded
	public Student2(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	public Student2() {
	}
	
	//getter, setter
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	//getter, setter end
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}