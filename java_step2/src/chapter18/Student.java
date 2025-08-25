package chapter18;

import java.util.Objects;

public class Student {
	private int stdNo;
	private String name;

	public Student(int stdNo, String name) {
		this.stdNo = stdNo;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stdNo, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
//		if (obj == null) return false;
//		if (getClass() != obj.getClass()) return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && stdNo == other.stdNo;
		if (!(obj instanceof Student))
			return false;
		Student std = (Student) obj;
		return stdNo == std.stdNo && name.equals(std.name);
	}

	@Override
	public String toString() {
		return "학번 : " + stdNo + ", 이름 : " + name;
	}
}