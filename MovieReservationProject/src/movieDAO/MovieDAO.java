package movieDAO;

import java.util.ArrayList;

import movieVO.MovieVO;
import movieVO.MovieReservation;

//영화 정보와 예매 현황 관리
public class MovieDAO {
	// 영화 정보 리스트, 예매 정보 리스트
	private static ArrayList<MovieVO> movieList;
	private static ArrayList<MovieReservation> reserveList;

	public MovieDAO() {
		if (movieList == null) {
			init();
		}
		if (reserveList == null) {
			reserveList = new ArrayList<MovieReservation>();
		}
	}

	// 처음에 1번만 실행하는 메서드
	private void init() {
		movieList = new ArrayList<MovieVO>();
//영화1
		movieList.add(new MovieVO("라라랜드", 10000, 5,
				"황홀한 사랑, 순수한 희망, 격렬한 열정... " + "이 곳에서 모든 감정이 폭발한다! 꿈을 꾸는 사람들을 위한 별들의 도시 '라라랜드'. 재즈 피아니스트 "
						+ "'세바스찬'(라이언 고슬링)과 배우 지망생 '미아'(엠마 스톤) 인생에서 가장 빛나는 순간 만난 " + "두 사람은 미완성인 서로의 무대를 만들어가기 시작한다.",
				"5점\t<이정용>\t감동적 입니다. 쥬륵..\n", "resource\\image\\라라랜드2.png"));

//영화2
		movieList.add(new MovieVO("말할수없는비밀", 10000, 5,
				"나는 너를 사랑해!너도 나를 사랑하니? " + "예술학교로 전학 온 상륜(주걸륜)은 아버지의 영향을 받아 피아노에 천부적인 소질을 보인다. "
						+ "학교를 둘러보던 중, 신비스러운 피아노 연주가 흘러나오는 옛 음악실을 발견하게 되고, "
						+ "그곳에서 샤오위(계륜미)를 만난다. 그들은 아름다운 피아노 선율처럼 즐거운 시간을 보내고, "
						+ "둘 사이에는 애틋한 마음이 싹튼다. 그러나 상륜이 샤오위를 더 알고 싶어할 때마다 그녀는 비밀이라고 "
						+ "일관하며 의미심장한 미소만 짓는다. 그러던 어느 날, 샤오위는 상륜이 같은 반 여학생 칭요와 뽀뽀하는 " + "모습을 보게 되고, 그의 곁에서 사라지는데…",
				"5점\t<김현진>\t피아노 배틀장면이 인상적이었습니다...☆\n", "resource\\image\\말할수없는비밀2.jpg"));

//영화3
		movieList.add(new MovieVO("인사이드아웃", 10000, 4,
				"괜찮아, 다 잘 될 거야! 우리가 행복하게 만들어 줄게.모든 사람의 머릿속에 존재하는 감정 컨트롤 본부 "
						+ "그곳에서 불철주야 열심히 일하는 기쁨, 슬픔, 버럭, 까칠, 소심 다섯 감정들. 이사 후 새로운 환경에 "
						+ "적응해야 하는 '라일리'를 위해 그 어느 때 보다 바쁘게 감정의 신호를 보내지만 우연한 실수로 '기쁨'과 "
						+ "'슬픔'이 본부를 이탈하게 되자 '라일리'의 마음 속에 큰 변화가 찾아온다. '라일리'가 예전의 모습을 "
						+ "되찾기 위해서는 '기쁨'과 '슬픔'이 본부로 돌아가야만 한다! 그러나 엄청난 기억들이 저장되어 있는 "
						+ "머릿속 세계에서 본부까지 가는 길은 험난하기만 한데… 과연, '라일리'는 다시 행복해질 수 있을까? "
						+ "지금 당신의 머릿속에서 벌어지는 놀라운 일! 하루에도 몇번씩 변하는 감정의 비밀이 밝혀진다!",
				"4점\t<박지은>\t애니메이션을 보고 운건 처음이라능...눙물\n", "resource\\image\\인사이드아웃2.png"));

//영화4
		movieList.add(new MovieVO("겨울왕국", 10000, 5,
				"얼어붙은 세상을 녹일 자매가 온다! 서로가 최고의 친구였던 자매 '엘사'와 '안나'. 하지만 언니 "
						+ "'엘사'에게는 하나뿐인 동생에게조차 말 못할 비밀이 있다. 모든 것을 얼려버리는 신비로운 힘이 바로 그것. "
						+ "'엘사'는 통제할 수 없는 자신의 힘이 두려워 왕국을 떠나고, 얼어버린 왕국의 저주를 풀기 위해 '안나'는 " + "언니를 찾아 환상적인 여정을 떠나는데……",
				"5점\t<배정수>\t똑똑똑, 나랑 눈사람 만들래?\n", "resource\\image\\겨울왕국2.png"));

//영화5
		movieList.add(new MovieVO("당신거기있어줄래요", 10000, 2,
				"인생을 뒤바꾼 기적 같은 10번의 기회. 넌 30년 전의 나고, 난 30년 후의 너야. 2015년 현재 간절히 바라는 소원이 있습니까? "
						+ "현재의 수현(김윤석)은 의료 봉사 활동 중 한 소녀의 생명을 구하고 소녀의 할아버지로부터 신비로운 10개의 알약을 답례로 받는다. "
						+ "호기심에 알약을 삼킨 수현은 순간 잠에 빠져들고 다시 눈을 떴을 때, 30년 전 과거의 자신과 마주하게 된다. 그 때로 돌아간다면… 지금의 내 인생도 바뀔 수 있을까요?",
				"2점\t<그녀석>\t로맨스 꺼져\n", "resource\\image\\당신거기있어줄래요2.png"));

//영화6
		movieList.add(new MovieVO("스파이더맨", 10000, 4,
				"전세계를 사로잡은 영웅, 그러나 아무도 몰랐던 그의 이야기. 어릴적 사라진 부모 대신 삼촌 내외와 살고 있는 피터 파커(앤드류 가필드)는 "
						+ "여느 고등학생처럼 평범한 학교 생활을 하며 일상을 보내고, 같은 학교 학생 그웬 스테이시(엠마 스톤)와 첫사랑에 빠져 우정과 사랑, "
						+ "그리고 둘 만의 비밀을 키워나간다. 그러던 어느 날 아버지가 사용했던 비밀스러운 가방을 발견하고 부모님의 실종사건에 대한 의심을 "
						+ "품게 된 그는 그 동안 숨겨져 왔던 과거의 비밀을 추적하게 된다. 아버지의 옛 동료 코너스 박사(리스 이판)의 실험실을 찾아가게 된 "
						+ "피터는 우연한 사고로 특별한 능력을 갖게 되고, 뜻밖의 피터의 도움으로 연구를 완성한 코너스 박사는 자신의 숨겨진 자아인 악당 "
						+ "'리자드'를 탄생시킨다. 세상을 위협하는 세력앞에 피터는 그의 인생을 통째로 바꾸어 버릴 일생일대의 선택, 바로 '스파이더맨'이라 "
						+ "불리우는 영웅이 되기로 결심하는데… 2012년 6월 28일, 스파이더맨의 숨겨진 비밀이 마침내 밝혀진다!",
				"4점\t<양현정>\t앤드류가필드 존잘존멋 9ㅅ9\n", "resource\\image\\스파이더맨2.png"));
//영화7
		movieList.add(new MovieVO("어벤져스", 10000, 4,
				"어벤져스는 끝났다! 희망은 없다! 쉴드의 숙적 히드라는 연구를 통해 새로운 능력자 막시모프 남매를 탄생시키고, 히드라의 기지를 "
						+ "공격하는 도중 토니 스타크는 완다 막시모프의 초능력으로 인해 자신이 가장 두려워하는 미래를 보게 된다. 이에 '뉴욕전쟁' 때와 "
						+ "같은 사태가 벌어지지 않도록 스타크는 배너 박사와 함께 지구를 지킬 최강의 인공지능 울트론을 탄생시키게 되지만, 울트론은 예상과 "
						+ "다르게 지배를 벗어나 폭주하기 시작하는데...",
				"4점\t<김민재>\t나의 영웅 내 장래희망\n", "resource\\image\\어벤져스2.png"));
//영화8
		movieList.add(new MovieVO("부산행", 10000, 5,
				"전대미문의 재난이 대한민국을 덮친다! 정체불명의 바이러스가 전국으로 확산되고 대한민국 긴급재난경보령이 선포된 가운데, "
						+ "열차에 몸을 실은 사람들은 단 하나의 안전한 도시 부산까지 살아가기 위한 치열한 사투를 벌이게 된다. 서울에서 부산까지의 거리 "
						+ "442KM 지키고 싶은, 지켜야만 하는 사람들의 극한의 사투!",
				"5점\t<한의희>\t공유로 시작해서 공유로 끝난 영화\n", "resource\\image\\부산행2.png"));
	}

	// 이름으로 영화 정보 찾기
	public MovieVO searchMovie(String name) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(name)) {
				return movieList.get(i);
			}
		}
		return null;
	}

	// 예매 정보 리스트에 방금 예매한 정보 등록하는 메서드
	public void addReservation(MovieReservation e) {
		reserveList.add(new MovieReservation(e.getName(), e.getTime(), e.getSeat()));
	}

	// 이미 예매 된 정보인지 검색
	public boolean dupSeat(String name, String time, String seat) {
		for (int i = 0; i < reserveList.size(); i++) {
			if (reserveList.get(i).getName().equals(name) && reserveList.get(i).getTime().equals(time)
					&& reserveList.get(i).getSeat().equals(seat)) {
				return true;
			} // if
		} // for
		return false;
	}

	// review 작성
	public void inputReview(String movieName, String reviewerName, String reviewContents, int score) {
		MovieVO thisMovie;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(movieName)) {
				thisMovie = movieList.get(i);
				thisMovie.setReviewrName(reviewerName);//
				thisMovie.setReviewShort(reviewContents);
				thisMovie.setLatestScore(score);
				thisMovie.setTotal(score);
				thisMovie.setReviewCount();
				thisMovie.setScore();
				thisMovie.setReview();
			}
		}
	}
}