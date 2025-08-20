package chapter16;

public class AnimalHospital3<T extends Animal> {
	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkUp() {
		System.out.println("This " + (animal.getClass().getSimpleName()) + " name >> " + animal.getName());
		System.out.println("This " + animal.getClass().getSimpleName() + " size >> " + animal.getSize());
		animal.sound();
	}

	public Animal compareSize(T target) {
		return this.animal.getSize() > target.getSize() ? this.animal : target;
	}
}
