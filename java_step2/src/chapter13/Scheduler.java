package chapter13;

public interface Scheduler {
	// 다음 콜 가져오기
	public void getNextCall();
	// 상담원에게 콜 전달
	public void sendCallToAgent();
	
}