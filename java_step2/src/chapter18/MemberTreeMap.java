package chapter18;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	private TreeMap<Integer, String> treeMap;
	public MemberTreeMap() {
		treeMap = new TreeMap<>();
	}
	
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberId(), member.getName());
	}
	public boolean removeMember(int memberId) {
		while(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("member Id doesn't exists.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> iter = treeMap.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String member = treeMap.get(key);
			System.out.println(member);
		}
	}
}