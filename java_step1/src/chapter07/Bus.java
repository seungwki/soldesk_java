package chapter07;

public class Bus {
	//멤버 변수
	int busNum;
	int passengerCount;
	int charge;
	//생성자
	public Bus(int number) {
		this.busNum = number;
	}
	//메서드
	public void takeIn(int charge) {
		this.charge += charge;
		passengerCount++;
	}
	public void takeOut() {
		passengerCount--;
	}
	public void showInfo() {
		System.out.printf("%d번 버스 탑승객은 %d명, 수입은 %d원 입니다.\n",busNum,passengerCount,charge);
	}
}