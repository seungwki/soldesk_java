package chapter14;

public class ProductMain {
	public static void main(String[] args) {
		Product product = new Product("스마트폰", 700000);
		System.out.println(product);
		System.out.println(product.toString());
	}
}