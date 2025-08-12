package chapter08;

import javax.swing.JOptionPane;

public class EncapsulationMain {
	public static void main(String[] args) {
		int side1, side2;
		side1 = Integer.parseInt(JOptionPane.showInputDialog("side 1"));
		side2 = Integer.parseInt(JOptionPane.showInputDialog("side 2"));
		Encapsulation obj = new Encapsulation();
		int area = obj.calcArea(side1, side2);
		System.out.println("Area : "+area);
	}
}