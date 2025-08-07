package chapter06;

public class Car {
	// 멤버 변수 필드
	// 접근제어자를 생략하면 같은 패키지 내에서만 접근 가능.
	String name;
	String color;
	int number;

	// 유사 toString
	public void showCarInfo() {
		System.out.println("name > " + name + "color > " + color + "number > " + number);
	}

	/*
	// 풀 생성자
	public Car(String inputName, String inputColor, int inputNumber) {
		this.name = inputName;
		this.color = inputColor;
		this.number = inputNumber;
	}*/

	// Getter Setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
}