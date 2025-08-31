package layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayout {
	// 멤버 변수 생성
	Frame frame = new Frame("My Border Layout");
	Button btn1 = new Button("Btn동");
	Button btn2 = new Button("Btn남");
	Button btn3 = new Button("Btn서");
	Button btn4 = new Button("Btn북");
	Button btn5 = new Button("Btn중");
	Button btn6 = new Button("Btn발");

	public MyBorderLayout() {
		// 템플릿 시작
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
			// 템플릿 종료
			// 프레임 레이아웃 설정
		frame.setLayout(new BorderLayout());
		// 버튼 추가
		frame.add(btn1, BorderLayout.EAST);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.NORTH);
		frame.add(btn5, BorderLayout.CENTER);
//		frame.add(btn6, "Center");
	}

	public static void main(String[] args) {
		new MyBorderLayout();
	}
}