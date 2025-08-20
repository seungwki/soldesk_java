package chapter16;

public class Animal {
	private String name;
	private int size;

	public Animal(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "name : " + name + ", size : " + size;
	}

	public void sound() {
		System.out.println("Animal sound");
	}
}
