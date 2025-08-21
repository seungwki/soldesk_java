package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManager {
	List<Person> personList;

	public void personMgr() {
		Scanner sc = new Scanner(System.in);
		personList = new ArrayList<>();
		boolean run = true, deleted = false;
		String input;
		while (run) {
			showMenu();
			input = sc.nextLine();
			switch (input) {
			case "1":
				addPerson(sc);
				break;
			case "2":
				deletePerson(sc, deleted);
				break;
			case "3":
				showAllPerson();
				break;
			case "4":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
				break;
			}
		}

		sc.close();
	}

	private void showAllPerson() {
		System.out.println("--------전체정보--------");
		System.out.printf("등록인원 %d명\n", personList.size());
		for (Person person : personList) {
			System.out.println("이름 : " + person.getName());
			System.out.println("나이 : " + person.getAge());
			System.out.println("번호 : " + person.getTel());
			System.out.println("---------------------");
		}
	}

	private void deletePerson(Scanner sc, boolean deleted) {
		System.out.println("-----정보삭제-----");
		System.out.print("삭제할 이름 : ");
		String input = sc.nextLine();
		for (Person person : personList) {
			if (person.getName().equals(input)) {
				personList.remove(person);
				System.out.println(input + "의 정보를 삭제했습니다.");
				deleted = true;
				break;
			}
		}
		if (!deleted)
			System.out.println(input + "이 존재하지 않습니다.");
	}

	private void addPerson(Scanner sc) {
		Person newPerson = new Person();
		System.out.println("-----정보추가-----");
		System.out.print("이름 : ");
		newPerson.setName(sc.nextLine());
		System.out.print("나이 : ");
		newPerson.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("전화 : ");
		newPerson.setTel(sc.nextLine());
		personList.add(newPerson);
		System.out.println("정보가 저장되었습니다.");
		System.out.println("---------------------------------");
	}

	private void showMenu() {
		System.out.print("1. 회원추가\r\n" + "2. 회원탈퇴\r\n" + "3. 회원정보\r\n" + "4. 종  료\r\n" + "항목선택 : ");
	}
}