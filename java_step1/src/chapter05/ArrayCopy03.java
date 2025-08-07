package chapter05;

//깊은 복사(Shallow copy) 예제
public class ArrayCopy03 {
	public static void main(String[] args) {
		// 배열 선언 및 요소 생성
		Book[] library1 = new Book[3];
		Book[] library2 = new Book[3];
		library1[0] = new Book("책1", "저자1");
		library1[1] = new Book("위키1", "유저1");
		library1[2] = new Book("백설 공주", "그림 형제");

		// 배열1 출력
		System.out.println("<< Library 1 >>");
		for (int i = 0; i < library1.length; i++) {
			library1[i].showBookInfo();;
		}
//		// 배열1 확인
//		for (int i = 0; i < library1.length; i++) {
//			System.out.println(library1[i].getName());
//			System.out.println(library1[i].getAuthor());
//		}
		// 배열2 초기화
		for (int i = 0; i < library2.length; i++) {
			library2[i] = new Book();
		}
		// 배열2 출력
		System.out.println("<< Library 2 >>");
		for (int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
		}
		// 깊은 복사 실행
		for (int i = 0; i < library2.length; i++) {
//			library2[i] = new Book();
//			library2[i] = library1[i];
			library2[i].setName(library1[i].getName());
			library2[i].setAuthor(library1[i].getAuthor());
		}
		// 배열 2 출력
		System.out.println("<< Library 2 >>");
		System.out.println("▼▼▼▼▼  copied  ▼▼▼▼▼");
		for (int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
		}
		// 배열 1 수정
		library1[0].setName("위키2");
		library1[0].setAuthor("유저2");
		// 배열 1 출력
		System.out.println("▼▼▼▼▼  modified  ▼▼▼▼▼");
		System.out.println("<< Library 1 >>");
		for (int i = 0; i < library1.length; i++) {
			System.out.println(library1[i]);
		}
		// 배열 2 출력
		System.out.println("▼▼▼▼▼  still keeping ▼▼▼▼▼");
		System.out.println("<< Library 2 >>");
		for (int i = 0; i < library2.length; i++) {
			System.out.println(library2[i]);
		}
	}
}
