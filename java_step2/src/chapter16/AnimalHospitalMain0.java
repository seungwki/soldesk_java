package chapter16;

public class AnimalHospitalMain0 {
	public static void main(String[] args) {
		DogHospital dogHospital = new DogHospital();
		CatHospital catHospital = new CatHospital();

		Dog dog1 = new Dog("dog1", 100);
		Dog dog2 = new Dog("dog2", 150);
		Cat cat1 = new Cat("cat1", 50);
		Cat cat2 = new Cat("cat2", 70);

		dogHospital.set(dog1);
		catHospital.set(cat1);

		dogHospital.checkUp();
		catHospital.checkUp();

		System.out.println(dogHospital.compareSize(dog2));
		System.out.println(catHospital.compareSize(cat2));
	}
}