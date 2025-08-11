package chapter07;

import java.util.Scanner;

public class CanMain {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.init();
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Money >> ");
		vm.showList(Integer.parseInt(sc.nextLine()));
		System.out.print("Select Drink >> ");
		vm.serveCan(sc.nextLine());
		sc.close();
	}
}