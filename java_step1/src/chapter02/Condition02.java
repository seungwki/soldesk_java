package chapter02;

public class Condition02 {
	public static void main(String[] args) {
		int score;
		char grade;
		score = 80;
		grade = (score>90)?'A':(score>80)?'B':'C';
		System.out.println("grade: " + grade);
	}
}