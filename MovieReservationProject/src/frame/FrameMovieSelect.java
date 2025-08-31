package frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import movieDAO.MovieDAO;
import movieVO.MovieVO;

public class FrameMovieSelect extends JPanel {
	public FrameMovieSelect() {
		// JPanel 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 2000);

		// 영화 목록 출력
		// 영화1의 정보
		String movieName1 = "라라랜드";
		ImageIcon movie1 = new ImageIcon("resource\\image\\" + movieName1 + ".png");
		JButton btnMovie1 = new JButton(movie1);
		btnMovie1.setName(movieName1);

		btnMovie1.setSize(185, 250);
		btnMovie1.setLocation(72, 30);
		add(btnMovie1);
		btnMovie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie1 = new MovieDAO().searchMovie(movieName1);
				FrameBase.getInstance(new FrameMovieInfo(movie1));
			}
		});
		// 영화2의 정보
		ImageIcon movie2 = new ImageIcon("resource\\image\\말할수없는비밀2.jpg");
		JButton btnMovie2 = new JButton(movie2);
		btnMovie2.setName("말할수없는비밀");

		btnMovie2.setSize(185, 250);
		btnMovie2.setLocation(320, 30);
		add(btnMovie2);
		btnMovie2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie2 = new MovieDAO().searchMovie("말할수없는비밀");
				FrameBase.getInstance(new FrameMovieInfo(movie2));
			}
		});
		// 영화3의 정보
		ImageIcon movie3 = new ImageIcon("resource\\image\\인사이드아웃.png");
		JButton btnMovie3 = new JButton(movie3);
		btnMovie3.setName("인사이드아웃");

		btnMovie3.setSize(185, 250);
		btnMovie3.setLocation(72, 340);
		add(btnMovie3);
		btnMovie3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie3 = new MovieDAO().searchMovie("인사이드아웃");
				FrameBase.getInstance(new FrameMovieInfo(movie3));
			}
		});
		// 영화4의 정보
		ImageIcon movie4 = new ImageIcon("resource\\image\\겨울왕국.png");
		JButton btnMovie4 = new JButton(movie4);
		btnMovie4.setName("겨울왕국");

		btnMovie4.setSize(185, 250);
		btnMovie4.setLocation(320, 340);
		add(btnMovie4);
		btnMovie4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie4 = new MovieDAO().searchMovie("겨울왕국");
				FrameBase.getInstance(new FrameMovieInfo(movie4));
			}
		});
		// 하단에 버튼 생성(패널에 버튼을 붙이고, 그 패널을 프레임에 붙일 예정)
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

		// "뒤로가기"버튼에 맵핑할 기능
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		JButton btnNext = new JButton("다음");

		btnNext.setBackground(new Color(0xA6A6A6));
		btnNext.setSize(183, 87);
		btnNext.setLocation(391, 0);
		btnNext.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnNext);

		// "다음" 버튼에 맵핑할 기능
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieSelect2());
			}
		});

		add(bottomPanel, BorderLayout.SOUTH);
	}// 생성자
}
