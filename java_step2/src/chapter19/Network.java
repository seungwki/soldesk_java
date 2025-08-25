package chapter19;

public class Network {
	public void sendMessage(String text) {
		NetworkMessage nm = new NetworkMessage(text);
		nm.print();
	}
}