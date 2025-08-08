package chapter06;

/*시나리오
 * 10000원 입금, 9000원 출금, 2000원 출금 시도 및 실패(잔액 부족 출력), 잔고 출력(1000원)
 * */
public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.deposit(10000);
		ac.withdraw(9000);
		ac.withdraw(2000);
		System.out.println(ac.balance);
	}
}