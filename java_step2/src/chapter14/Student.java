package chapter14;

import java.util.Objects;

//필드 "학번"이 같으면 같다고 판정해보자.
public class Student {
	private int stdId;
	private String stdName;

	@Override
	public String toString() {
		return stdId + ", " + stdName;
	}

	public Student(int stdId, String stdName) {
		this.stdId = stdId;
		this.stdName = stdName;
	}

	//.hashCode()는 int를 반환한다.
	@Override
	public int hashCode() {
//		return Objects.hash(stdName, stdId);
		return Objects.hash(stdId);//Id 기반으로 해싱해서 결과를 낼 것이다.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
//		return Objects.equals(stdName, other.stdName) && stdId == other.stdId;
		return this.stdId == other.stdId;
	}

}
