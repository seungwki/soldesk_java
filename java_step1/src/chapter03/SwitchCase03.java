package chapter03;
import javax.swing.JOptionPane;
public class SwitchCase03 {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("1~4"));
		
		switch (num) {
		case 1:
			System.out.println("예금 조회");
			break;
		case 2:
			System.out.println("입금");
			break;
		case 3:
			System.out.println("출금");
			break;
		case 4:
			System.out.println("송금");
			break;
		default:
			System.out.println("잘못 된 입력");
			break;
		}
	}
}