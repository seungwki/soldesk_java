package chapter07;

public class Customer {
	// 멤버변수 == 필드
	public String name;
	public int money;

	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void visitCafe(Cafe cafe, int amount) {
		cafe.sell(amount);
		this.money -= amount;
	}
	public void showInfo() {
		System.out.printf("%s의 잔액은 %d원 입니다.\n",name,money);
	}
}
