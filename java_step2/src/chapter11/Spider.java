package chapter11;

public class Spider extends Animal3 {
	String web = "거미줄";
	public Spider() {
		this.setFeature("web");
	}
	@Override
	public int getEye() {
		return 8;
	}
	@Override
	public int getLeg() {
		return 8;
	}
}
