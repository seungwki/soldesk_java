package chapter14;

import java.util.Objects;

public class User2 {
	private String id;

	public User2(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 기존의 자동 정의 equals
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User2 other = (User2) obj;
//		return Objects.equals(id, other.id);

		User2 user = (User2) obj;
		return id.equals(user.id);// id의 equels == String().equels를 사용하고 있다. 이름이 같으니 헷갈릴 수 있다.
	}
	
	//보통 equals()를 수정하면 .hashcode()를 수정하는게 일반적으로 묶음으로 이루어진다.

}