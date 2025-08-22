package chapter18;

public class MemberHashMapMain {
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		mhm.addMember(new Member2(78612, "쌀다팜"));
		Member2 nm = new Member2(78612, "사자보이즈");// Member2의 equals에 의해 id가 같아 새 인스턴스가 생성되지 않았다?
		mhm.addMember(new Member2(786512, "난이미"));
		mhm.addMember(nm);
		mhm.addMember(new Member2(782612, "쌀쌀다팜"));// Member2의 equals에 의해 id가 같아 새 인스턴스가 생성되지 않았다.
		mhm.showAllMember();
		System.out.println("--------------------");
		mhm.removeMember(78612);
		mhm.showAllMember();
		System.out.println("--------------------");
		mhm.addMember(new Member2(786512, "싹다팜"));
		mhm.showAllMember();
	}
}