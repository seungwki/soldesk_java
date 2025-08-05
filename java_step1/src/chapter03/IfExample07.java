package chapter03;

import javax.swing.JOptionPane;

public class IfExample07 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1 : "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2 : "));
		if (num1 > num2) {System.out.println("num1 is bigger.");}
		else if (num2 > num1) {System.out.println("num2 is bigger.");}
		else {System.out.println("Numbers are same.");}
	}
}