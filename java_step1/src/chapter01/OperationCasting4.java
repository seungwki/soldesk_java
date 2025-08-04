package chapter01;

public class OperationCasting4 {
	public static void main(String[] args) {
		int div1 = 3/2;
		float div2 = 3/2;
		double div3 = 3/2;
		System.out.println("div1 : "+div1);
		System.out.println("div2 : "+div2);
		System.out.println("div3 : "+div3);
		System.out.println("-----------------------------");
		double div4 = 3.0/2;
		System.out.println("div4 : "+div4);
		double div5 = (double)3/2;
		System.out.println("div5 : "+div5);
	}
}