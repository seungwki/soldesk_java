package chapter15;

public class StringSplitJoinMain {
	public static void main(String[] args) {
		// split
		String str = "Apple,Banana,Orange";
		String[] strArr = str.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		// join
		String strJoin = String.join("-", "A", "B", "C", "D", strArr[2]);
		System.out.println(strJoin);
		strJoin = String.join("&", strArr);
		System.out.println(strJoin);

	}
}