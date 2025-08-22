package chapter14;

class Book{
	String title;
	String author;
	public Book(String title, String author) {this.title = title;this.author = author;}
	@Override
	public String toString() {return "Book [title=" + title + ", author=" + author + "]";}
	
}
public class ToStringMain2 {
	public static void main(String[] args) {
		Book book1 = new Book("Book Name 1", "Um");
		Book book2 = new Book("Book Name 2", "Joon");
		Book book3 = new Book("Book Name 2", "Sik");
		System.out.println(book1);
		System.out.println(book1.toString());
		System.out.println(book2);
		System.out.println(book2.toString());
		System.out.println(book3);
		System.out.println(book3.toString());
		String str = new String("엄준식");//String class는 toString 클래스가 재정의 된 것이다
		System.out.println(str);
	}
}
