package chapter13;

public class SmartTVMain {
	public static void main(String[] args) {
		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(4);
		stv.search("Soso Mahjong");
		stv.setVolume(15);
		stv.turnOff();

		System.out.println("-------------");
		Searchable tv = stv;
//		tv.turnOn();
//		tv.setVolume(4);
//		tv.setVolume(15);
//		tv.turnOff();//박살이 나고 있으니까
		tv.search("asdjhhjlwqer");

		System.out.println("-------------");
		Remote r = stv;
		r.turnOn();
		r.setVolume(8);
//		r.search("Soso Mahjong");//박살이 나고 있으니까
		r.setVolume(11);
		r.turnOff();
	}
}