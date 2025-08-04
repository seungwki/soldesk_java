package chapter02;

public class Example02 {
	public static void main(String[] args) {
		//1. 삼항연산자를 이용해 score1이 60점보다 크거나 같으면 합격, 그렇지 않다면 불합격으로 반환하세요. score1은 60입니다.
		//2. 삼항연산자를 이용해 score2가 90점보다 크면 'A'이고, 80 초과면 B, 나머지는 C. score2는 82점.
		int score1, score2;
		score1 = 60; score2 = 82;
		
		char result2;
		result2 = score2>90?'A':score2>80?'B':'C';
		System.out.println("score2 : "+ result2);
		
//		String result1;
//		result1 = score1>=60?"합격":"불합격";
//		System.out.println("score1 : "+ result1);
		char result1;
		result1 = score1>=60?0:'불';
		System.out.println("score1 : "+ result1+"합격");//악질행동
	}
}