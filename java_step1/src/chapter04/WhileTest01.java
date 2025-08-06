package chapter04;
//while문
public class WhileTest01 {
	public static void main(String[] args) {
		int num, count;
		count = 0;
		while (true) {
			num=(int)(Math.random()*6)+1;
			if(num == 6) {
				break;
			}
			System.out.println("num : "+num);
			count++;
		}
		System.out.println("count : "+count);
		double p;
		p = 1-(double)(Math.pow(5, count+1)/Math.pow(6, count+1));
		System.out.printf("%.4f",p*100);
	}
}