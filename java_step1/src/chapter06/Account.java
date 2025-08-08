package chapter06;

//은행 계좌 클래스의 설계
// static 키워드를 사용하지 않는다.
// accountMain을 만들어 실행 할 것
/*시나리오
 * 10000원 입금, 9000원 출금, 2000원 출금 시도 및 실패(잔액 부족 출력), 잔고 출력(1000원)
 * */
public class Account {
	int balance;// 잔액

	public Account() {
		// TODO Auto-generated constructor stub
	}

	protected void deposit(int amount) {
		// 입금 시 잔액 증가
		balance += amount;
	}

	protected void withdraw(int amount) {
		// 출금 시 잔액 감소, 잔고보다 부족한 금액 시도 시 잔액 부족 출력
		if (amount > balance)
			System.out.println("잔액 부족");
		else
			balance -= amount;
	}
}
