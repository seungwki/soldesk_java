package chapter05;

public class Book {
	// 멤버변수 == 필드
	public String name;
	public String author;

	// 생성자(Constructor) : 클래스와 이름이 같은 메서드
	public Book() {// 기본생성자
//		name = "!nameless";
//		author = "!authorless";
	}

	public Book(String name, String author) {// 인자 추가한 생성자
		this.name = name;
		this.author = author;
	}
	// 메서드
	// Getter
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	//사용자 정의 메서드
	public void showBookInfo() {
		System.out.println("Book name : " + name + "| Author : " + author);
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Book name : " + name + ", Author : " + author;
	}
}