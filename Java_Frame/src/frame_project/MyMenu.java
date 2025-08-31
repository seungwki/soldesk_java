package frame_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Print Setup")) {
			System.out.println("프린트 셋업");
		} else if (e.getActionCommand().equalsIgnoreCase("CLOSE")) {
			System.out.println("종료");
			System.exit(0);
		}
	}
}
