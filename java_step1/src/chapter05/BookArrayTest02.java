package chapter05;

public class BookArrayTest02 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book();
		library[1] = new Book("사람 이름이 될 수 없는 것에 대하여", "엄준식");
		library[2] = new Book("백설 공주", "그림 형제");
		library[3] = new Book("흑설 공주", "글 형제");
		library[4] = new Book("어린 공주", "어린 형제");
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		System.out.println("-------------------------------");
		for (int i = 0; i < library.length; i++) {
			System.out.println(
			library[i].toString());
		}
	}
}