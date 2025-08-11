package chapter07;

public class Subway {
	//멤버 변수
	String line;
	int passengerCount;
	int charge;
	//생성자
	public Subway(String line) {
		this.line = line;
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
		System.out.printf("%s호선 지하철 탑승객은 %d명, 수입은 %d원 입니다.\n",line,passengerCount,charge);
	}
}