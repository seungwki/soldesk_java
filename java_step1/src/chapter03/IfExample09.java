package chapter03;

import java.util.Scanner;

public class IfExample09 {
	public static void main(String[] args) {
		// db의 데이터를 가져왔다고 가정하자.
		String id = "soldesk";
		int pw = 250729;

		// 고객 input
		Scanner sc = new Scanner(System.in);
		String inputId, inputPw;
		int pwConvert;
		System.out.println("ID? : ");
		inputId = sc.nextLine();
		System.out.println("PW? : ");
		inputPw = sc.nextLine();
		pwConvert = Integer.parseInt(inputPw);

		if (id.equals(inputId)) {
			if (pw == pwConvert) {
				System.out.println("Login Success.");
			} else {
				System.out.println("PW Error.");
			}
		} else {
			System.out.println("ID Error.");
		}
		sc.close();
	}
}