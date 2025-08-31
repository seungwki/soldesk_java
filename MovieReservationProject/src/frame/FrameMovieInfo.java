package frame;

import java.awt.BorderLayout;
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

		TextArea story = new TextArea("\n◎영화제목" + "\n" + " " + movie.getName() + "\n\n" + "◎평 점" + "\n" + " "
				+ String.format("%.1f", movie.getScore()) + " / 5 점\n\n" + "◎줄 거 리" + "\n" + " " + movie.getStory(), 0,
				0, TextArea.SCROLLBARS_VERTICAL_ONLY);
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
					FrameBase.getInstance(new FrameMovieSelect2());
				}
			}

		});

		JButton btnHome = new JButton("처음 화면으로");
		btnHome.setBackground(new Color(0xA6A6A6));
		btnHome.setSize(183, 87);
		btnHome.setLocation(198, 0);
		btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnHome);

		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		JButton btnBuy = new JButton("예매하기");
		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnBuy);

		btnBuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 예매하기 추가 예정
//				FrameBase.getInstance(new FrameReservation(movie));
			}
		});

		add(bottomPanel, BorderLayout.SOUTH);
	}// 생성자

	private boolean isFirstPageMovie(String movieName) {
		String[] firstMovieList = { "라라랜드", "말할수없는비밀", "인사이드아웃", "겨울왕국" };
		for (int i = 0; i < firstMovieList.length; i++) {
			if (firstMovieList[i].equals(movieName)) {
				return true;
			}
		}
		return false;
	}
}
