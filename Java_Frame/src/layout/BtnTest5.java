package layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BtnTest5 {
	public static void main(String[] args) {
		Frame frame = new Frame("Btn test5, Area Selection");
		frame.setBounds(400, 400, 800, 600);
//		frame.isResizable(false);
		frame.setLayout(null);

		Choice region = new Choice();
		region.add("Select region");
		region.add("서울");
		region.add("경기");
		region.add("인천");
		region.add("대전");
		region.add("광주");
		region.add("대구");
		region.add("부산");

		region.setSize(100, 0);
		region.setLocation(50, 100);

		region.addItemListener(new ChoiceHandler());

		frame.add(region);
		frame.setVisible(true);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
	}
}