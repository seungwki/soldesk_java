package chapter19;

public class Network2 {
	public void sendMessage(String text) {
		NetworkMessage2 nm = new NetworkMessage2(text);
		nm.print();
	}

	private static class NetworkMessage2 {
		private String contents;

		public NetworkMessage2(String contents) {
			this.contents = contents;
		}

		public void print() {
			System.out.println(contents);
		}
	}
}