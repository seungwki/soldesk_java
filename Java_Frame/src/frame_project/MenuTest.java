package frame_project;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {
	public static void main(String[] args) {
		Frame frame = new Frame("Menu test");
		frame.setSize(300, 200);

		MenuBar menuBar = new MenuBar();

		// 메뉴바에 추가할 메뉴 생성 및 메뉴아이템 추가
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		// 메뉴 및 하위메뉴아이템 생성
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("Print Setup");
		MenuItem printPreview = new MenuItem("Print Preview");
		// 하위메뉴 추가
		print.add(printSetup);
		print.add(printPreview);
		// 메뉴 생성
		MenuItem miClose = new MenuItem("Close");
		// 메뉴아이템+메뉴 추가
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);// 얘는 아이템 아니라서 하위아이템들이 보임
		mFile.add(miClose);
		// 메뉴바에 메뉴들 추가
		menuBar.add(mFile);
		// 프레임에 메뉴바를 추가
		frame.setMenuBar(menuBar);
		// 마무리
		frame.setVisible(true);
		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener

		// MyMenu 이벤트 등록
		printSetup.addActionListener(new MyMenu());// 프셋 선택 시 프셋 출력
		miClose.addActionListener(new MyMenu());// 종료 선택 시 종료 실행
	}
}