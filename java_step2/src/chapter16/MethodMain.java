package chapter16;

public class MethodMain {
	public static void main(String[] args) {
		
	Dog dog1 = new Dog("dog1",300);
	Dog dog2 = new Dog("dog2",350);
	Cat cat1 = new Cat("cat1",200);
	
	AnimalMethod.checkUp(dog1);
	AnimalMethod.checkUp(cat1);
	System.out.println(AnimalMethod.compareSize(dog1, dog2));
	System.out.println(AnimalMethod.compareSize(dog1, cat1));//이래도 되나?
	}
}