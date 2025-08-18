package chapter11;

public class CustomerMain {
	public static void main(String[] args) {
		int price = 10000;
		System.out.println("--------vip--------");
		Vipcustomer vip1 = new Vipcustomer(1004, "김종민", 900);
		System.out.println("name >>" + vip1.getCustomerName() + "(" + vip1.getCustomerGrade() + ")");
		System.out.println("Original price >> " + price);
		System.out.println("Vip price >> " + vip1.calcPrice(price));
		System.out.println("Bonus point >> " + vip1.getBonusPoint());
		System.out.println(vip1.showCustomer());
		System.out.println("--------jyp--------");
		Customer customer1 = new Customer(1005, "박중만");
		System.out.println("name >>" + customer1.getCustomerName() + "(" + customer1.getCustomerGrade() + ")");
		System.out.println("Original price >> " + price);
		System.out.println("Price >> " + customer1.calcPrice(price));
		System.out.println("Bonus point >> " + customer1.getBonusPoint());
		System.out.println(customer1.showCustomer());
		System.out.println("--------jyp(2)--------");
		Customer customer2 = new Customer(1006, "양중만");
		System.out.println("name >>" + customer2.getCustomerName() + "(" + customer2.getCustomerGrade() + ")");
		System.out.println("Original price >> " + price);
		System.out.println("Price >> " + customer2.calcPrice(price));
		System.out.println("Bonus point >> " + customer2.getBonusPoint());
		System.out.println(customer2.showCustomer());
		System.out.println("--------vip(polymorph)--------");
		Customer vip2 = new Vipcustomer(1009, "황영인", 140);//다형성 상속
		System.out.println("name >>" + vip2.getCustomerName() + "(" + vip2.getCustomerGrade() + ")");
		vip2.bonusPoint = 1000;
		System.out.println("Original price >> " + price);
		System.out.println("Vip price >> " + vip2.calcPrice(price));
		System.out.println("Bonus point >> " + vip2.getBonusPoint());
		System.out.println(vip2.showCustomer());
	}
}