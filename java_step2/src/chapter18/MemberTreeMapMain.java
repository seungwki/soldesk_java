package chapter18;

public class MemberTreeMapMain {
	public static void main(String[] args) {
		MemberTreeMap mtm = new MemberTreeMap();
		Member2 mem1 = new Member2(12,"현");
		Member2 mem2 = new Member2(23,"질");
		Member2 mem3 = new Member2(34,"해");
		Member2 mem4 = new Member2(45,"라");
		mtm.addMember(mem2);
		mtm.addMember(mem4);
		mtm.addMember(mem1);
		mtm.addMember(mem3);
		Member2 mem5 = new Member2(12,"쌀");
		mtm.addMember(mem5);
		Member2 mem6 = new Member2(56,"쌀");
		mtm.addMember(mem6);
		mtm.removeMember(12);
		mtm.removeMember(12);
		
		//입력 순서와 무관하게, key 기준으로 오름차순 정렬 되는 것을 확인 할 수 있다.
		mtm.showAllMember();
	}
}