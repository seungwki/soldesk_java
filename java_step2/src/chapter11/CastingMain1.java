package chapter11;

public class CastingMain1 {
	public static void main(String[] args) {
		//up casting
		Parent01 p1 = new Child01();//자식 인스턴스 참조하는 부모 변수. 자식 인스턴스의 주소를 갖는다.
//		p1.childMethod();// 안된다.
		p1.parentMethod();//자식 기능 호출 x.
		
		//down casting 부모를 자식으로.
		Child01 c1 = (Child01)p1;
		c1.parentMethod();
		c1.childMethod();
		
		//자식 클래스를 만들 때는 상속해줘야하는 부모클래스도 같이 만들고 자식을 만드니까 자식을 만들어도 부모를 호출하는데에 안전하지만
		//부모클래스만 만들 때는 자식 클래스를 따로 만들지 않으므로 명시적 형변환을 해줘야 한다.
	}
}