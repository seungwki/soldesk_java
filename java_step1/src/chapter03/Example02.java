package chapter03;
import java.util.Scanner;
public class Example02 {
	/*
	 * Scanner로 gender = F/M 입력 받아 "여성"/"남성" 출력 입력 받을 때, 입력을 char로 받기(
	 * nextline().charAt(0) )
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender;
		System.out.print("성별 입력하기(F/M) : ");
		gender = sc.nextLine().charAt(0);
		if (gender == 'F') {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}
		sc.close();
	}
}