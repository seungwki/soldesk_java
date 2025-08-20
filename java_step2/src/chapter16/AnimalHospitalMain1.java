package chapter16;

public class AnimalHospitalMain1 {
	public static void main(String[] args) {
		AnimalHospital1 animalHospital1 = new AnimalHospital1();
		AnimalHospital1 animalHospital2 = new AnimalHospital1();

		Dog dog1 = new Dog("dog1", 100);
		Dog dog2 = new Dog("dog2", 150);
		Cat cat1 = new Cat("cat1", 50);
		Cat cat2 = new Cat("cat2", 70);

		animalHospital1.set(dog1);
		animalHospital2.set(cat1);

		animalHospital1.checkUp();
		animalHospital2.checkUp();

		System.out.println(animalHospital1.compareSize(dog2));
		System.out.println(animalHospital2.compareSize(cat2));
		// 여기까진 정상시나리오 정상작동

		// 재활용이 가능해졌다.
		// 타입의 안정성은 떨어진다.

		// 문제1 : 개병원(병원1)에 고양이 전달(컴파일 오류 x)
		System.out.println("========= Problem 1 ============");
		animalHospital1.set(cat2);
		animalHospital1.checkUp();// 문제없이 실행된다
		// 문제2 : 고양이 병원에 개 비교(컴파일 오류 x)
		System.out.println("========= Problem 2 ============");
		System.out.println(animalHospital2.compareSize(dog1));// 실행하면 뻗지도 않는다.
		// 차라리 뻗어다오
		// 문제2 : 캐스팅 문제
		animalHospital1.set(dog1);
		Dog biggerDog = (Dog) animalHospital1.compareSize(new Dog("멍멍이2", 200));
		System.out.println(biggerDog);
	}
}