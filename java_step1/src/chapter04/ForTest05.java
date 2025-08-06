package chapter04;

import java.util.Scanner;

public class ForTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~11 : ");
		int i;
		i = sc.nextInt();
		
		if(0<=i && i<=11) {
			System.out.println("good");
		}else {
			System.out.println("bad");
		}
		System.out.println("Good bye!");
		sc.close();
	}
}