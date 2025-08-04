package chapter02;

import java.util.Scanner;

/*
 * 스캐너 사용해서 Boolean 타입의 isSunny와 isWarm을 입력 받아
 * 날씨가 화창하면서 따뜻한지 여부를 출력하는 프로그램을 작성하세요.
 * 날씨가 화창하면서 따뜻한지에 대한 여부는 isNiceWeather를 사용하여 작성하시오. 
 * */
public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isSunny, isWarm, isNiceWeather;
//		System.out.println("날씨가 화창합니까?(y/n)");
//		isSunny = sc.nextLine().equals("y")?true:false;
//		System.out.println("날씨가 따뜻합니까?(y/n)");
//		isWarm = sc.nextLine().equals("y")?true:false;
		System.out.println("날씨가 화창합니까?(true / false)");
		isSunny = sc.nextBoolean();
		System.out.println("날씨가 따뜻합니까?(true / false)");
		isWarm = sc.nextBoolean();
		isNiceWeather = isSunny & isWarm;
		System.out.println("날씨가 " + (isNiceWeather ? "좋습니다" : "좋지 않습니다."));
		sc.close();
	}
}