package chapter07;

public class MyDateMain {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		md.day = 11;
		md.month= 18;
		md.year = 2025;
		System.out.printf("%d년 %d월 %d일",md.year,md.month,md.day);
	}
}