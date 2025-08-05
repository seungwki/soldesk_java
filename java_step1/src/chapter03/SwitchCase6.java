package chapter03;

//Advanced example5
//변수에 스위치 문법을 직접 넣는 것은 Java 버전에 따라 가능하다.(11에선 불가능, 14에선 가능. 일시적으로는 17로 변경하였다.)
//switch 문법의 경우 Java 버전이 높아질수록 작성이 편리해지는 변화가 발생했으므로 유의하면 좋다.
public class SwitchCase6 {
	public static void main(String[] args) {
		int day;
		String dayName;

		day = (int) (Math.random() * 7) + 1;
/*
		dayName = switch (day) {
		case 1 -> "월요일";
		case 2 -> "화요일";
		case 3 -> "수요일";
		case 4 -> "목요일";
		case 5 -> "금요일";
		case 6 -> "토요일";
		case 7 -> "일요일";
		default -> "wrong input";
		};
		System.out.println("오늘은 " + dayName + ".");
 */
	}
}