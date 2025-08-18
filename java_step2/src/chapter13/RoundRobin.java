package chapter13;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("요청을 순서대로 처리(우선순위 없음)");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("들어온 순서대로");
	}

}
