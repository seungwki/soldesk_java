package chapter08;

public class ProductManager {
	//멤버변수 == 필드
		//없음
	
	public void addProduct(String name, int price) {System.out.println(name+"의 가격을 "+price+"원으로 추가.");}
	public void addProduct(String name, int price, int quantity) {System.out.println(name+"의 가격을 "+price+"원으로 "+quantity+"개 추가.");}
}
