package chapter05;

public class Example03 {
	public static void main(String[] args) {
		int[][] numArr;
		numArr = new int[][] { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		// 각 배열 별 합과 평균 구하시오
		//합, 평균을 저장 할 배열 선언, 생성, 초기화
		int[] sum;
		double[] avg;
		sum = new int[numArr.length];
		avg = new double[numArr.length];
		// 순회하며 합과 평균을 구함.
		for (int i = 0; i < numArr.length; i++) {
			sum[i] = 0;
			for (int j = 0; j < numArr[i].length; j++) {
				sum[i] += numArr[i][j];
			}
			avg[i] = (double)sum[i]/numArr[i].length;
		}
		// 결과 출력하기
		for (int i = 0; i < avg.length; i++) {
			System.out.printf("sum >> %d\tavg >> %.2f\n",sum[i],avg[i]);
		}
	}
}