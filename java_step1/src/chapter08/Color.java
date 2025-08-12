package chapter08;
/*
 * 생성자 오버로딩 하시요
 * 생성자 1 : int 값을 받아 blue에 대입
 * 생성자 2 : 멤버변수들을 매개변수로 받아 인스턴스 자기 자신에 대입하시오
 * main()에서 인스턴스 만들어 대입한 값을 출력하시오.
 * */
public class Color {
	public int red;
	public int blue;
	public int green;
	
	public Color(int blue) {
		this.blue = blue;
	}

	public Color(int red, int blue, int green) {
		super();
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
}