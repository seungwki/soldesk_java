package chapter18;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class CoinMainTest {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String input;
		boolean run = true;
		while (run) {
			showMenu(coinBox);
			input = sc.nextLine();
			switch (input) {
			case "1":
				insertCoin(coinBox, sc);
				break;
			case "2":
				popCoin(coinBox);
				break;
			case "3":
				System.out.println("종료");
				sc.close();
				System.exit(0);
				//run=false;
				break;
			default:
				System.out.println("잘못 된 입력입니다.");
				break;
			}
		}
//		sc.close();
		;
	}

	private static void popCoin(Stack<Coin> coinBox) {
		Coin popCoin = coinBox.pop();
		System.out.println("꺼내온 동전의 가치: "+popCoin.getValue());
	}

	private static void insertCoin(Stack<Coin> coinBox, Scanner sc) {
		System.out.print("투입할 동전의 가치를 입력하세요.: ");
		int value = Integer.parseInt(sc.nextLine());
		coinBox.add(new Coin(value));
		System.out.println("동전이 투입되었습니다.");
	}

	private static void showMenu(Stack<Coin> coinBox) {
		Iterator<Coin> iter = coinBox.iterator();
		if (coinBox.size() != 0) {
			System.out.print("현재 동전 상태: [");
			while (iter.hasNext()) {
				System.out.print(iter.next().getValue()+"원");
				if (iter.hasNext()) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		System.out.println("1. 동전 투입");
		System.out.println("2. 동전 꺼내기");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택: ");
	}
}
