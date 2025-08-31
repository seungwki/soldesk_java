package layout;

import java.awt.*;
import java.awt.event.*;

public class BtnTest3 {
	public static void main(String[] args) {
		// 후레임 생성
		Frame frame = new Frame("Btn Test 3");
		frame.setBounds(800, 100, 1000, 500);
		frame.setVisible(true);

		// 프레임 레이아웃 설정
		frame.setLayout(new FlowLayout());

		// Component 생성
		Label label1 = new Label("1. GwanSim Bunya is what?");
		Label label2 = new Label("2. 한 달 영화 관람 횟수??");

		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movie = new Checkbox("movie");
		Checkbox music = new Checkbox("music");

		CheckboxGroup groupMovie = new CheckboxGroup();
		Checkbox oneInMonth = new Checkbox("1 회", groupMovie, true);
		Checkbox twoInMonth = new Checkbox("2 회", groupMovie, false);
		Checkbox threeInMonth = new Checkbox("3 회", groupMovie, false);
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		label1.setFont(font);
		label2.setFont(font);

		// Add components on frame
		frame.add(label1);
		frame.add(news);
		frame.add(sports);
		frame.add(movie);
		frame.add(music);

		frame.add(label2);
		frame.add(oneInMonth);
		frame.add(twoInMonth);
		frame.add(threeInMonth);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener

//		/*
		// Radio Btn selection detecting
		oneInMonth.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Watching movie once in month");
			}
		});
		twoInMonth.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Watching movie twice in month");
			}
		});
		threeInMonth.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Watching movie 3 times in month");
			}
		});

		// Checkbox Selection detecting
		news.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getStateChange() == 1 ? "news Selected" : "news Unselected";
				System.out.println(str);
			}
		});
//		 */
	}// main()
}