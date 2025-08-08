package chapter06;

public class FuncTest07 {
	// 기본 생성자 메서드 → (상황에 따라)생략 가능
	public FuncTest07() {
	}
	
	// 멤버 메서드(오버로딩)
	public void getResult(int input) {System.out.println(input + "은 int입니다.");}
	public void getResult(String input) {System.out.println(input + "은 String입니다.");}
	public void getResult(char input) {System.out.println(input + "은 char입니다.");}
	public void getResult(int number, String str) {System.out.println(number+"은 int이고, "+str+ "은 String입니다.");}
}