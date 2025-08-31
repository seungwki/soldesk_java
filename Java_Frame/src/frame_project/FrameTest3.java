package frame_project;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest3 {
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setSize(400, 500);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();

		int monitorWidth = di.width;
		int monitorHeight = di.height;
		int x = (monitorWidth - fr.getWidth()) / 2;
		int y = (monitorHeight - fr.getHeight()) / 2;
		fr.setLocation(x, y);
		fr.setVisible(true);
	}
}