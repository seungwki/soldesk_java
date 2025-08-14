package chapter10;

public class Ani {
	void makeSound() {
		System.out.println("동물 소리");
	}
}

class Dog extends Ani{
	@Override
	void makeSound() {
//		super.makeSound();
		System.out.println("개소리");
	}
}