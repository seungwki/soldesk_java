package chapter17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayList {
	private List<Member> memberList;

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public MemberArrayList() {
		this.memberList = new ArrayList<>();
	}

	// Add
	public void addMember(Member member) {
		memberList.add(member);
	}

	// Remove
	public boolean removeMember(int id) {
		Iterator<Member> iter = memberList.iterator();
		Member temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (id == temp.getMemberId()) {
				memberList.remove(temp);
				return true;
			}
		}
		System.out.println("no target");
		return false;
	}

	// show
	public void showAllMember() {
		System.out.println("----------------");
		for (Member member : memberList) {
			System.out.println(member.toString());
		}
		System.out.println("----------------");
	}
}
