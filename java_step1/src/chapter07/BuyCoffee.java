package chapter07;

public class BuyCoffee {
	public static void main(String[] args) {
		Cafe cafe = new Cafe("cafeA");
		Customer customer1 = new Customer("Kim", 12000);
		Customer customer2 = new Customer("Park", 10000);

		customer1.visitCafe(cafe, 1500);
		customer1.showInfo();
		cafe.showInfo();
		customer2.visitCafe(cafe, 4500);
		customer2.showInfo();
		cafe.showInfo();
	}
}