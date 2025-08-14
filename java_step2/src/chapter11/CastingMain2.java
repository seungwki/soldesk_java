package chapter11;

public class CastingMain2 {
	public static void main(String[] args) {
		Child01 c1 = new Child01();//자식 인스턴스 참조하는 부모 변수. 자식 인스턴스의 주소를 갖는다.
		Parent01 p1 = (Parent01) c1; //업캐스팅 : 부모 타입으로 변경하기
		Parent01 p2 = c1; //업캐스팅(생략 가능. 생략 권장.)
		//하위클래스를 만들 때 상위클래스까지 같이 생성하기 때문에 메모리 상 안전.
		p1.parentMethod();
		p2.parentMethod();
	}
}