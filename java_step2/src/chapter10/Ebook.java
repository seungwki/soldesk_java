package chapter10;

public class Ebook extends Book {
	String format;

	public Ebook(String name, String author, String format) {
		super(name, author);
		this.format = format;
	}

	@Override
	void display() {
		super.display();
		System.out.println("형식:"+format);
	}
}