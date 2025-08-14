package chapter10;

public class Bus extends Vehicle {
	@Override
	void start() {
		super.start();//부모 클래스의 메서드 호출
		System.out.println("버스부릉");
	}
}
