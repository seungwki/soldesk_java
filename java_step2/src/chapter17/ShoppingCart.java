package chapter17;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
	List<Item> ls = new LinkedList<>();

	public void addItem(Item item) {
		ls.add(item);
	}

	public void displayItems() {
		int total = 0;
		System.out.println("장바구니 상품 출력");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("상품명:" + ls.get(i).getName() + ", 합계:" + ls.get(i).getTotalPrice());
			total += ls.get(i).getTotalPrice();
		}
		System.out.println("전체 가격 합 :" + total);
	}
}