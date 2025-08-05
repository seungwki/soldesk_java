package chapter03;

import javax.swing.JOptionPane;

public class IfExample08 {
	public static void main(String[] args) {
		//db의 데이터를 가져왔다고 가정하자.
		String id = "soldesk";
		int pw = 250729;
		
		//고객 input
		String inputId = JOptionPane.showInputDialog("ID?");
		int inputPw = Integer.parseInt(JOptionPane.showInputDialog("PW?"));
		
		if(id.equals(inputId)) {
			if(pw==inputPw) {
				System.out.println("Login Success.");
			}else {
				System.out.println("PW Error.");
			}
		}else {
			System.out.println("ID Error.");
		}
	}
}