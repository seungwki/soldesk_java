package chapter07;

public class VendingMachine {
	private Can[] canArr = new Can[5];
	private int money;

	// 메서드
	public void init() {
		for (int i = 0; i < canArr.length; i++) {
			canArr[i] = new Can("음료" + (i+1), 500 * (i + 2));
		}
	}

	// 사용 가능한 음료 보여주기(돈 입력 받고, 그 입력으로 가능한 음료수만 출력 할 것
	public void showList(int money) {
		int index = 1;
		this.money = money;
		for (int i = 0; i < canArr.length; i++) {
			if (canArr[i].getPrice() <= money) {
				System.out.printf("%d) %s(%d)\n", index, canArr[i].getName(), canArr[i].getPrice());
				index++;
			}
		}
	}

	// 선택한 음료수 제공과 잔액(목록에 없는거 골라도 예외처리는 x. 잔액 음수 됨.)
	public void serveCan(String order) {
		for (int i = 0; i < canArr.length; i++) {
			if (order.equals(canArr[i].getName())) {
				this.money -= canArr[i].getPrice();
				break;
			}
		}
		System.out.println(order + " is selected.");
		System.out.println("remain : " + money);
	}
}