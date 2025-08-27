package chapter23;

import static chapter23.MyLogger.*;

public class ManyThreadMain2 {
	public static void main(String[] args) {
		log("main() start");
		HelloRunnable helloRunnable = new HelloRunnable();
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(helloRunnable);
			thread.start();
		}
		log("main() end");
		//실행 순서가 뒤죽박죽이다.
	}
}