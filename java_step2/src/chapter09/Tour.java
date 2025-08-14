package chapter09;

import java.util.Scanner;

//Scanner써서 입력 받을 것

public class Tour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Guide g = new Guide();
		g.start(sc);
		
		sc.close();
	}
}