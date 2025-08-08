package chapter06;

import javax.swing.JOptionPane;

public class FuncTest02 {
	public static void main(String[] args) {
		int num1, num2, sum;
		FuncTest02 funcTest02 = new FuncTest02();
		num1= Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2= Integer.parseInt(JOptionPane.showInputDialog("값2"));
		sum = funcTest02.plus(num1, num2);
		System.out.println(sum);
	}
	int plus(int int1, int int2) {return int1+int2;}
}