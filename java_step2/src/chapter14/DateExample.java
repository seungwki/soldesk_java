package chapter14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 입니다."); //인풋 값이 날짜데이터인 printf일 뿐이다.
		System.out.println(sdf.format(now));//sdf에 now 값을 적용한 결과가 나온다.
		System.out.println(sdf.toString());//sdf 인스턴스에 대한 정보가 나온다.
	}
}