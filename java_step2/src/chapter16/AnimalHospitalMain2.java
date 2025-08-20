package chapter16;

public class AnimalHospitalMain2 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("dog1", 100);
		Dog dog2 = new Dog("dog2", 150);
		Cat cat1 = new Cat("cat1", 50);
		Cat cat2 = new Cat("cat2", 70);
		AnimalHospital2<Dog> hospital1 = new AnimalHospital2<>();
		AnimalHospital2<Cat> hospital2 = new AnimalHospital2<>();
//		AnimalHospital2<Integer> hospital3 = new AnimalHospital2<>();//코메디가 따로없구나
//		AnimalHospital2<String> hospital4 = new AnimalHospital2<>();//코메디가 따로없구나

//		hospital1.set(dog1);
//		hospital2.set(dog1);

//		animalHospital1.checkUp();
//		animalHospital2.checkUp();

//		System.out.println(animalHospital1.compareSize(dog2));
//		System.out.println(animalHospital2.compareSize(cat2));
		// 정상작동
		// 문제1 : 개병원에 고양이 전달(컴파일 오류 x)
		// 재활용이 가능해졌다.
		// 타입의 안정성은 떨어진다.
		System.out.println("===================================================");
//		animalHospital1.set(cat2);
//		animalHospital1.checkUp();
		// 문제2 : 개 병원에 고양이 비교(컴파일 오류 o)
	}
}