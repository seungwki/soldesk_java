package layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnTest1 {
	public static void main(String[] args) {
		// 후레임 생성
		Frame frame = new Frame("뻐튼 Test");
		frame.setBounds(200, 200, 400, 400);
		frame.setLayout(null);
		frame.setVisible(true);

		// 버튼 생성
		Button btnOk = new Button("OK");
		Button btnClose = new Button("Dad Ghi");

		// 버튼 설정
		btnOk.setBounds(70, 90, 100, 50);
		btnClose.setBounds(btnOk.getBounds());
		btnClose.setLocation(btnOk.getWidth() + btnOk.getX() + 60, btnOk.getY());

		// 버튼 추가
		frame.add(btnOk);
		frame.add(btnClose);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
	}
}