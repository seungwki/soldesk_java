package frame_project;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class TextFieldTest {
	public static void main(String[] args) {
		// 프레임 생성 및 설정
		Frame frame = new Frame();
		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setResizable(false);

		// 폰트 설정
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);

		// 북패널 생성
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);

		// 중앙 ta 생성
		TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setFont(font);
		textArea.setEnabled(false);

		// 남패널 생성
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.MAGENTA);

		// 북패널 입력 받을 텍스트필드 생성
		TextField textField = new TextField(10);// 입력상자의 길이를 입력하여 생성
		Button btn = new Button("입력");
		btn.setEnabled(false);// 버튼 비활성화

		// 남패널 버튼 생성
		Button btnSave = new Button("저장");
		Button btnClose = new Button("Dadghi");

		// 프레임에 요소 추가
		frame.add(pSouth, BorderLayout.SOUTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.add(pNorth, BorderLayout.NORTH);

		// 북패널에 요소 추가
		pNorth.add(textField);
		pNorth.add(btn);
		pNorth.setFont(font);

		// 남패널에 요소 추가
		pSouth.add(btnClose);
		pSouth.add(btnSave);

		// 기능 추가
		// Text Field에 컨텐츠가 생기면 입력 버튼을 활성화
		textField.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if (textField.getText().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});
		// tf -> (enter) -> ta
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					textArea.append(textField.getText() + "\n");
					textField.setText("");
					textField.requestFocus();
				}
			}
		});
		// tf -> (btn) -> ta
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append(textField.getText() + "\n");
				textField.setText("");
				textField.requestFocus();
			}
		});
		// 닫기 버튼으로 종료하기
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// esc 버튼으로 종료하기
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		// 저장 버튼 기능
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String content = textArea.getText();
				try {
					// FileDialog : 파일 save/load에 사용하는 대화상자.(보면 앎)
					FileDialog fileDialog = new FileDialog(frame, "저장", FileDialog.SAVE);
					fileDialog.setVisible(true);
					String path = fileDialog.getDirectory() + fileDialog.getFile();
					if (!content.equals("")) {
						// Stream으로 path 경로에 텍스트 저장
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);// 한글(==특수문자) 사용하므로 큰 단위로 받기 위해 사용
						bw.write(content);
						bw.close();
						if (fileDialog.getFile() != null) {
							JOptionPane.showMessageDialog(frame, path + "\n에 저장했읍니다.");
						}
					} else {// 기록할 내용이 없는 경우
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없읍니다.");
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
					e2.printStackTrace();
				}
			}
		});

		// 종료 버튼 활성화
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});// frame.addWindowListener
			// 마무리
		frame.setVisible(true);
	}
}
