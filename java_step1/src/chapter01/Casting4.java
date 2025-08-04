package chapter01;

public class Casting4 {
	public static void main(String[] args) {
		int num1 = 1000;
		byte num2;
		num2 = (byte)num1;
		System.out.println("num2 : "+num2);
		System.out.println("-------------------------");
		double num3 = 1.2;
//		float num4 = (float)0.4;
//		float num4 = 0.4F;
		float num4 = 0.9f;
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("-------------------------");
		int num5;
		num5 = (int)(num3+num4);
		System.out.println("num5 : "+num5);
		num5 = (int)num3+(int)num4;
		System.out.println("num5 : "+num5);
		
	}
}