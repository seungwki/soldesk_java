package chapter23;

import static chapter23.MyLogger.*;

public class ManyThreadMain1 {
	public static void main(String[] args) {
		log("main() start");
		HelloRunnable helloRunnable = new HelloRunnable();
		Thread thread1 = new Thread(helloRunnable, "A Thread");
		thread1.start();
		Thread thread2 = new Thread(helloRunnable, "B Thread");
		thread2.start();
		Thread thread3 = new Thread(helloRunnable, "C Thread");
		thread3.start();
		//모든 코드의 실행 순서가 뒤죽박죽임을 알 수 있다.== 실행 순서 보장 ㄴㄴ
		log("main() end");
		
	}
}