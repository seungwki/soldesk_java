package chapter04;

import javax.swing.JOptionPane;

//while문
public class WhileTest7 {
	public static void main(String[] args) {
		int num1, num2;
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("USER"));
			if(num1==num2) {
				System.out.println("인증 성공");
			}else {
				System.out.println("인증 실패");
			}
		} while (num1 != num2);
	}
}