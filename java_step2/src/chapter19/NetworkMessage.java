package chapter19;

public class NetworkMessage {
	private String contents;

	public NetworkMessage(String contents) {
		this.contents = contents;
	}

	public void print() {
		System.out.println(contents);
	}
}