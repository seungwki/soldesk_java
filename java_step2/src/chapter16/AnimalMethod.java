package chapter16;

public class AnimalMethod {
	public static <T extends Animal> void checkUp(T t) {
		System.out.println("Animal name >> " + t.getName());
		System.out.println("Animal size >> " + t.getSize());
		System.out.println("Animal kind >> " + t.getClass().getSimpleName());
		t.sound();
	}

	public static <T extends Animal> T compareSize(T t1, T t2) {
//		if(t1.getClass().equals(t2.getClass()))
			return t1.getSize() >= t2.getSize() ? t1 : t2;
//		return null;
	}
}