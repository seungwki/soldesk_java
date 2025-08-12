package chapter09;

public class Bank {
	private String name;
	private String tel;
	static float interest;

	public Bank(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public void getBank() {
		System.out.printf("지점 : %s\n전화번호 >> %s\n은행이자 >> %.2f\n", name, tel, interest);
	}
}