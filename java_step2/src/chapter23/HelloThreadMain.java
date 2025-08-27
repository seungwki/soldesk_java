package chapter23;

public class HelloThreadMain {
	public static void main(String[] args) {
		HelloThread ht = new HelloThread();
		System.out.println(Thread.currentThread().getName() + " : main() start");
		
		System.out.println(Thread.currentThread().getName() + " : before call start()");
		ht.start(); // 스레드 생성. 이후 main은 나머지 함. 이후 ht의 내용이 담긴다.
		ht.run();//얘가 있으면 정방향이 되고 없으면 ht.start가 가장 마지막에 나온다. 왜?
		System.out.println(Thread.currentThread().getName() + " : after call start()");
		
		System.out.println(Thread.currentThread().getName() + " : main() end");
	}
}