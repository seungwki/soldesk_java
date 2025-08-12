package chapter09;

public class DataCountMain3 {
	public static void main(String[] args) {
		Data3 d1 = new Data3("Data 1");
		System.out.println(d1.name+" >>> "+Data3.count);
		//인스턴스가 아닌, 클래스에서 인자를 뽑아낼 수 있는걸 주의하라.
		//"클래스 변수"라고 부르는 이유이다.
		Data3 d2 = new Data3("Data 2");
		System.out.println(d2.name+" >>> "+Data3.count);
		Data3 d3 = new Data3("Data 3");
		System.out.println(d3.name+" >>> "+Data3.count);
	}
}