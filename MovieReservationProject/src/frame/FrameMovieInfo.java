package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import movieVO.MovieVO;

public class FrameMovieInfo extends JPanel {
//
	public FrameMovieInfo(MovieVO movie) {
		// JPanel 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 2000);

		// 포스터 부분
		JLabel img = new JLabel(new ImageIcon(movie.getImg()));
		img.setBounds(50, 13, 285, 350);
		add(img);

		// 영화 관련 정보 텍스트
		TextArea story = new TextArea(movie.getStory(), 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		story.setSize(580, 280);
		story.setLocation(0, 375);
		story.setBackground(new Color(0xFFD700));
		story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		add(story);

		JButton btnReview = new JButton("리뷰 보기");
		btnReview.setBackground(new Color(229, 216, 92));
		btnReview.setSize(150, 40);
		btnReview.setLocation(400, 325);
		btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));

		// 리뷰 보기 기능 구현
		btnReview.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 리뷰 보기 추가 예정
			}
		});
		add(btnReview);

		// 하단 버튼
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 660, 600, 100);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("뒤로가기");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnBack);

		// 영화 이름으로 뒤로가기 판단
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String movieName = movie.getName();
				if (isFirstPageMovie(movieName)) {
					FrameBase.getInstance(new FrameMovieSelect());
				} else {
					FrameBase.getInstance(new FrameMovieSelect());
				}
			}

			private boolean isFirstPageMovie(String movieName) {
				return false;
			}
		});
	}// 생성자
}
