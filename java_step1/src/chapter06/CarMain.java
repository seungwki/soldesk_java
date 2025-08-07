package chapter06;

public class CarMain {
	//멤버 변수
	String carName;
	String carColor;
	int carNumber;
	
	//메서드
	public String getCarName() {return carName;}
	public void setCarName(String carName) {this.carName = carName;}
	
	// main
	public static void main(String[] args) {
		//객체 생성
		Car car1 = new Car();//참조 변수
		
		car1.showCarInfo();
		System.out.println("멤버 변수 사용 >>"+car1.name);//멤버 변수 사용
		System.out.println("메서드 사용 >>"+car1.getName());//메서드 사용
		System.out.println(car1.color);
		System.out.println(car1.number);
		car1.name = "브라타";//멤버 변수 참조
		car1.showCarInfo();
		car1.setName("엄준");
		car1.showCarInfo();
	}

}
