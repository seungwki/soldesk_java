package chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		map.put(new Student(4, "하동길"), 98);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(3, "서주희"), 90);
		map.put(new Student(2, "김민주"), 85);

		String input, name;
		int stdNo;
		Set<Student> keySet = map.keySet();
		System.out.println("총 Entry 수 : " + map.size());
		for (Student std : keySet) {
			System.out.println(std.toString() + " : " + map.get(std));
		}
		System.out.println();
		while (true) {
			System.out.print("학생 번호를 입력하세요 (종료하려면 -1 입력) : ");
			input = sc.nextLine();
			Student temp;
			if (input.equals("-1")) {
				System.out.println("종료 합니다.");
				break;
			} else if (isNumeric(input)) {
				stdNo = Integer.parseInt(input);
				System.out.print("학생 이름을 입력하세요 : ");
				name = sc.nextLine();
				temp = new Student(stdNo, name);
				if (map.containsKey(temp)) {
					System.out.println(name + " 학생의 점수는 : " + map.get(temp));
				} else {
					System.out.println("해당 학생의 데이터가 존재하지 않습니다.");
				}
			} else {
				System.out.println("잘못 된 입력입니다.");
			}
		}
		sc.close();
	}

	private static boolean isNumeric(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}