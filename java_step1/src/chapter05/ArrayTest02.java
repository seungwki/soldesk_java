package chapter05;

import javax.swing.JOptionPane;

public class ArrayTest02 {
	public static void main(String[] args) {
		String[] std;
		String[] tel;
		std = new String[3];
		tel = new String[3];
		for (int i = 0; i < tel.length; i++) {
			std[i] = JOptionPane.showInputDialog("학생이름");
			tel[i] = JOptionPane.showInputDialog("전화번호");
		}
		for (int i = 0; i < tel.length; i++) {
			System.out.printf("이름 > %s \t 전화번호 > %s \n",std[i],tel[i]);
		}
	}
}