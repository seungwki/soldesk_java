package chapter04;
//while문
public class WhileTest2 {
	public static void main(String[] args) {
//		int i = 1;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("프로그램 종료");
		int num, sum;
		num = 1;sum = 0;
		while(num<=100) {
			sum+=num;
			num++;
		}
		System.out.println("1~100 sum : "+sum);
	}
}