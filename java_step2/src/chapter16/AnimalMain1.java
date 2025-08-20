package chapter16;

public class AnimalMain1 {
	public static void main(String[] args) {
		Animal animal = new Animal("animal", 0);
		Dog dog = new Dog("Dog", 100);
		Cat cat = new Cat("cat", 50);

		AnimalBox<Dog> box1 = new AnimalBox<>();
		box1.setValue(dog);
		Dog boxDog = box1.getValue();
		System.out.println(boxDog);
		
		AnimalBox<Cat> box2 = new AnimalBox<>();
		box2.setValue(cat);
		Cat boxCat = box2.getValue();
		System.out.println(boxCat);
		
		AnimalBox<Animal> box3 = new AnimalBox<>();
		box3.setValue(animal);
		Animal boxAnimal = box3.getValue();
		System.out.println(boxAnimal);

		AnimalBox<Animal> box4 = new AnimalBox<>();
		box4.setValue(dog);
		Animal boxAnimal2 = box4.getValue();
		System.out.println(boxAnimal2);
		
	}
}