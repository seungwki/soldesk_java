package chapter17;

public class ShoppingCartMain {
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		Item item1 = new Item("item1", 2000, 2);
		Item item2 = new Item("item2", 3000, 4);
		sc.addItem(item1);
		sc.addItem(item2);
		
		sc.displayItems();
	}
}