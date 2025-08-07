package chapter05;

import javax.swing.JOptionPane;

public class TwoDimension02 {
	public static void main(String[] args) {
		int[][] numArr;
		numArr = new int[2][3];
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = i + j + i * j;
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("점수"));
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}