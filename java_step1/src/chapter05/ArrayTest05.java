package chapter05;

public class ArrayTest05 {
	public static void main(String[] args) {
		int[] numArr1;
		int sum;
		sum=0;
		numArr1 = new int[] {98,75,40,50,20};
		//1.배열의 모든 요소 출력
		for (int i = 0; i < numArr1.length; i++) {
			System.out.printf("%d번째 요소 >> %d\n",i,numArr1[i]);
			sum += numArr1[i];
		}
		//2. 배열의 총점
		System.out.println("sum >> " + sum);
		//3. 배열의 평균
		System.out.println("avg >> " + Math.round(1.0 * sum / numArr1.length));
	}
}