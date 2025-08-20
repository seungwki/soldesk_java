package chapter16;

@Deprecated
//지나치게 넓은 범위를 받을 수 있어 문제가 된다. AnimalHospital3으로 갈 것.
public class AnimalHospital2<T> {
	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkUp() {
//		System.out.println("This " + animal.getClass().getName()+ " name >> " + animal.getName());
//		System.out.println("This " + animal.getClass().getName()+ " size >> " + animal.getSize());
//		animal.sound();
		// T가 animal인지 알 수 없으므로 이 시점에선 컴파일 에러가 발생한다.
		animal.toString();// animal의 오버라이딩 된 toString을 사용한다.
		animal.equals(null);
	}

	public T compareSize(T target) {//당장은 null로 하고, T에 해당하는게 있다면 오버라이딩 된 메서드가 실행 
		return null;
	}
}
