package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import movieDAO.MovieDAO;
import movieVO.MovieVO;

public class FrameMovieSelect2 extends JPanel {
	public FrameMovieSelect2() {
		// JPanel 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 2000);

		// 영화 목록 출력
		// 영화5의 정보
		String movieName5 = "당신거기있어줄래요";
		ImageIcon movie1 = new ImageIcon("resource\\image\\" + movieName5 + ".png");
		JButton btnMovie1 = new JButton(movie1);
		btnMovie1.setName(movieName5);

		btnMovie1.setSize(185, 250);
		btnMovie1.setLocation(72, 30);
		add(btnMovie1);
		btnMovie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie1 = new MovieDAO().searchMovie(movieName5);
				FrameBase.getInstance(new FrameMovieInfo(movie1));
			}
		});
		// 영화2의 정보
		String movieName6 = "스파이더맨";
		ImageIcon movie6 = new ImageIcon("resource\\image\\" + movieName6 + ".png");
		JButton btnMovie6 = new JButton(movie6);
		btnMovie6.setName(movieName6);

		btnMovie6.setSize(185, 250);
		btnMovie6.setLocation(320, 30);
		add(btnMovie6);
		btnMovie6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie6 = new MovieDAO().searchMovie(movieName6);
				FrameBase.getInstance(new FrameMovieInfo(movie6));
			}
		});
		// 영화7의 정보
		String movieName7 = "어벤져스";
		ImageIcon movie7 = new ImageIcon("resource\\image\\" + movieName7 + ".png");
		JButton btnMovie7 = new JButton(movie7);
		btnMovie7.setName(movieName7);

		btnMovie7.setSize(185, 250);
		btnMovie7.setLocation(72, 340);
		add(btnMovie7);
		btnMovie7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie7 = new MovieDAO().searchMovie(movieName7);
				FrameBase.getInstance(new FrameMovieInfo(movie7));
			}
		});
		// 영화8의 정보
		String movieName8 = "부산행";
		ImageIcon movie8 = new ImageIcon("resource\\image\\" + movieName8 + ".png");
		JButton btnMovie8 = new JButton(movie8);
		btnMovie8.setName("겨울왕국");

		btnMovie8.setSize(185, 250);
		btnMovie8.setLocation(320, 340);
		add(btnMovie8);
		btnMovie8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieVO movie8 = new MovieDAO().searchMovie(movieName8);
				FrameBase.getInstance(new FrameMovieInfo(movie8));
			}
		});
		// 하단에 버튼 생성(패널에 버튼을 붙이고, 그 패널을 프레임에 붙일 예정)
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 660, 600, 100);
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("이전 페이지");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnBack);

		// "뒤로가기"버튼에 맵핑할 기능
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieSelect());
			}
		});

		JButton btnHome = new JButton("처음화면");

		btnHome.setBackground(new Color(0xA6A6A6));
		btnHome.setSize(183, 87);
		btnHome.setLocation(391, 0);
		btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomPanel.add(btnHome);

		// "다음" 버튼에 맵핑할 기능
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});
		
		add(bottomPanel, BorderLayout.SOUTH);
		
	}// 생성자
}