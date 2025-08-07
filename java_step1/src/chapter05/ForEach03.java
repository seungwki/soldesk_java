package chapter05;

public class ForEach03 {
	public static void main(String[] args) {
		int[] numArr= {19,29,39,49,59,69,79,89};
		int sum;
		sum = 0;
		for (int num : numArr) {
			System.out.println(num);
			sum+=num;
		}
		System.out.printf("sum : %d",sum);
	}
}