package chapter14;

public class EqualsMain2 {
	public static void main(String[] args) {
		User2 user1 = new User2("010-2373-7904");
		User2 user2 = new User2("010-2373-7904");

		// 물리적 동일성
		if (user1 == user2) {
			System.out.println("These are Physically same.");
		} else
			System.out.println("These are physically not same.");
		// 논리적 동일성
		if (user1.equals(user2)) {
			System.out.println("These are logically same.");
		} else
			System.out.println("These are logically not same.");
		// 논리적 동일성이 같다고 나온다.

	}
}
