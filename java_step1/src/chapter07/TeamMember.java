package chapter07;

public class TeamMember {
	// 멤버 변수 == 필드
	public String teamName; //팀 이름
	public String leaderName;//팀장 이름
	public String leaderTel;// 팀장 전화번호
	public String subLeaderName; //부팀장 이름
	public String memberName; // 팀원 이름
	public String gender; // 성별

	// 생성자
	public TeamMember() {
	}

	public TeamMember(String name, String gender) {
		this.memberName = name;
		this.gender = gender;
	}

	// getter setter
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getLeaderTel() {
		return leaderTel;
	}

	public void setLeaderTel(String leaderTel) {
		this.leaderTel = leaderTel;
	}

	public String getSubLeaderName() {
		return subLeaderName;
	}

	public void setSubLeaderName(String subTeamName) {
		this.subLeaderName = subTeamName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//메서드
}
