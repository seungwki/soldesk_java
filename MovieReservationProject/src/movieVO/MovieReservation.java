package movieVO;

//개인 별 예매 정보 저장
public class MovieReservation {
	// 예매 정보
	String name;
	String time;
	String seat;

	public MovieReservation() {
	}

	public MovieReservation(String name, String time, String seat) {
		this.name = name;
		this.time = time;
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

}
