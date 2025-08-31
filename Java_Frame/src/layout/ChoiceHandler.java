package layout;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//이벤트 분리 목적
public class ChoiceHandler implements ItemListener {
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = e.getItem().toString();
		System.out.println("Position >> " + str);
	} 
}