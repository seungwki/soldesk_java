package chapter06;

import java.util.Scanner;

public class FuncTest08 {
	public static void eduStep(int edu) {
		if (edu == 1) {
			System.out.println("Study level is step 1");
		} else if (edu == 2) {
			System.out.println("Study level is step 2");
		} else if (edu == 3) {
			System.out.println("Study level is step 3");
		} else {
			System.out.println("No step");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level;
		System.out.print("Input Study level>");
		level = sc.nextInt();
		eduStep(level);
		sc.close();
	}
}