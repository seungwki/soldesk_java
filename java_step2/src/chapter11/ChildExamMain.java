package chapter11;

public class ChildExamMain {
	public static void main(String[] args) {

		ChildExam ce1 = new ChildExam();
		System.out.println(ce1.getCar());
		System.out.println(ce1.getMoney());
		System.out.println(ce1.getStr());

		System.out.println("-------------------");
		// ce1이 PE 그자체, 또는 PE의 상속클래스인지 체크
		if (ce1 instanceof ParentExam) {
			System.out.println("ce1 은 Pe의 자식클래스 입니다.");
		}
		System.out.println("-------------------");
		ParentExam pe1 = new ParentExam();
		if (pe1 instanceof ParentExam && pe1.getClass().equals(ParentExam.class)) {
			System.out.println("pe1은 Pe 그 자체 입니다.");
		}
		System.out.println("-------------------");
		ChildExam c2 = new ChildExam();
		ParentExam p2 = new ParentExam();
		// 업캐스팅
		p2 = c2;
		System.out.println(p2.getMoney());
		System.out.println(p2.getStr());
//		System.out.println(p2.getCar());// 안된다(자식 클래스만 가지고 있는 것인데, 해당 인스턴스는 부모 클래스이기 때문.
		System.out.println("-------------------");
		c2 = (ChildExam)p2;//명시적 형변환을 통한 다운 캐스팅
		System.out.println(p2.getMoney());
		System.out.println(p2.getStr());
		System.out.println(c2.getCar());
	}
}