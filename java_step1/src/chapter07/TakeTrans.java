package chapter07;

public class TakeTrans {
	public static void main(String[] args) {
		StdInfo std1 = new StdInfo("엄자바", 12500);
		StdInfo std2 = new StdInfo("준자바", 10000);
		Bus bus1  = new Bus(1440);
		Bus bus2 = new Bus(440);
		Subway subway1 = new Subway("신수인분당서해GTX마음화");
		Subway subway2 = new Subway("612837659");
		std1.takeBus(bus1);
		std1.takeSubway(subway1);
		std2.takeBus(bus2);
		std2.takeSubway(subway2);
		std1.showInfo();
		std2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		subway1.showInfo();
	}
}