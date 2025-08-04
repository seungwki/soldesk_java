package chapter01;

public class Example01 {
	/*문제
	 * 배, 사과, 오렌지의 일일 생산량은 5,7,5이다.
	 * q1. 과수원에서 24시간 생산되는 총 과일의 갯수를 구하라.
	 * q2. 시간 당 전체 과일의 평균 생산 갯수를 구하여 float 자료형의 변수에 담아
	 * 요구한 모든 답을 콘솔에 출력하라.*/
	public static void main(String[] args) {
		int p,a,o,dailyFruitQ;
		p = 5;a=7;o=5;dailyFruitQ= p+a+o;
		float avg;
		avg = dailyFruitQ/24.0f;
		System.out.println("일일 과일 생산 총량 : "+dailyFruitQ+" 개");
		System.out.println("1시간 당 평균 생산 갯수 : " +avg+"개");
		
	}
}