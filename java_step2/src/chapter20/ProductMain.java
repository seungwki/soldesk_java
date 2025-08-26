package chapter20;

import java.util.ArrayList;
import java.util.List;

//productMain 만들고
//제품은 5개
//노트북 120000, 키보드 20000, 마우스 150000, 모니터 80000, 프린터 60000
//ArrayList에 담을 것
//1) 가격이 5만원 이상인 것의 갯수 출력
//2) 가격이 3만원 이상이고 7만원 이하인 상품의 이름과 가격 출력
public class ProductMain {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<Product>();

		pList.add(new Product("노트북", 120000));
		pList.add(new Product("키보드", 20000));
		pList.add(new Product("마우스", 150000));
		pList.add(new Product("모니터", 80000));
		pList.add(new Product("프린터", 60000));
		
		//1) 가격이 5만원 이상인 것의 갯수 출력
		int count = (int) pList.stream()
					.filter(p -> p.getPrice()>=50000)
					.count();
		System.out.println("price >= 50000 : "+count);
		//2) 가격이 3만원 이상이고 7만원 이하인 상품의 이름과 가격 출력
		pList.stream()
					.filter(p -> p.getPrice()>=30000 && p.getPrice()<=70000)
					.forEach(p -> System.out.println("name : "+p.getName()+", price : "+p.getPrice()));
	}
}
