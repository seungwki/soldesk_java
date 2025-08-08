package chapter06;

import javax.swing.JOptionPane;

public class FuncTest01 {
	public static void main(String[] args) {
		int num1, num2, sum;
		num1= Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("값2"));
		sum = plus(num1, num2);
		System.out.println(sum);
	}
	static int plus(int int1, int int2) {return int1+int2;}
}