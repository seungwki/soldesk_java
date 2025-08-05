package chapter03;

public class SwitchCase01 {
	public static void main(String[] args) {
		int ranking;
		char medalColor;
		ranking = 3;
		switch (ranking) {
		case 1:
			medalColor = 'g';
			break;
		case 2:
			medalColor = 's';
			break;
		case 3:
			medalColor = 'b';
			break;
		default:
			medalColor = 'a';
		}
		System.out.println("yout medal : " + medalColor);
	}
}
