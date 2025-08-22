package chapter18;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSetMain2 {
	public static void main(String[] args) {
		HashSet<Member2> hs = new HashSet<>();
		Member2 member = new Member2(71237878, "김");
		hs.add(new Member2(12478, "엄준식"));
		hs.add(new Member2(12478, "엄준식6"));//hash가 같아도 필드가 달라 서로 다른 인스턴스가 된다.
		//Member2 수정 후, id만 같아도 같은 객체로 인식 해서 인스턴스가 추가로 생성되지 않는다.
		hs.add(new Member2(1247, "엄준식2"));
		hs.add(new Member2(124, "엄준식3"));
		hs.add(new Member2(124789, "엄준식4"));
		hs.add(new Member2(124789, "엄준식4"));//new를 써도 모든 필드가 같아 같은 주소를 가져 하나의 인스턴스만 생긴다.
		hs.add(member);
		hs.add(member);
		System.out.println(hs);
		System.out.println(hs.size()); // ==5

		Iterator<Member2> iter = hs.iterator();
		while (iter.hasNext()) {
			Member2 m = iter.next();
			System.out.print(m);
		}
	}
}
