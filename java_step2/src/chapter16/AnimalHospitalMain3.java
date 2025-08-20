package chapter16;

public class AnimalHospitalMain3 {
	public static void main(String[] args) {
		// 재사용성과 안정성을 동시에 확보 할 수 있다.
		AnimalHospital3<Dog> hospital1 = new AnimalHospital3<>();
		AnimalHospital3<Cat> hospital2 = new AnimalHospital3<>();
//		AnimalHospital3<Integer> hospital2 = new AnimalHospital3<>();//컴파일 에러
//		AnimalHospital3<String> hospital2 = new AnimalHospital3<>();//컴파일 에러

		Dog dog1 = new Dog("dog1", 100);
		Dog dog2 = new Dog("dog2", 150);
		Cat cat1 = new Cat("cat1", 50);
		Cat cat2 = new Cat("cat2", 70);

		hospital1.set(dog1);
		hospital2.set(cat1);
		//괭이병원에 개 전달 시도
//		hospital2.set(dog1);//컴파일 에러 → 타입 안정성이 높아졌다.

		hospital1.checkUp();
		hospital2.checkUp();

		System.out.println(hospital1.compareSize(dog2));
		System.out.println(hospital2.compareSize(cat2));
		//서로 다른 종류의 클래스를 대입.
//		System.out.println(hospital1.compareSize(cat2));//컴파일 에러(연산의 가불 문제가 아니라 매개변수로 넣을 때 타입 안 맞는 문제)
//		System.out.println(hospital2.compareSize(dog2));//컴파일 에러 → 타입 안정성이 높아졌다. 
	}
}