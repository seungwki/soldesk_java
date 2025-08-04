package chapter02;

public class crementOperator02 {
	public static void main(String[] args) {
		int gameScore1,lastScore1,lastScore2;
		gameScore1 = 150;
		lastScore1 = ++gameScore1;
		System.out.println("lastScore1 : "+ lastScore1);
		lastScore2 = --gameScore1;
		System.out.println("lastScore2 : "+ lastScore2);
		System.out.println("────────────────────────────");
		int gameScore2,lastScore3,lastScore4;
		gameScore2 = 150;
		lastScore3 = gameScore2++;
		System.out.println("lastScore1 : "+ lastScore3);
		lastScore4 = gameScore2--;
		System.out.println("lastScore2 : "+ lastScore4);
		System.out.println("────────────────────────────");
		
	}
}