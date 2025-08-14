package chapter10;

public class Book {
	String name;
	String author;
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	void display() {
		System.out.println("제목:"+name);
		System.out.println("저자:"+author);
	}
}