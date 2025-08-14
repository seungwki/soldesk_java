package chapter09;

public class Car {
	String name;
	static int total;
	public Car(String name) {this.name = name;System.out.println("이름 : "+name);total++;}
	static void showTotalCars() {System.out.printf("구매한 차량 수 : %d\n", total);}
}