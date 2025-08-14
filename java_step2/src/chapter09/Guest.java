package chapter09;

public class Guest {
	private String name;
	private String gender;
	//Guide.point : 관광지, 장소
	public String getPoint() {
		return Guide.point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}