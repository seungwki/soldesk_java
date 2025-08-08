package chapter06;

import java.util.Scanner;

public class FuncTest08_1 {
	public static String eduStep(int edu) {
		String step;
		if (edu == 1) {
			step = "Study level is step 1";
		} else if (edu == 2) {
			step = "Study level is step 2";
		} else if (edu == 3) {
			step = "Study level is step 3";
		} else {
			step = "No step";
		}
		return step;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level;
		System.out.print("Input Study level>");
		level = sc.nextInt();
		System.out.println(eduStep(level));
		sc.close();
	}
}