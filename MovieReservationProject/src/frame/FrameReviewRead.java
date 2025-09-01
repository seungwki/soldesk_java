package frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import movieVO.MovieVO;

public class FrameReviewRead extends JFrame {
	// 리뷰 볼 영화의 정보(MovieVO)를 파라미터로 받음
	public FrameReviewRead(MovieVO movie) {
		// 후기 가져옴
		String reviewContent = movie.getReview();
		// 후기 출력(Text Area)
		TextArea reviewShow = new TextArea("평점\t이름\t\t\t한줄평\n", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		reviewShow.setEditable(false);
		reviewShow.append(reviewContent);
		reviewShow.setSize(800, 300);
		reviewShow.setLocation(700, 200);
		reviewShow.setFont(new Font("맑은고딕", Font.BOLD, 18));
		// 새 서브프레임 구현
		Frame fr = new Frame();
		fr.setTitle(movie.getName() + "의 리뷰");// 영화 제목으로 창 제목 설정
		fr.setSize(800, 300);
		fr.setLocation(700, 200);

		fr.add(reviewShow);
		fr.setVisible(true);
		// 팝업창처럼 띄운걸 제거
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				fr.setVisible(false);
				fr.dispose();// 서브프레임만 종료
			}
		});
	}// 생성자
}