package chapter05;

//얕은 복사(Shallow copy) 예제
public class ArrayCopy02 {
	public static void main(String[] args) {
		Book[] library1 = new Book[3];
		Book[] library2 = new Book[3];
		library1[0] = new Book();
		library1[1] = new Book("사람 이름이 될 수 없는 것에 대하여", "엄준식");
		library1[2] = new Book("백설 공주", "그림 형제");
		for (int i = 0; i < library1.length; i++) {
			System.out.println(library1[i]);
		}
		System.out.println("------▼▼▼▼▼copied▼▼▼▼▼----------");
		System.arraycopy(library1, 0, library2, 0, library1.length);
		for (int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
		}
		System.out.println("------▼▼▼▼▼modified▼▼▼▼▼----------");
		library1[0].setName("나무위키");
		library1[0].setAuthor("우리 모두");
		for (int i = 0; i < library1.length; i++) {
			System.out.println(library1[i]);
		}
		System.out.println("------▼▼▼▼▼shallow copy▼▼▼▼▼----------");
//		System.arraycopy(library1, 0, library2, 0, library1.length);
		for (int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
		}
	}
}
