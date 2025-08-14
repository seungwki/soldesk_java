package chapter11;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		Animal h1 = new Human(); // ok
//		Tiger t1 = (Tiger)new Animal(); // 컴파일 에러 없어도 여기서 멈춤.
		at.moveAnimal(h1);
		at.moveAnimal(new Tiger());
		at.moveAnimal(new Eagle());
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

class Animal {
	public void move() {System.out.println("Animal move");}
}

class Human extends Animal {
	@Override
	public void move() {System.out.println("Human Move");}
	public void readBook() {System.out.println("Human Read Book");}
}

class Tiger extends Animal {
	@Override
	public void move() {System.out.println("Tiger Move");}
	public void hunt() {System.out.println("Tiger Hunt");}
}
class Eagle extends Animal {
	@Override
	public void move() {System.out.println("Eagle Move");}
	public void fly() {System.out.println("Eagle Fly");}
}