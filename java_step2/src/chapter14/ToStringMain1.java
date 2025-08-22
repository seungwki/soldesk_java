package chapter14;

import java.util.Date;

public class ToStringMain1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());//java.lang.Object@5123a213
		System.out.println(obj1);//위와 같다
		System.out.println(obj2.toString());//Thu Aug 21 18:04:11 KST 2025
		System.out.println(obj2);//위와 같다
		// 1. 인스턴스 자체를 냅다 출력해달라 하면 알아서 toString 붙여서 출력한다
		// 2. Date 클래스에서 toString()이 오버라이딩 된 것임을 확인할 수 있다. 
	}
}
