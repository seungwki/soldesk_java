package layout;

import java.awt.*;
import java.awt.event.*;

public class BtnTest2 {
	public static void main(String[] args) {
		// 후레임 생성
		Frame frame = new Frame("뻐튼 Test");
		frame.setBounds(800, 100, 1000, 500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

		// 버튼 생성
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");

		// 버튼 크기 변경
		btn1.setPreferredSize(new Dimension(200, 100));// layout을 사용하면 크기 지정에 Dimension 인스턴스를 만들어서 사용해야 한다.
		btn2.setPreferredSize(new Dimension(200, 100));
		btn3.setPreferredSize(new Dimension(200, 100));
		btn4.setPreferredSize(new Dimension(200, 100));

		// 버튼 추가
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener

		// 이벤트 감지자 EventDetector 등록
		btn1.addActionListener(actionListener);
		btn2.addActionListener(actionListener);
		btn3.addActionListener(actionListener);
		btn4.addActionListener(actionListener);
	}// main()

	static ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e); // e.toString()

			System.out.println("ActionCommand : " + e.getActionCommand());// 버튼 제목
			System.out.println("ID : " + e.getID()); // 동일
			System.out.println("Modifiers : " + e.getModifiers()); // 0
			System.out.println("Source : " + e.getSource()); // 정보
			System.out.println("When : " + e.getWhen()); // 무언가의 milli초

			if (e.getActionCommand().equals(1)) {
				System.out.println("button 1");
			} else if (e.getActionCommand().equals(2)) {
				System.out.println("button 2");
			} else if (e.getActionCommand().equals(3)) {
				System.out.println("button 3");
			} else if (e.getActionCommand().equals(4)) {
				System.out.println("button 4");
			}
			System.out.println("==========");
		}
	};
}