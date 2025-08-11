package chapter07;

public class StdInfo {
	//멤버변수==필드
	String name;
	int grade;
	int money;
	
	//생성자
	public StdInfo(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메서드
	public void takeBus(Bus bus) {
		int money = 1000;
		bus.takeIn(money);
		this.money -= money;
	}
	public void takeSubway(Subway subway) {
		int money = 1550;
		subway.takeIn(money);
		this.money -= money;
	}
	public void showInfo() {
		System.out.printf("%s의 현재 잔액은 %d원 입니다.\n",name, money);
	}
}