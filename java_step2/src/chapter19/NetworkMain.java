package chapter19;

public class NetworkMain {
	public static void main(String[] args) {
		Network network = new Network();
		network.sendMessage("Hello java");
		
		NetworkMessage nm = new NetworkMessage("qweqwe");
		nm.print();
	}
}