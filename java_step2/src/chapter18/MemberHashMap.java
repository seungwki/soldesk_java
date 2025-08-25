package chapter18;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, String> map;

	public MemberHashMap() {
		map = new HashMap<>();
	}

	public void addMember(Member2 member) {
		map.put(member.getMemberId(), member.getName());
	}

	public boolean removeMember(int memberId) {
		while (map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}
		System.out.println(memberId + " doesn't exist.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			String member = map.get(key);
			System.out.println(member+", hash : "+member.hashCode());
		}
		System.out.println();
	}
}