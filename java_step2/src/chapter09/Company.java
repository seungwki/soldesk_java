package chapter09;

//싱글톤 패턴의 예제
public class Company {
	private static Company instance = new Company();

	private Company() {
		
	}

	// 싱글톤 객체 생성 메소드
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}