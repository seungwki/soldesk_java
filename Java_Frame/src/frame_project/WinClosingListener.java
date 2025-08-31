package frame_project;

import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass {
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Not Closing.");
	}
}