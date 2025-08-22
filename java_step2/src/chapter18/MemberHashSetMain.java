package chapter18;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSetMain {
	public static void main(String[] args) {
		HashSet<Member> hs = new HashSet<>();
		Member member = new Member(71237878, "김");
		hs.add(new Member(124789, "엄준식"));
		hs.add(new Member(124789, "엄준식2"));
		hs.add(new Member(124789, "엄준식3"));
		hs.add(new Member(124789, "엄준식4"));
		hs.add(new Member(124789, "엄준식4"));//모든 필드가 같아도 new를 쓰니 새 인스턴스를 만들어 준다.
		hs.add(member);
		hs.add(member);
		hs.add(member);
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator<Member> iter = hs.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.print(m);
		}
	}
}
