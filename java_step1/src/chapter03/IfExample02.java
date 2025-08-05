package chapter03;

import javax.swing.JOptionPane;

public class IfExample02 {
	public static void main(String[] args) {
		int num1;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
		if (num1 %10==0) {
			System.out.println(num1+" is a multiple of 10.");
		} else {
			System.out.println(num1 + " is not a multiple of 10.");
		}
	}
}