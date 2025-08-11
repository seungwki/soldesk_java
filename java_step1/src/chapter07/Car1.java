package chapter07;

public class Car1 {
	//멤버변수 == 필드
	private String model;

	//메서드
		//getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public static void main(String[] args) {
		Car1 car = new Car1();
		car.setModel("SMASDMHUASDHAJSKD112783691293896124");
		System.out.println("Model >> "+car.getModel());
	}
}
