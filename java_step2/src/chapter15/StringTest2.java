package chapter15;

/*
 * 양 끝 공백 제거
 * */
public class StringTest2 {
	public static void main(String[] args) {
		String origin = "    Hello Java   ";//좌 4 우 3
		System.out.println(origin.strip());
	}
}