package frame_project;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEventListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("X button pressed.");
		System.exit(0);//사용 권장하지 않음.
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Minimalized.");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Size rollbacked.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}