package chapter07;

public class Car2 {
	//멤버 변수 == 필드
	private static String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static void main(String[] args) {
		//멤버변수 접근해서 모델 명 입력하고 출력하기
		Car2 car2 = new Car2();
		car2.model = "namsad";
		System.out.println(car2.model);
	}
}