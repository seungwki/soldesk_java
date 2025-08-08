package chapter06;

public class Example03 {
	//점수 배열 받아서 원소 평균 계산해서 반환하기
	public static void main(String[] args) {
		int[] numbers= {5,10,15,20,25};
		Example03 ex = new Example03();
		System.out.printf("%.2f",ex.avg(numbers));
	}
	private double avg(int[] numbers) {
		int sum;
		double avg;
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		avg = sum/numbers.length;
		return avg;
}}