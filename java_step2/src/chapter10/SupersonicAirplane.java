package chapter10;

public class SupersonicAirplane extends Airplane {
	//final 붙었으니 런타임 중에 변경 불가
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;

	@Override
	void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("촘속날라욧");
		} else {
			super.fly();
		}
	}
}