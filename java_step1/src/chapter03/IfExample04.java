package chapter03;

import javax.swing.JOptionPane;

public class IfExample04 {
	// 전시회 입장료는 미취학 1000원8, 초등학생 2000원13, 중고등학생 3500원17, 성인 5000원20
	// 논리 연산자 사용해서 조건문 만들기
	public static void main(String[] args) {
		int age, price;
		String dev;
		age = Integer.parseInt(JOptionPane.showInputDialog("나이? : "));
		if (age < 8) {
			price = 1000;
			dev = "미취학 아동";
		} else if (8 <= age && age <= 13) {
			price = 2000;
			dev = "초등학생";
		} else if (13 < age && age <= 19) {
			price = 3500;
			dev = "중고등학생";
		} else {
			price = 5000;
			dev = "성인";
		}
		System.out.println(dev + "의 요금은 " + price + "원 입니다.");
	}
}