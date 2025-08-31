package frame_project;

import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String[] args) {
		JFrame fr = new JFrame();
		fr.setSize(500, 500); //사이즈
		fr.setLocation(-400, 100); //좌표

		//창 닫기
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 4
		fr.setVisible(true);
		
		//하나의 프레임만 종료
		fr.dispose();
	}
}