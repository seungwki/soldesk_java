package chapter07;

public class Student2Main {
	public static void main(String[] args) {
		// 필드를 사용하여 대입
		Student2 sd1 = new Student2();
		sd1.studentName = "엄자바";
		sd1.address = "서울시 종로구";
		sd1.showStudentInfo();
		// 메서드 사용
		Student2 sd2 = new Student2();
		sd2.setStudentName("어엄자바");
		sd2.setAddress("서울시 구로구");
		sd2.showStudentInfo();
		// 생성자 사용
		Student2 sd3 = new Student2("식준엄", "동탄");
		sd3.showStudentInfo();
	}
}