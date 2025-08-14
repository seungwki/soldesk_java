package chapter10;

public class SupersonicAirplaneMain {
	public static void main(String[] args) {
		Airplane plane = new Airplane();
		SupersonicAirplane ssplane = new SupersonicAirplane();
		plane.takeoff();
		plane.fly();
		plane.land();

		ssplane.takeoff();
		ssplane.fly();
		ssplane.land();

		ssplane.flyMode = SupersonicAirplane.SUPERSONIC;
		ssplane.takeoff();
		ssplane.fly();
		ssplane.land();
	}
}