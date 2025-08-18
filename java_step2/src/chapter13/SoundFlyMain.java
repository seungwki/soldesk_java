package chapter13;

public class SoundFlyMain {
	public static void main(String[] args) {
		AbstractAnimal aa;
		System.out.println("========dog========");
		aa = new Dog2();
		soundAnimal(aa);
		aa.move();
		System.out.println("========bird========");
		aa = new Bird();
		soundAnimal(aa);
		aa.move();
		flyAnimal(new Bird());
//		flyAnimal(aa);//Bird()는 fly 의 implement지만 AA로 선언한 이상 fly의 구현체로 쳐주진 않음
//		Fly bird = new Bird();
//		soundAnimal(bird);//마찬가지
		Bird bird = new Bird();
		soundAnimal(bird);
		flyAnimal(bird);
		System.out.println("========chicken========");
		aa = new Chicken();
		soundAnimal(aa);
		aa.move();
		flyAnimal(new Chicken());
	}

	private static void soundAnimal(AbstractAnimal aa) {
		aa.sound();
	}

	private static void flyAnimal(Fly fly) {
		fly.fly();
	}
}