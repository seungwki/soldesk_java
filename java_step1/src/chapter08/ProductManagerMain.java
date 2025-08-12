package chapter08;

public class ProductManagerMain {
	public static void main(String[] args) {
		ProductManager pm1 = new ProductManager();
		ProductManager pm2 = new ProductManager();
		pm1.addProduct("상품1", 44123);
		pm2.addProduct("상품2", 7723891,12);
	}
}