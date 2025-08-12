package chapter09;

public class BankMain {
	public static void main(String[] args) {
		Bank bank1 = new Bank("강남점", "442125");
		bank1.interest = 0.2f;
		Bank bank2 = new Bank("강북점", "461353156");
		Bank bank3 = new Bank("인천점", "7896121245");
		bank1.getBank();
		bank2.getBank();
		bank3.getBank();
	}
}