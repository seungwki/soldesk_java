package layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnTest6 {
	public static void main(String[] args) {
		Frame frame = new Frame("Button Test 6");
//		frame.setBounds(600, 600, 600, 600);//무의미
		// Button Array
		Button[] btnArr = new Button[5];
		String[] btnTitles = { "닫기", "열기", "취소", "확인", "(인사)" };
		for (int i = 0; i < btnArr.length; i++) {
			btnArr[i] = new Button(btnTitles[i]);
		}
		frame.pack();// 프레임에 내용이 있다면 프레임의 크기를 내용에 맞춤.(AutoSize)
		frame.setVisible(true);
		// Frame도 Comp의 위치를 정할 수 있다.
		frame.add(btnArr[0], BorderLayout.EAST);
		frame.add(btnArr[1], BorderLayout.WEST);
		frame.add(btnArr[2], BorderLayout.SOUTH);
		frame.add(btnArr[3], BorderLayout.NORTH);
		frame.add(btnArr[4], BorderLayout.CENTER);

		// "닫기" 버튼에 기능 추가
		btnArr[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
	}
}