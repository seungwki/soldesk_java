package chapter05;

public class BookArrayTest01 {
	public static void main(String[] args) {
		Book[] bookArr;
		bookArr = new Book[5];

		for (int i = 0; i < bookArr.length; i++) {
			bookArr[i] = new Book();
			bookArr[i].setName("The Book of "+i);
			bookArr[i].setAuthor("eclipse "+i);
			System.out.println(bookArr[i]);
		}
	}
}