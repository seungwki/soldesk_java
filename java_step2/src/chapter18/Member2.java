package chapter18;

import java.util.Objects;

public class Member2 {
	private int memberId;
	private String name;

	public Member2(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
		System.out.println("name >> "+name+"\tid >> "+memberId+"\thash >> "+this.hashCode());
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
//		return "Member [memberId=" + memberId + ", name=" + name + "]\n";
		return "Member [memberId=" + memberId + ", name=" + name + ", hash= " + this.hashCode() + "\n";
	}

	@Override
	public int hashCode() {
//		return Objects.hash(memberId, name);
		return Objects.hash(memberId);// 동일한 memberId는 동일한 hash를 가짐
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; //해시가 같으면 동일 인스턴스
		 * if (obj == null) return false; //비교 대상이 null이면 무조건 false
		 * if (getClass() * != obj.getClass()) return false; //getClass로 이름 가져와서 비교해보기
		 * Member2 other = (Member2) obj;
		 * return memberId == other.memberId && Objects.equals(name, other.name); 필드 2개 비교하고 같은지 보기
		 */
		if (obj instanceof Member2) {
			Member2 member = (Member2) obj;
//			return member.getName().equals(name) && member.getMemberId() == memberId;
			return member.getMemberId() == memberId;
		} else {
			return false;
		}
	}

}
