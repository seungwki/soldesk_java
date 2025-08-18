package chapter11;

public class Animal3Main {
	public static void main(String[] args) {
		Animal3[] animalArr = new Animal3[3];
		animalArr[0] = new Bear();
		animalArr[1] = new Lion();
		animalArr[2] = new Spider();

		for (int i = 0; i < animalArr.length; i++) {
			System.out.println("name : " + animalArr[i].getClass());
			System.out.println("eye >> " + animalArr[i].getEye());
			System.out.println("leg >> " + animalArr[i].getLeg());
			System.out.println("feature >> " + animalArr[i].getFeature());
		}
	}
}