package chapter10;

/*
 * 클래스 : Book
 * 멤버 변수 : name, author
 * 메소드 : 필드 출력
 * Book을 상속하는 Ebook을 만들고, String format을 추가.
 * 이와 연관 된 메서드 추가.
 * 메서드 오버라이딩은 취사.
 * 제목 : 위대한 개츠비
 * 저자 : 스콧 피츠제럴드
 * 
 * 제목 : 앵무새 죽이기
 * 저자 : 하퍼 리
 * 형식 : PDF
 * */
public class Example02Main {
	public static void main(String[] args) {
		Book book = new Book("위대한 개츠비", " 스콧 피츠제럴드");
		Ebook ebook = new Ebook("앵무새 죽이기", "하퍼 리", "PDF");
		book.display();
		System.out.println();
		ebook.display();
	}
}