package frame;

import java.awt.*;
import javax.swing.*;

//싱글톤 패턴
public class FrameBase extends JFrame {
	private static FrameBase instance;

	public FrameBase(JPanel e) {
		// 시스템 화면 정보
		Toolkit tk = Toolkit.getDefaultToolkit();// static

		// 기본 JFrame 구조
		setTitle("영화 예매 프로그램");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, ((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 800);// 화면을 중앙에 띄우기
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void getInstance(JPanel e) {// 싱글톤 패턴
		if (instance == null) {
			instance = new FrameBase(e);
		} // null일 때만 new instance 생성
		else {
			instance.getContentPane().removeAll();// 기존 패널의 내용물의 삭제
			instance.getContentPane().add(e);// 새 창을 획득...?
			instance.revalidate();
			instance.repaint();
		}
	}
}