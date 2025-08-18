package chapter13;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("짧은 것 우선으로 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("짧은거 보내줌");
	}

}
