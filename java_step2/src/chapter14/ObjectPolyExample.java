package chapter14;

public class ObjectPolyExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		Object obj = new Object();
		Object[] arr = {dog, car, obj};
		size(arr);
	}
	private static void size(Object[] arr) {
		System.out.println("size >> "+arr.length);
	}
}