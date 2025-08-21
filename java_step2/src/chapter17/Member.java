package chapter17;

public class Member {
	private int memberId;
	private String name;

	public Member(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
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
		return "Member [memberId=" + memberId + ", name=" + name + "], hash>> "+this.hashCode();
	}
}
