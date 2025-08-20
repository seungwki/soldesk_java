package chapter16;

public class DogHospital {
	private Dog dog;

	public void set(Dog dog) {
		this.dog = dog;
	}

	public void checkUp() {
		System.out.println("This dog name >> " + dog.getName());
		System.out.println("This dog size >> " + dog.getSize());
		dog.sound();
	}

	public Dog compareSize(Dog target) {
		return this.dog.getSize() > target.getSize() ? this.dog : target;
	}
}