package chapter07;

public class AccessTest {
	//멤버 변수 == 필드
	private int num1;
	public int num2;
	int num3;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	//디폴트 생성자(생략 가능)
	
	//메서드
		//getter, setter
	public void display() {
		System.out.printf("num1 : %d\num2 : %d\nnum3 : %d\n",num1,num2, num3);
	}
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.setNum1(15);
		at.num2=3;
		at.num3=123;
		at.setNum3(4);
		at.display();
	}
}

/*
	private : 동일 클래스 내부에서 접근 가능.
		동일 패키지 내부에선 접근 불가
		외부 패키지에서도 당연히 접근 불가.
		상속 받아도 안됨.
	default : 동일 클래스, 동일 패키지에서 접근 가능.
		외부 패키지, 상속자 접근 불가
	protected : 동일 클래스, 동일 패키지, 상속클래스 접근 가능.
		외부 패키지 접근 불가
	public : 동일 클래스, 동일 패키지, 상속클래스, 외부 패키지 모두 접근 가능.
 */