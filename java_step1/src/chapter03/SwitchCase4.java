package chapter03;
public class SwitchCase4 {
	public static void main(String[] args) {
		int num;
		num = (int)(Math.random()*6)+1;
		System.out.println("주사위 결과 : "+num);
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println(num+"점");
			break;
		default:
			System.out.println("wrong result");
			break;
		}
	}
}