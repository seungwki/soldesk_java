package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import movieDAO.MovieDAO;
import movieVO.MovieReservation;
import movieVO.MovieVO;

public class FrameReservation extends JPanel {
	public FrameReservation(MovieVO movie) {
		// JPanel 구조
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);

		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700));
		top.setLayout(null);
		top.setSize(600, 300);
		top.setLocation(0, 0);

		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700));
		center.setLayout(new GridLayout(5, 8));
		center.setSize(600, 350);
		center.setLocation(0, 305);

		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700));
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 660);

		// 상단 JPanel 내용물
		JLabel img = new JLabel(new ImageIcon(movie.getImg()));// 포스터 가져옴
		img.setBounds(50, 15, 175, 248);

		JLabel name = new JLabel(movie.getName());// 이름 가져옴
		name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);

		// 현재 시간
		Choice movieTime = new Choice();
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("MM월 dd일(EE)");

		String str = dayTime.format(new Date(time));
		String[] timeSlot = { "시간대 선택", str + " 06:30~08:30", str + " 09:00~11:00", str + " 11:30~13:30",
				str + " 14:00~16:00", str + " 16:30~18:30", str + " 19:00~21:30", str + " 22:00~00:00",
				str + " 00:30~02:30" };

		for (int i = 0; i < timeSlot.length; i++) {
			movieTime.add(timeSlot[i]);
		}

		movieTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		movieTime.setSize(270, 200);
		movieTime.setLocation(260, 200);

		JLabel screen = new JLabel("[스   크   린]");
		screen.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		screen.setBounds(180, 223, 240, 120);
		screen.setVisible(false);

		// 중단 Panel TODO : 좌석 선택
		ButtonGroup seats = new ButtonGroup();
		final int seatNum = 40;// 불변
		JRadioButton[] seatChoice = new JRadioButton[seatNum];
		String[] seatRow = new String[8];
		for (int i = 0; i < seatRow.length; i++) {
			seatRow[i] = String.valueOf((i + 1));
		}
		String[] seatCol = new String[5];
		for (int i = 0; i < seatCol.length; i++) {
			seatCol[i] = String.valueOf((char) ('A' + i));
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				seatChoice[(i * 8) + j] = new JRadioButton(seatCol[i] + seatRow[j]);
				seats.add(seatChoice[(i * 8) + j]);
				center.add(seatChoice[(i * 8) + j]);
				seatChoice[(i * 8) + j].setVisible(false);
			}

		}

		JButton btnBack = new JButton("뒤로가기");

		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnBack);

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieInfo(movie));
			}
		});

		JButton btnHome = new JButton("처음 화면으로");

		btnHome.setBackground(new Color(0xA6A6A6));
		btnHome.setSize(183, 87);
		btnHome.setLocation(198, 0);
		btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnHome);

		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		JButton btnBuy = new JButton("결제하기");

		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnBuy);
		// 결제하기 버튼 유효성 체크
		btnBuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MovieReservation reservation = new MovieReservation();
				// 영화 이름, 시간 설정
				reservation.setName(movie.getName());
				reservation.setTime(movieTime.getSelectedItem());

				int seatIndex = -1;// 선택된 체크박스가 없을 경우 기본 값
				for (int i = 0; i < seatNum; i++) {
					if (seatChoice[i].isSelected()) {
						seatIndex = i;
					}
				}
				// 올바른 요소(시간, 좌석)가 선택되지 않았을 경우 예외 처리
				if (movieTime.getSelectedItem().equals("시간대 선택")) {
					JOptionPane.showInputDialog(null, "시간대를 선택해주세요.");
				} else if (seatIndex == -1) {
					JOptionPane.showInputDialog(null, "좌석을 선택해주세요.");
				} else {
					reservation.setSeat(seatChoice[seatIndex].getText());
					// 결제 성공 추가 예정
					FrameBase.getInstance(new FrameMoviePay(movie, reservation));
				}
			}
		});

		top.add(movieTime);
		top.add(img);
		top.add(name);
		top.add(screen);

		add(top);
		add(center);
		add(bottom);

		// 이미 등록한 예매에 대해 예외 처리
		movieTime.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				for (int i = 0; i < seatNum; i++) {
					seatChoice[i].setEnabled(true);
				}

				if (e.getItem().equals("시간대 선택")) {
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(false);
						screen.setVisible(false);
					}
				} else {
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(true);
						screen.setVisible(true);
					}
				}
				// 예매된 좌석 비활성화
				MovieDAO setSeat = new MovieDAO();
				for (int j = 0; j < seatNum; j++) {
					if (setSeat.dupSeat(movie.getName(), e.getItem().toString(), seatChoice[j].getText())) {
						seatChoice[j].setEnabled(false);
					}
				}
			}
		});
	}// 생성자
}