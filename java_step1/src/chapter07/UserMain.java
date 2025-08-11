package chapter07;

//사용자 이름과 나이 정보를 출력하는 메소드 printInfo()를 구현하시오
//이름만 받거나, 이름과 나이를 받을 수 있도록 생성자를 오버로딩
//main에서 2개의 인스턴스를 만들어 메소드 printInfo()를 구현하시오
public class UserMain {
public static void main(String[] args) {
	User user1 = new User("모니터");
	User user2 = new User("프린터",33);
	user1.printInfo();
	user2.printInfo();
}
}