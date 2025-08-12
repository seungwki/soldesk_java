package chapter09;
//static에 대해 알아봅시다.
public class Data3 {
	public String name;
	//static 변수 = 정적 변수 == 클래스 변수
	//공용으로 함께 사용하는 변수
	public static int count;

	public Data3(String name) {
		this.name = name;
		count++;
	}
	
}
