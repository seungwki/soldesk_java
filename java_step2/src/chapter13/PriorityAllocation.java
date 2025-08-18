package chapter13;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("중요도 순서");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("중요한거 보내줌");
	}

}
