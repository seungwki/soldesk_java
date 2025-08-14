package chapter10;

public class SportsCar extends Car {
//	public void stop() {
//		System.out.println("자동차가 멈춥니다");
//		speed = 0;
//	}
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed >> " + speed);
	}
	
	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.speedUp();
		sc.speedUp();
		sc.speedUp();
 	}
}