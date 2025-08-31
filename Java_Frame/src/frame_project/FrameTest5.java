package frame_project;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest5 {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
//		myFrame.addWindowListener(new MyEventListener());
//		myFrame.addWindowListener(new WinClosingListener());
		myFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("adaptor detected.");
				System.exit(0);
			}
		});
	}
}