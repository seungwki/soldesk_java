package chapter08;

/*student 클래스에서 name, age 멤버 변수를 private로 선언
 각 필드 getter setter설정
 나이 음수 설정 불가
 메인에서 학생 1명 인스턴스 생성 후 인자 출력
 */
public class Student {
	private String name;
	private int age;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {if (age >= 0) this.age = age; else System.out.println("It is impossible");}
}