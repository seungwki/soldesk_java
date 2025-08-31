package layout;

import java.awt.*;
import java.awt.event.*;

//Drop down 예제
public class BtnTest4 {
	public static void main(String[] args) {
		Frame frame = new Frame("Dropdown Example");
		frame.setSize(500, 250);
		frame.setLocation(400, 100);
		frame.setVisible(true);
		frame.setLayout(null);

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WEN");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(150, 0);// Layout == null 이라면 크기를 숫자로 냅다 박을 수 있다.
		//== 사이즈를 설정하려면 자동 배치(layout)을 사용하지 않아야 한다.
		day.setLocation(40, 100);

		//항목 선택 시 발생하는 리스너
		day.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("day : " + day.getSelectedItem());
			}
		});

		// Add Components on frame
		frame.add(day);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
	}// main()
}