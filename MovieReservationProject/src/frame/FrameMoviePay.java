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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import movieDAO.MovieDAO;
import movieVO.MovieReservation;
import movieVO.MovieVO;

public class FrameMoviePay extends JPanel {
	public FrameMoviePay(MovieVO movie, MovieReservation reservation) {
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);

		ImageIcon movieImg = new ImageIcon(movie.getImg());
		JLabel img = new JLabel(movieImg);
		img.setBounds(155, 13, 285, 350);
		add(img);

		TextArea story = new TextArea(
				"\n◎ 영화제목 : " + movie.getName() + "\n\n" + "◎ 영화시간 : " + reservation.getTime() + "\n\n" + "◎ 좌 석 : "
						+ reservation.getSeat() + "\n\n" + "◎ 금 액 : " + movie.getPrice() + "원",
				0, 0, TextArea.SCROLLBARS_NONE);

		story.setSize(580, 280);
		story.setLocation(0, 375);
		story.setBackground(new Color(0xFFD700));
		story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		add(story);

		JPanel bottomSet = new JPanel();
		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setLayout(null);
		bottomSet.setBackground(new Color(0xFFD700));

		JButton btnBack = new JButton("뒤로가기");
		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameReservation(movie));
			}
		});

		JButton btnBuy = new JButton("결제하기");
		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottomSet.add(btnBuy);

		btnBuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				new MovieDAO().addReservation(reservation);
				JOptionPane.showMessageDialog(null,
						"영화제목 : " + movie.getName()
						+"\n" + "영화시간 : "+ reservation.getTime()
						+ "\n" + "좌석 : "+ reservation.getSeat()
						+ "\n" + "금액 : " + movie.getPrice() + "원 입니다.");
				FrameBase.getInstance(new FrameBegin());
			}
		});

		add(bottomSet, BorderLayout.SOUTH);
	}
}
