package chapter20;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, input;
		System.out.println("1. Add");
		System.out.println("2. Diff");
		System.out.println("3. Mult");
		System.out.println("4. Dvid");
		System.out.println("5. Exit");
		System.out.print("Select <<< ");
		try {
			input = sc.nextInt();
			if (input == 5) {
				System.out.println("Exit");
				System.exit(0);
			} else {
				System.out.print("Input number 1 <<< ");
				num1 = sc.nextInt();
				System.out.print("Input number 2 <<< ");
				num2 = sc.nextInt();
				switch (input) {
				case 1:
					Calculator add = (n1, n2) -> n1 + n2;
					System.out.println(add.calc(num1, num2));
					break;
				case 2:
					Calculator diff = (n1, n2) -> n1 - n2;
					System.out.println(diff.calc(num1, num2));
					break;
				case 3:
					Calculator mult = (n1, n2) -> n1 * n2;
					System.out.println(mult.calc(num1, num2));
					break;
				case 4:
					Calculator divide = (n1, n2) -> n1 / n2;
					System.out.println(divide.calc(num1, num2));
					break;
				default:
					System.out.println("Wrong Input");
					break;
				}// switch
			} // else
		} // try
		catch (Exception e) {
			System.out.println("Wrong Input");
		} // catch
		finally {
			sc.close();
		}
	}// main
}
// CalcMain