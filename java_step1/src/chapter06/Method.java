package chapter06;

import java.util.Scanner;

// 인자를 int 1개 받는 makeBread, 인자를 int, String 2개 받은 makeBread 2개를 오버로딩 할 것
// order 안에서 돌 것.
public class Method {
	// 멤버 변수 == 필드

	// 생성자(생략)

	// 메서드
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}

	public void makeBread(int q) {
		for (int i = 0; i < q; i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+q+"개의 빵이 모두 완료되었습니다.");
	}
	public void makeBread(int q, String name) {
		for (int i = 0; i < q; i++) {
			System.out.println((i+1)+"번째 "+name+" 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+q+"개의 "+name+" 빵이 모두 완료되었습니다.");
	}

	public void order() {
		Scanner sc = new Scanner(System.in);
		boolean run;
		run = true;
		int select, breadQuant;
		String breadName;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				System.out.print("주문 할 빵의 갯수 >>");
				breadQuant = Integer.parseInt(sc.nextLine());
				makeBread(breadQuant);
				break;
			case 2:
				System.out.print("주문 할 빵의 갯수 >>");
				breadQuant = Integer.parseInt(sc.nextLine());
				System.out.print("주문 할 빵의 종류 >>");
				breadName = sc.nextLine();
				makeBread(breadQuant, breadName);
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("잘못 된 입력입니다.");
				break;
			}// switch
		} // while
		System.out.println("종료합니다.");
		sc.close();
	}
}