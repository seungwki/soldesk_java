package chapter07;

public class Cafe {
	String name;
//	String[] menu;
//	int price;
	int money;

	public Cafe(String name) {
		this.name = name;
	}

	public void sell(int amount) {
		money += amount;
	}
	public void showInfo() {
		System.out.printf("%s의 매출은 %d원 입니다\n",name,money);
	}
}
