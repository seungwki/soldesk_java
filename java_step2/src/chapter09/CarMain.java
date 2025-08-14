package chapter09;

/*
 * 생성 한 차량 수를 출력하는 Car 클래스를 만드시오.
 * 실행 결가
 * 이름 : 펠리세이드
 * 이름 : GV80
 * 이름 : EV4
 * 구매 한 차량 수  : 3
 * */
public class CarMain {
	public static void main(String[] args) {

		Car car1 = new Car("펠리세이드");
		Car car2 = new Car("GV80");
		Car car3 = new Car("EV4");

		Car.showTotalCars();
	}
}