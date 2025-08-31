package frame_project;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame frame = new Frame("First Frame");
		frame.setBounds(800, 100, 400, 300);
		System.out.println(frame.getBounds().getWidth());//double로 반환
		System.out.println(frame.getBounds().height);
		frame.setBackground(Color.BLUE);
		frame.setVisible(true); //깜빡하는 흑우업재
	}
}