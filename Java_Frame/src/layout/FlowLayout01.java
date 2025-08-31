package layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout01 {
	// 멤버 변수 생성
	Frame frame = new Frame("뻐튼 Test");
	Button btn1 = new Button("Button1ㅂㅈㄷ");
	Button btn2 = new Button("Button2");
	Button btn3 = new Button("Button3");
	Button btn4 = new Button("Button4");
	Button btn5 = new Button("Button5");

	public FlowLayout01() {
		// 프레임 레이아웃 설정
		frame.setLayout(new FlowLayout());
		// 프레임 버튼 추가
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);

		// 후레임 설정
		frame.setBounds(200, 200, 400, 400);
		frame.setVisible(true);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
	}

	public static void main(String[] args) {
		new FlowLayout01();
	}
}