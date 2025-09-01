package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBegin extends JPanel {
	// 프로젝트 내내 생성자 안에서 할거 다 하고 그걸 실행하면서 "호출"하는 식으로 만들 예정
	public FrameBegin() {
		// JPanel 구조
		setBackground(new Color(123, 45, 67));
		setLayout(null);
		setSize(600, 800);

		// 포스터 이미지 띄워주기
		ImageIcon cinema = new ImageIcon("resource\\image\\MSG.jpg");
		JLabel lblCinema = new JLabel(cinema);

		lblCinema.setSize(600, 620);
		lblCinema.setLocation(-15, 0);
		add(lblCinema);

		// 버튼 생성
		Font font = new Font("굴림", Font.BOLD, 26);
		JButton btnInfo = new JButton("영화 예매");
		JButton btnPost = new JButton("영화 평가");

		btnInfo.setBackground(new Color(183, 240, 117));
		btnInfo.setSize(300, 150);
		btnInfo.setLocation(((int) getSize().getWidth() / 2 - 310), (int) getLocation().getY() / 2 + 610);
		btnInfo.setFont(font);

		btnPost.setBackground(new Color(183, 240, 117));
		btnPost.setSize(300, 150);
		btnPost.setLocation(btnInfo.getX() + 300, btnInfo.getY());
		btnPost.setFont(font);

		add(btnInfo);
		add(btnPost);

		btnInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 영화 예매 페이지로 연결
				FrameBase.getInstance(new FrameMovieSelect());
			}
		});
		btnPost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 영화 후기 페이지로 연결
				FrameBase.getInstance(new FrameReviewBoard());
			}
		});
	}// 생성자
}