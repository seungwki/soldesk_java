package chapter17;

public class MemberArrayListMain {
	public static void main(String[] args) {
		MemberArrayList mal = new MemberArrayList();
		Member dup = new Member(1279, "ghjzgkhjzxc");
		mal.addMember(new Member(13, "asd"));
		mal.addMember(new Member(412, "qwer"));
		mal.addMember(new Member(6, "gasd"));
		mal.addMember(new Member(1278, "ghjzgkhjzxc"));
		mal.addMember(dup);
		mal.showAllMember();
		mal.removeMember(13);
		mal.showAllMember();
		mal.removeMember(51);
		mal.showAllMember();
		mal.removeMember(412);
		mal.showAllMember();
		mal.addMember(new Member(9999,"guiyqwejgkhasdhgjk"));
		mal.addMember(dup);
		mal.addMember(new Member(1278, "ghjzgkhjzxc"));//중복 추가를 허용한다
		mal.showAllMember();
		mal.removeMember(dup.getMemberId());
		mal.showAllMember();
	}
}