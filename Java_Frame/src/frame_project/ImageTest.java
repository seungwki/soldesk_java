package frame_project;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ImageTest {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(null);
		frame.setBounds(500, 100, 750, 430);// 윈도우 사이즈

		ImageIcon img = new ImageIcon("pic.jpg");

		JLabel jl = new JLabel(img);
		jl.setBounds(10, 10, 730, 400);
		frame.add(jl);

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
		frame.setVisible(true);
	}
}