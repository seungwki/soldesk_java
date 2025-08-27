package chapter23;

public class HelloRunnableMain {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() start");
		HelloRunnable hr = new HelloRunnable();
		Thread th= new Thread(hr);
		th.start();//thread의 생성. 이후 main은 자기 코드 마저 실행 함
		System.out.println(Thread.currentThread().getName() + " : main() end");
	}
}