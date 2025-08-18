package chapter13;

public class InterfaceAnimalMain {
	public static void main(String[] args) {
		InterfaceAnimal dog = new Dog();
		InterfaceAnimal cow = new Cow();
		soundAnimal(cow);
		soundAnimal(new Dog());
		cow.move();
		dog.move();
	}
	
	private static void soundAnimal(InterfaceAnimal animal) {
		animal.sound();
	}
}