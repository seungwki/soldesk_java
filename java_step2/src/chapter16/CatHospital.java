package chapter16;

public class CatHospital {
	private Cat cat;

	public void set(Cat cat) {
		this.cat = cat;
	}

	public void checkUp() {
		System.out.println("This cat name >> " + cat.getName());
		System.out.println("This cat size >> " + cat.getSize());
		cat.sound();
	}

	public Cat compareSize(Cat target) {
		return this.cat.getSize() > target.getSize() ? this.cat : target;
	}
}