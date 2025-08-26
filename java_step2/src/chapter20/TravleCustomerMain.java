package chapter20;

import java.util.ArrayList;
import java.util.List;

public class TravleCustomerMain {
	public static void main(String[] args) {
		List<TravleCustomer> tcList = new ArrayList<TravleCustomer>();
		
		tcList.add(new TravleCustomer("Kim java", 31, 10700));
		tcList.add(new TravleCustomer("Jo java", 42, 20700));
		tcList.add(new TravleCustomer("Lee java", 55, 30700));
		
		System.out.println("==== Print Customer List ====");
		tcList.stream()
					.map(c ->c.getName())
					.forEach(s -> System.out.println(s));
		
		System.out.println("==== Print Customer total price ====");
		int priceSum = tcList.stream()
					.mapToInt(c -> c.getPrice())
					.sum();
		System.out.println(priceSum);
		
		System.out.println("==== Print Customer older than norma ====");
		tcList.stream()
				.filter(tc -> tc.getAge() >=40)
				.map(tc -> tc.getName())//순서 바뀌면 안됨
				.sorted()
				.forEach(tc -> System.out.println(tc));
		
	}
}