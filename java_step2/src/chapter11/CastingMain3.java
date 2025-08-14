package chapter11;

public class CastingMain3 {
	public static void main(String[] args) {
		Parent01 p1 = new Child01();
		Child01 c1 = (Child01) p1;
		c1.childMethod();
		Parent01 p2 = new Parent01(); 
		Child01 c2 = (Child01) p2;//자식이 ㅈ존재하지 않아 에러 발생
		c2.childMethod();
		//런타임 에러.
		// p1에선 c1로 경 가능.
		//p2에선 c2로 변경 불가능
	}
}