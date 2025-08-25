package chapter18;

public class MemberHashMapMain {
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();//주의! : 이 HashMap은 Member2를 담는게 아니라, Member2를 인자로 받아 String과 Integer를 뽑아 저장한다.
		Member2 nm1 = new Member2(78612, "쌀다팜");
		mhm.addMember(nm1);
		
		Member2 nm = new Member2(78612, "사자보이즈");// Member2의 equals에 의해 id가 같아 새 인스턴스가 생성되지 않았다?
		System.out.println();
		mhm.addMember(nm);
		
		mhm.addMember(new Member2(786512, "난이미"));
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