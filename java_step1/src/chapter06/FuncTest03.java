package chapter06;

import javax.swing.JOptionPane;

public class FuncTest03 {
	public static void main(String[] args) {
		int num1, num2;
		num1= Integer.parseInt(JOptionPane.showInputDialog("x : "));
		num2= Integer.parseInt(JOptionPane.showInputDialog("y : "));
		System.out.println("before swap");
		System.out.printf("x : %d, y : %d\n",num1, num2);
		System.out.println("after swap");
		swap(num1,num2);
		System.out.println("but num1, num2...");
		System.out.printf("x : %d, y : %d\n",num1, num2);
	}
	public static void swap(int num1, int num2) {
		int temp, num3, num4;
		temp = num1;
		num3 = num2;
		num4 = temp;
		System.out.printf("x : %d, y : %d\n",num3, num4);
	}
}