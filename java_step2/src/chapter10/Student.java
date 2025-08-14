package chapter10;

public class Student extends People {
	int stuNum;

	public Student(String name, String tel, int stuNum) {
		super(name, tel);//상속됨
		this.stuNum = stuNum;
	}

}
