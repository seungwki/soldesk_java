package chapter16;

public class AnimalHospital1 {
	private Animal animal;

	public void set(Animal animal) {
		this.animal = animal;
	}

	public void checkUp() {
		System.out.println("This " + animal.getClass().getName()+ " name >> " + animal.getName());
		System.out.println("This " + animal.getClass().getName()+ " size >> " + animal.getSize());
		animal.sound();
	}

	public Animal compareSize(Animal target) {
		return this.animal.getSize() > target.getSize() ? this.animal : target;
	}
}
