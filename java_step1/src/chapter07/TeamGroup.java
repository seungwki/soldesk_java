package chapter07;

public class TeamGroup {
	private TeamMember[] memberList = new TeamMember[6];

	public void init() {
		// 6인의 이름과 성별을 넣어 인스턴스 생성
		memberList[0] = new TeamMember("이름1", "male");
		memberList[1] = new TeamMember("이름2", "male");
		memberList[2] = new TeamMember("이름3", "male");
		memberList[3] = new TeamMember("이름4", "female");
		memberList[4] = new TeamMember("이름5", "female");
		memberList[5] = new TeamMember("이름6", "female");
	}

	public void display() {
		for (int i = 0; i < memberList.length; i++) {
			System.out.printf("이름 : %s , 성별 : %s\n", memberList[i].memberName, memberList[i].gender);
		}
	}
}