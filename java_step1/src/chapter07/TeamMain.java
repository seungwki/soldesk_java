package chapter07;

public class TeamMain {
	public static void main(String[] args) {
		
		TeamGroup tg = new TeamGroup();
		TeamMember member1 = new TeamMember();
		member1.setTeamName("Team Name 1");
		System.out.println(member1.teamName);
		tg.init();
		tg.display();
		
		member1.setLeaderName("이름8");
		member1.setLeaderTel("01020304050");
		member1.setSubLeaderName("이름10");
		System.out.println("Leader name : "+member1.leaderName);
		System.out.println("Leader tel : "+member1.leaderTel);
		System.out.println("Sub leader name : "+member1.subLeaderName);
	}
}