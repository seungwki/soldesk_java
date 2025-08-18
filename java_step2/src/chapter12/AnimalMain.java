package chapter12;

public class AnimalMain {
	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		animalSound(new Dog());
		animalSound(cat);
		cat.sound();
	}
}