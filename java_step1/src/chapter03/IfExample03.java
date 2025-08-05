package chapter03;

import javax.swing.JOptionPane;

public class IfExample03 {
	// 전시회 입장료는 미취학 1000원, 초등학생 2000원, 중고등학생 3500원, 성인 5000원
	public static void main(String[] args) {
//		expo();
		expo2();
	}

	static void expo() {
		int age, price;
		age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
		if (age <= 7) {
			price = 1000;
			System.out.println("미취학.");
		} else if (age <= 13) {
			price = 2000;
			System.out.println("초등.");
		} else if (age <= 19) {
			price = 3500;
			System.out.println("중고등.");
		} else {
			price = 5000;
			System.out.println("성인.");
		}
		System.out.println("입장료는 " + price + "원입니다.");
	}

	static void expo2() {
		int age, price;
		String dev;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이"));

		if (age >= 20) {
			dev = "성인";
			price = 5000;
		} else if (age >= 14) {
			dev = "중고등학생";
			price = 3500;
		} else if (age >= 8) {
			price = 2000;
			dev = "초등학생";
		} else {
			dev = "미취학 아동";
			price = 1000;
		}
		System.out.println(dev + " 의 입장료는 " + price + "원입니다.");
	}
}