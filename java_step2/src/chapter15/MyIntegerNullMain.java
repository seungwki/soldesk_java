package chapter15;

public class MyIntegerNullMain {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 1, 7, 9, 2, 6, 3, 2 };
		int target = 3;
		System.out.println(findValue(arr, 3));
		System.out.println(findValue(arr, 51));
		// 기본형은 항상 값을 가져야한다.
		// 객체라면 null을 가질 수 있다
		// (사실 기본형은 선언만 하고 초기화 되지 않은 주소 공간을 가질 수 있긴하다)
		// 예시도 그렇고 설명도 그렇고 영 아리까리하다.
	}

	private static int findValue(int[] intArr, int target) {// target이 intArr이 있는지 체크하고, 있다면 target을 반환
		for (int value : intArr) {
			if (value == target) {
				return value;
			}
		}
		return -1;// 관습적인 표현이다. 찾지 못하거나 반환할 게 없을 경우 0 또는 -1을 사용하곤 한다.
	}
}