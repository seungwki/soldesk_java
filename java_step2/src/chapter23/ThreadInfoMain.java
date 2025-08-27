package chapter23;

import static chapter23.MyLogger.*;

public class ThreadInfoMain {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		log("mainThread : " + mainThread);
//		log("mainThread.threadId() : " + mainThread.threadId());
		log("mainThread.getName() : " + mainThread.getName());
		log("mainThread.getPriority() : " + mainThread.getPriority()); // 5 << 기본. 1~10을 갖는다.
		log("mainThread.getState() : " + mainThread.getState());
		//state -> Runnable : 스레드가 실행중/실행 준비 상태
		System.out.println("===============");
		//myThread 스레드
		Thread myThread = new Thread(new HelloRunnable(), "myThread");
		log("myThread : " + myThread);
		log("myThread.getName() : " + myThread.getName());
		log("myThread.getPriority() : " + myThread.getPriority()); // 5 << 기본. 1~10을 갖는다.
		log("myThread.getState() : " + myThread.getState());
		//state -> NEW : 생성만 되고 start 되지 않음.
		//그 외에도 block, terminated 등이 있다.
	}
}
